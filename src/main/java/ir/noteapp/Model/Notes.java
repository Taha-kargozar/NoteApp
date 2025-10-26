package ir.noteapp.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Notes {
    private String titleNote;
    private int idNote;
    private String contentNote;
    private LocalDateTime DateCreated;

    public String getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(String title) {
        this.titleNote = title;
    }
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdNote() {
        return idNote;
    }

    public void setIdNote(int idNote) {
        this.idNote = idNote;
    }

    public String getContentNote() {
        return contentNote;
    }

    public void setContentNote(String content) {
        this.contentNote = content;
    }
@CreationTimestamp
    public LocalDateTime getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        DateCreated = dateCreated;
    }
}
