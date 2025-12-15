package ex.ex0;

public class ProductOrder {
    String productNmae;
    int price;
    int quantity;

    ProductOrder(String productNmae,  int price , int quantity){
        this.productNmae =productNmae;
        this.price = price;
        this.quantity = quantity;
    }

    public static class ProductOrderMain{
        public static void main(String[] args) {
            ProductOrder p1 = new ProductOrder("두부",2000,2);
            ProductOrder p2 = new ProductOrder("김치",5000,1);
            ProductOrder p3 = new ProductOrder("콜라",1500,2);

            ProductOrder[] products = {p1,p2,p3};

            int totalprice = 0;
            for (ProductOrder p : products) {
                System.out.println("상품명: " +p.productNmae +  "가격: " + p1.price + "수량: " +p.quantity);
                totalprice += p.price *p.quantity;
            }
            System.out.println(totalprice);

        }
    }
}
