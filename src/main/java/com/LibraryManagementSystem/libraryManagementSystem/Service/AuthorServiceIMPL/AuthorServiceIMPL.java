package com.LibraryManagementSystem.libraryManagementSystem.Service.AuthorServiceIMPL;

import com.LibraryManagementSystem.libraryManagementSystem.DTO.AuthorDTO;
import com.LibraryManagementSystem.libraryManagementSystem.DTO.AuthorSaveDTO;
import com.LibraryManagementSystem.libraryManagementSystem.Entity.Author;
import com.LibraryManagementSystem.libraryManagementSystem.Repo.AuthorRepo;
import com.LibraryManagementSystem.libraryManagementSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AuthorServiceIMPL implements AuthorService {

    @Autowired
    private AuthorRepo authorRepo;
    @Override
    public String SaveAuthor(AuthorSaveDTO authorSaveDTO) {

        Author author = new Author(
        authorSaveDTO.getName()
        );
        authorRepo.save(author);

        return author.getName();
    }

    @Override
    public List<AuthorDTO> AddAuthor() {

        List<Author> getAuhtor = authorRepo.findAll();
        List<AuthorDTO> authorDTOList = new ArrayList<>();

        for (Author author:getAuhtor){
            AuthorDTO authorDTO = new AuthorDTO(author.getAuthorId(),author.getName());

            authorDTOList.add(authorDTO);
        }
        return authorDTOList;
    }


}
