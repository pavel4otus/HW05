package ru.pavel2107.otus.hw05.repository.jdbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.shell.jline.InteractiveShellApplicationRunner;
import org.springframework.shell.jline.ScriptShellApplicationRunner;
import ru.pavel2107.otus.hw05.domain.Author;
import ru.pavel2107.otus.hw05.repository.AuthorRepository;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(properties = {
        InteractiveShellApplicationRunner.SPRING_SHELL_INTERACTIVE_ENABLED + "=false",
        ScriptShellApplicationRunner.SPRING_SHELL_SCRIPT_ENABLED + "=false"
})
@DisplayName( "Репка")
class JdbcAuthorRepositoryImplTest {

    @Autowired
    AuthorRepository repository;


    @Test
    void save() {
        /*
    public Author( String ID, String Name, LocalDate birthDate, String email, String phone, String address){

         */
        Author author = new Author( null, "pavel", LocalDate.of( 1990, 12, 9), "test@mail.ru", "77727272", "no info");
        Author saved  = repository.save( author);
        assertEquals( author.getName(), author.getName());
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
    }

    @Test
    void getByName() {
    }

    @Test
    void getAll() {
    }
}