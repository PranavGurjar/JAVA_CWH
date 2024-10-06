import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library{
    public ArrayList<Book> books;
    public Library(ArrayList<Book>books){
        this.books=books;
    }

    public void addBook(Book book){
        System.out.println("the Book has been added to the Library. ");
        this.books.add(book);
    }

    public void issuedBook(Book book, String issued_to){
        System.out.println("the Book has been issued from the Library to "+issued_to);
//        System.out.println("the Book of "+book+" has been issued from the Library to "+issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b){
        System.out.println("the Book has been returned");
        this.books.add(b);
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        /*
        Create a library management system which is capable of issuing books to the students.
        Book should have info like:
        1. Book name
        2. Book Author
        3. Issued to
        4. Issued on
        User should be able to add books, return issued books, issue books
        Assume that all the users are registered with their names in the central database
         */

        ArrayList<Book> bk = new ArrayList<>();
        Book b1 = new Book("Algorithm1 ", "CLRS1 ");
        bk.add(b1);

        Book b2 = new Book("Algorithm2 ", "CLRS2 ");
        bk.add(b2);

        Book b3 = new Book("Algorithm3 ", "CLRS3 ");
        bk.add(b3);

        Book b4 = new Book("Algorithm4 ", "CLRS4 ");
        bk.add(b4);

        Book b5 = new Book("Algorithm5 ", "CLRS5 ");
        bk.add(b5);

        Library lb = new Library(bk);
        lb.addBook(new Book("Algorithm6 ", "CLRS6"));
        System.out.println(lb.books);

        lb.issuedBook(b3, "pranav");
        System.out.println(lb.books);

        lb.returnBook(b3);
        System.out.println(lb.books);


    }
}
