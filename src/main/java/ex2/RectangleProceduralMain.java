package ex2;

public class RectangleProceduralMain {
    public static void main(String[] args) {

        Rectangle rt = new Rectangle(5,8);

//        rt.width =5;
//        rt.height =8;

        int area = rt.calculateArea();
        rt.Printarea();
//        System.out.println("넓이: " + area);

        int perimeter = rt.calculatePerimeter();
        rt.Printperimeter();
//        System.out.println("둘레 길이: " + perimeter);

        boolean square = rt.isSquare();
        rt.Printsquare();
        //        System.out.println("정사각형 여부: " + square);
    }


}
