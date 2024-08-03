package com.LibraryManagementSystem.libraryManagementSystem.Service;

import com.LibraryManagementSystem.libraryManagementSystem.DTO.AuthorDTO;
import com.LibraryManagementSystem.libraryManagementSystem.DTO.AuthorSaveDTO;

import java.util.List;

public interface AuthorService {
    String SaveAuthor(AuthorSaveDTO authorSaveDTO);


    List<AuthorDTO> AddAuthor();
}
