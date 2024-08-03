package com.LibraryManagementSystem.libraryManagementSystem.Controller;

import com.LibraryManagementSystem.libraryManagementSystem.DTO.AuthorDTO;
import com.LibraryManagementSystem.libraryManagementSystem.DTO.AuthorSaveDTO;
import com.LibraryManagementSystem.libraryManagementSystem.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("LibraryManegement")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping(path = "save")
    public ResponseEntity<?> SaveAuhtor(@RequestBody AuthorSaveDTO authorSaveDTO){

        String authorName = authorService.SaveAuthor(authorSaveDTO);
        if (authorName != null){
            return new ResponseEntity<>("Author Save Sucessfully", HttpStatus.CREATED);
        }
        else
            return new ResponseEntity<>("Something goes worng ",HttpStatus.BAD_REQUEST);
    }
    @GetMapping(path = "GetAllAuthor")
    public List<AuthorDTO>  AddAuthor(){

        List<AuthorDTO> addauthor = authorService.AddAuthor();

        return addauthor;


    }
}
