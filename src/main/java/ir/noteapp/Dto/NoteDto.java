package ir.noteapp.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NoteDto (
        @NotBlank(message = "titleNote.is.blank")
        String titleNote,
        @NotNull(message = "contentNote.is.null")
        String contentNote
) {}
