class Library{
    String[] books = new String[10];
    int no_of_books = 0;

//    public Library(){
//        this.books=new String[10];
//        this.no_of_books=0;
//    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" is book has been added");
    }

    void availableBook(){
        System.out.println("available books are = ");
        for (String book : books)
        {
            if(book == null)
            {
                continue;
            }
            System.out.println("*" + book);
        }
    }

    void issueBook(String book){
        for (int i=0;i<this.books.length;i++)
        {
            if (this.books[i].equals(book))      //if (this.books[i]==book)
            {
                System.out.println(book+" is book is the issued");
                this.books[i]=null;
                return;
            }
        }
    }

    void returnBook(String book){
        //this.books[no_of_books] = book;
        addBook(book);
    }
}




public class OnlineLibrary {
    public static void main(String[] args) {
        Library lb = new Library();
        lb.addBook("c");
        lb.addBook("cpp");
        lb.addBook("java");
        lb.availableBook();
        System.out.println();

        lb.issueBook("java");
        lb.availableBook();
        System.out.println();

        lb.returnBook("java");
        lb.availableBook();
        System.out.println();
    }
}








//
//class Library{
//    String []books;
//    int no_of_books;
//    public Library(){
//        this.books = new String[10];
//        this.no_of_books = 0;
//    }
//    void addBook(String book){
//        this.books[no_of_books]= book;
//        no_of_books++;
//        System.out.println(book+" has been added");
//    }
//    void showAvailableBook(){
//        System.out.println("Available books are : ");
//        for (String book : books)
//        {
//            if (book==null)
//            {
//                continue;
//            }
//            System.out.println("* "+book);
//        }
//
//    }
//
//    void issueBook(String book){
//        for (int i=0; i<this.books.length;i++)
//        {
//            if (this.books[i].equals(book)){
//                System.out.println(book+" is book has been issued");
//                this.books[i]=null;
//                return;
//            }
//        }
//    }
//    void returnBook(String book){
//        //this.books[no_of_books]=book;
//        addBook(book);
//    }
//}
//
//
//
//
//public class OnlineLibrary {
//    public static void main(String[] args) {
//        Library ly = new Library();
//        ly.addBook("hello");
//        ly.addBook("pranav");
//        ly.addBook("mahajan");
//        ly.showAvailableBook();
//        System.out.println();
//
//        ly.issueBook("pranav");
//        ly.showAvailableBook();
//        System.out.println();
//
//        ly.returnBook("pranav");
//        ly.showAvailableBook();
//    }
//}
