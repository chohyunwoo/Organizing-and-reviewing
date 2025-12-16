package ex3;

public class Book {
    String title;
    String author;
    int page;

    Book(){
        this("","",0);
    }

    Book(String title, String author){
        this(title,author,0);
    }

    Book(String title, String author, int page){
        this.title=title;
        this.author=author;
        this.page =page;
    }
    void displayInfo(){
        System.out.println("제목: " +title + ", 저자: " +
                author +", 페이지" + page);
    }

    public static class BookMain{
        public static void main(String[] args) {
            Book book1 = new Book();
            book1.displayInfo();

            Book book2 = new Book("Hello Java", "Seo");
            book2.displayInfo();

            Book book3 = new Book("JPA 프로그래밍", "kim", 700);
            book3.displayInfo();
        }
    }
}
