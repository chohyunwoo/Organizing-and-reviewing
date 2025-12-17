package ex5;

public class Album extends Item {
    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print(); // 부모의 동작을 완전히 새로 정의 하고 싶으면 이부분 코드 삭제해도 됨
        System.out.println(" - 아티스트:" + artist);
    }
}
