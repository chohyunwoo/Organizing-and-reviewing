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
      void Print(){
        System.out.println();
    }
}
