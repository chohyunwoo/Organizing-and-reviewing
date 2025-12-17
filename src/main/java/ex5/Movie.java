package ex5;

public class Movie extends Item {
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print(); // 부모의 동작을 완전히 새로 정의 하고 싶으면 이부분 코드 삭제해도 됨
        System.out.println("- 감독:" + director + ",배우:" + actor);
    }
}
