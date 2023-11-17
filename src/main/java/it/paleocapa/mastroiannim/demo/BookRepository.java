package it.paleocapa.mastroiannim.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);

    @Query(value = ""+
    " SELECT b.* " + 
    " FROM (USER_ACCOUNT ua INNER JOIN BORROW bo ON ua.id = bo.USER_ACCOUNT) INNER JOIN BOOK b ON bo.BOOK = b.ID" + 
    " WHERE bo.USER_ACCOUNT = :id"+
    "", nativeQuery = true)
    List<Book> searchBorrowByUser(@Param("id") long id);
}
