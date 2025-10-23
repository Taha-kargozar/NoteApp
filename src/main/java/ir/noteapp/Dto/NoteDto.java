package ir.noteapp.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record NoteDto (
        @NotBlank(message = "title.is.blank")
        String title,
        @NotNull(message = "content.is.null")
        String content
) {}
