package ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ProductOrderMain3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력할 주문의 개수를 입력하세요");
        int N = Integer.parseInt(br.readLine());

        ProductOrder[] orders = new ProductOrder[N];

        for (int i = 0; i < N; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

            ProductOrder order = new ProductOrder();

            System.out.print("상품명: ");
            order.productName = br.readLine();

            System.out.print("가격: ");
            order.price = Integer.parseInt(br.readLine());

            System.out.print("수량: ");
            order.quantity = Integer.parseInt(br.readLine());

            orders[i] = order;
        }

        PrintOrders(orders);
    }
//        for (ProductOrder od : orders) {
//            System.out.println(
//                    "상품명: " +od.productName +
//                            ", 가격: " + od.price +
//                            ", 수량: " +od.quantity
//            );
//            totalAmount += od.price * od.quantity;
//        }
//        System.out.println("총 결제 금액: " +totalAmount);
//    }

    static void PrintOrders(ProductOrder[] orders){
            int totalAmount= 0;

            for (ProductOrder od : orders) {
            System.out.println(
                    "상품명: " +od.productName +
                            ", 가격: " + od.price +
                            ", 수량: " +od.quantity
            );
            totalAmount += od.price * od.quantity;
        }
        System.out.println("총 결제 금액: " +totalAmount);
    }
        }

