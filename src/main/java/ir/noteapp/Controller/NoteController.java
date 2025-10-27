package ir.noteapp.Controller;

import ir.noteapp.Dto.NoteDto;
import ir.noteapp.Model.Notes;
import ir.noteapp.Service.NoteService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/note")
public class NoteController {
       private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }
    @PostMapping("/add")
    public ResponseEntity<Integer> save(@RequestBody @Valid NoteDto noteDto) {
        Notes notes = new Notes();
        notes.setTitleNote(noteDto.titleNote());
        notes.setContentNote(noteDto.contentNote());
        noteService.saveNote(notes);
        return ResponseEntity.ok(notes.getIdNote());
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        noteService.deleteNote(id);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/all")
    public ResponseEntity<Page<Notes>> all(Pageable pageable){
        Page<Notes> notesPage = noteService.getAllNotes(pageable);
        return ResponseEntity.ok(notesPage);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Integer> update(@PathVariable int id ,@RequestBody @Valid NoteDto noteDto) {
        Notes notes = noteService.getbyId(id);
        notes.setContentNote(noteDto.contentNote());
        notes.setTitleNote(noteDto.titleNote());
        noteService.saveNote(notes);
        return ResponseEntity.ok().body(notes.getIdNote());
    }
    @GetMapping("/findbyId/{id}")
    public ResponseEntity<Notes> findbyId(@PathVariable int id) {
        Notes notes = noteService.getbyId(id);
        return ResponseEntity.ok(notes);
    }
}
