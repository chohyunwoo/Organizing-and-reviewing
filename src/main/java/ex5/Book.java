package ex5;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print(); // 부모의 동작을 완전히 새로 정의 하고 싶으면 이부분 코드 삭제해도 됨
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
