package com.LibraryManagementSystem.libraryManagementSystem.Repo;

import com.LibraryManagementSystem.libraryManagementSystem.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository <Author,Integer>{
}
