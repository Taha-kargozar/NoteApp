package ir.noteapp.Repo;

import ir.noteapp.Model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepo extends JpaRepository<Notes,Integer> {

}
