package BookManagementAPI.Controller;

import BookManagementAPI.Model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/books")
public class BookController {

    private final ArrayList<Book> books = new ArrayList<>();

    //CREATE
    @PostMapping
    public String addBookDetails(@RequestBody Book book) {
        books.add(book);
        return "Book added Successfully";
    }

    // READ ALL
    @GetMapping
    public List<Book> viewAll() {
        return books;
    }

    // READ BY ID
    @GetMapping("/{id}")
    public String viewBookByID(@PathVariable int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book.toString();
            }
        }
        return "Book not Found";
    }

    // UPDATE BY ID
    @PutMapping("/{id}")
    public String updateBookDetails(@PathVariable int id ,@RequestBody String updateBook) {
        for (Book book : books) {
            if (book.getId() == id) {
                book.setTitle(updateBook);
                    return "Book Updated Successfully ";
            }
        }
        return "Book not found";
    }




    @DeleteMapping("/{id}")
    public String deleteBookDetails(@PathVariable int id) {
        Book booToRemove = null;
        for (Book book : books) {
            if (book.getId() == id) {
                booToRemove=book;
                break;

            }

        }
 if (booToRemove!=null){
     books.remove(booToRemove);
     return "Deleted Successfully";
 }
return "Book Details NOt Found";
    }

}


