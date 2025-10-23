package ir.noteapp.Service;

import ir.noteapp.Model.Notes;
import ir.noteapp.NoteApp;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface NoteService {

    void saveNote(Notes notes);

    void deleteNote(int id);

    Page<Notes> getAllNotes(Pageable pageable);

    Notes getbyId(int id);
}
