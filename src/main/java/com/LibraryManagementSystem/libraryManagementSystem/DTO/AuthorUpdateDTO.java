package com.LibraryManagementSystem.libraryManagementSystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorUpdateDTO {
    private int authorId;
    private String name;

}
