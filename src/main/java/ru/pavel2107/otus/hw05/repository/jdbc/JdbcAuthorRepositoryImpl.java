package ru.pavel2107.otus.hw05.repository.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import ru.pavel2107.otus.hw05.domain.Author;
import ru.pavel2107.otus.hw05.repository.AuthorRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Repository
public class JdbcAuthorRepositoryImpl implements AuthorRepository {
   private final String INSERT_QUERY = "insert into authors( id, a_name, birthdate, email, phone, address) values(:id, :name, :birthdate, :email, :phone, :address)";
   private final String UPDATE_QUERY = "update authors set a_name =:name , birthdate=:birthdate, email=:email, phone=:phone, address=:address where id =:id";
   private final String DELETE_QUERY = "delete from authors where id=?";
   private final String FIND_BY_NAME = "select * from authors where a_name=?";
   private final String FIND_BY_ID   = "select * from authors where id=?";
   private final String FIND_ALL     = "select * from authors order by a_name asc";

   private JdbcTemplate jdbcTemplate;



   @Autowired
   public JdbcAuthorRepositoryImpl( JdbcTemplate jdbcTemplate){
       this.jdbcTemplate = jdbcTemplate;
   }


    @Override
    public Author save(Author author) {
       Map<String, Object> parameters = new HashMap<>();
       parameters.put( "name",      author.getName());
       parameters.put( "birthdate", author.getBirthDate());
       parameters.put( "address",   author.getAddress());
       parameters.put( "email",     author.getEmail());
       parameters.put( "address",   author.getBirthDate());

       int i;
       if( author.isNew()){
           author.setID( UUID.randomUUID().toString() );
           parameters.put( "id", author.getID());
           i = jdbcTemplate.update( INSERT_QUERY, parameters);
       } else {
           parameters.put( "id", author.getID());
           i = jdbcTemplate.update( UPDATE_QUERY, parameters);
       }
       author = get( author.getID());

       return author;
    }

    @Override
    public boolean delete(String ID) {
        return jdbcTemplate.update( DELETE_QUERY, ID) != 0;
    }

    @Override
    public Author get(String ID) {
        List<Author> authors= jdbcTemplate.query( FIND_BY_ID, new AuthorRowMapper(), ID);
        return authors.size() > 0 ? authors.get(0) : null;
    }

    @Override
    public List<Author> getByName(String name) {
        return jdbcTemplate.query( FIND_BY_NAME, new AuthorRowMapper(), name);
    }

    @Override
    public List<Author> getAll() {
        return jdbcTemplate.query( FIND_ALL, new AuthorRowMapper());
    }

    private class AuthorRowMapper implements RowMapper<Author>{
        @Override
        public Author mapRow(ResultSet resultSet, int i) throws SQLException {
            Author author = new Author(
                    resultSet.getString( "id"),
                    resultSet.getString( "a_name"),
                    resultSet.getDate( "birthdate").toLocalDate(),
                    resultSet.getString( "email"),
                    resultSet.getString( "phone"),
                    resultSet.getString( "address")
                    );
            return author;
        }
    }

}
