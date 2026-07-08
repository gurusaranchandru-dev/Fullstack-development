package javaprojects;

import java.util.Scanner;

class IceCream {
 String flavour;
 int pricePerScoop;

 IceCream(String flavour, int pricePerScoop) {
     this.flavour = flavour;
     this.pricePerScoop = pricePerScoop;
 }

 int calculateCost(int scoops) {
     return scoops * pricePerScoop;
 }
}

class Exclusive extends IceCream {
 Exclusive() {
     super("Exclusive", 95);
 }
}

class Signature extends IceCream {
 Signature() {
     super("Signature", 80);
 }
}

class Regular extends IceCream {
 Regular() {
     super("Regular", 60);
 }
}

class Topping {
 String name;
 int price;

 Topping(String name, int price) {
     this.name = name;
     this.price = price;
 }
}

public class IceCreamParlour {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     int grandTotal = 0;
     boolean continueOrdering = true;

     System.out.println(" Welcome to Whiskey's Fusion Ice Cream Parlour ");


     while (continueOrdering) {

         System.out.println("\nChoose your flavour:");
         System.out.println("1. Exclusive (₹95 per scoop)");
         System.out.println("2. Signature (₹80 per scoop)");
         System.out.println("3. Regular (₹60 per scoop)");
         System.out.print("Enter your choice: ");

         int choice = sc.nextInt();

         IceCream iceCream;

         switch (choice) {
             case 1:
                 iceCream = new Exclusive();
                 break;
             case 2:
                 iceCream = new Signature();
                 break;
             case 3:
                 iceCream = new Regular();
                 break;
             default:
                 System.out.println("Invalid flavour choice!");
                 continue;
         }

         System.out.print("Enter number of scoops: ");
         int scoops = sc.nextInt();

         if (scoops <= 0) {
             System.out.println("Scoops must be greater than 0.");
             continue;
         }

         int totalCost = iceCream.calculateCost(scoops);

         System.out.println("\nChoose a topping:");
         System.out.println("1. Mixed Nuts (₹25)");
         System.out.println("2. Tutti Frutties (₹20)");
         System.out.println("3. Mini Candies (₹20)");
         System.out.println("4. Choco Chips (₹20)");
         System.out.println("5. No Topping");
         System.out.print("Enter your choice: ");

         int toppingChoice = sc.nextInt();

         Topping topping = null;

         switch (toppingChoice) {
             case 1:
                 topping = new Topping("Mixed Nuts", 25);
                 break;
             case 2:
                 topping = new Topping("Tutti Frutties", 20);
                 break;
             case 3:
                 topping = new Topping("Mini Candies", 20);
                 break;
             case 4:
                 topping = new Topping("Choco Chips", 20);
                 break;
             case 5:
                 break;
             default:
                 System.out.println("Invalid topping choice!");
         }

         if (topping != null) {
             totalCost += topping.price;
         }


         System.out.println("Flavour : " + iceCream.flavour);
         System.out.println("Scoops  : " + scoops);

         if (topping != null) {
             System.out.println("Topping : " + topping.name);
         } else {
             System.out.println("Topping : No Topping");
         }

         System.out.println("Order Cost : ₹" + totalCost);


         grandTotal += totalCost;

         String answer = sc.next();

         if (!answer.equalsIgnoreCase("yes")) {
             continueOrdering = false;
         }
     }

     
     System.out.println("        Final Bill - Whiskey's Fusion");
     System.out.println("Grand Total : ₹" + grandTotal);
     System.out.println("Thank You! Visit Again.");

     sc.close();
 }
}
