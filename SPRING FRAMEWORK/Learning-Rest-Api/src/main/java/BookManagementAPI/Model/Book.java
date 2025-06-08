/*

 1. Book Management API

Objective:
Create a REST API to manage a collection of books.

Model:
`Book` should contain:
- `int id`
- `String title`
- `String author`

Endpoints to Create:
1. `POST /api/books` – Add a new book
2. `GET /api/books` – Return all books
3. `GET /api/books/{id}` – Return a book by its ID
4. `PUT /api/books/{id}` – Update a book’s title by ID
5. `DELETE /api/books/{id}` – Delete a book by ID

 */






package BookManagementAPI.Model;




public class Book {
    private Long id;
    private String title;
    private String author;

    public Book(Long id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId(){
        return id;
    }


    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(Long id) {
        this.id=id;

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
