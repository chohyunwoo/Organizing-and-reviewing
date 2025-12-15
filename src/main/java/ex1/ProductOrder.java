package ex1;

public class ProductOrder {
    String productName;
    int price;
    int quantity;


    public static class ProductOrderMain2 {
        public static void main(String[] args) {
            ProductOrder[] order = {createrOrder("두부", 2000, 2),
                    createrOrder("김치", 5000, 1),
                    createrOrder("콜라", 1500, 2)};

//            order[0] = createrOrder("두부" , 2000, 2);
//            order[1] = createrOrder("김치", 5000, 1);
//            order[2] = createrOrder("콜라", 1500, 2);

            printOrders(order);
            int totalAmount = getTotalamount(order);
            System.out.println("총 결제 금액: " + totalAmount);
        }

        private static int getTotalamount(ProductOrder[] order) {
            int totalAmount = 0;
            for (ProductOrder pr : order) {
                totalAmount += pr.price * pr.quantity;
            }
            return totalAmount;
        }

        static ex1.ProductOrder createrOrder(String productName, int price, int quantity) {
            ProductOrder pd = new ProductOrder();
            pd.productName = productName;
            pd.price = price;
            pd.quantity = quantity;

            return pd;
        }

        static void printOrders(ProductOrder[] orders) {
            for (ProductOrder pr : orders) {
                System.out.println("상품명: " + pr.productName + ", 가격: " + pr.price + ", 수량: " + pr.quantity);
            }
        }
    }
}
