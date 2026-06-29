package Full_Stack_ch3;

class FoodDelivery {

    String customerName;
    static String appName = "QuickFood";

    FoodDelivery(String name) {
        customerName = name;
    }
    void placeOrder() {
        String orderStatus = "Delivered";
        System.out.println("Customer Name: " + customerName);
        System.out.println("App Name: " + appName);
        System.out.println("Order Status : " + orderStatus);
        System.out.println();
    }
    public static void main(String[] args) {

        FoodDelivery f1 = new FoodDelivery("Sangeetha");
        FoodDelivery f2 = new FoodDelivery("Priya");

        f1.placeOrder();
        f2.placeOrder();
    }
}
