package ex2;

public class Rectangle {

    int width;
    int height;

    Rectangle(int width, int height){
        this.width =width;
        this.height =height;
    }

     int calculateArea() {
        return width * height;
    }

     int calculatePerimeter() {
        return 2 * (width + height);
    }

     boolean isSquare() {
        return width == height;
    }
      void Printarea(){
        System.out.println("넓이: " + calculateArea());
    }

     void Printperimeter() {
         System.out.println("둘레 길이: " + calculatePerimeter());
    }

     void Printsquare() {
         System.out.println("정사각형 여부: " + isSquare());
    }
}
