package ir.noteapp.Service;

import ir.noteapp.Model.Notes;
import ir.noteapp.Repo.NoteRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepo noteRepo;

    public NoteServiceImpl(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }
    @Override
    public void saveNote(Notes notes){
        noteRepo.save(notes);
    }
    @Override
    public Page<Notes> getAllNotes(Pageable pageable){
        return noteRepo.findAll(pageable);
    }

    @Override
    public Notes getbyId(int id) {
        return noteRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("todo.not.found"));
    }

    @Override
    public void deleteNote(int id){
        noteRepo.deleteById(id);
    }
}
