
package Ecommerce_system;
import Model.Products;
import Cart.CartService;
import Check_Out.CheckOut;
import Model.Customers;
import java.time.LocalDate;
import java.util.*;

public class ECommerce_system {

  
    public static void main(String[] args) {
        
        
       
        LocalDate biscuitsExpiry = LocalDate.of(2025, 6, 20);
        Products biscuits = new Products("Biscuits", 75.0, 30, biscuitsExpiry, 700);
        LocalDate expiry = LocalDate.of(2025, 8, 4);
        Products cheese = new Products("Cheese", 100.0, 20, expiry, 400);
        Products tv = new Products("Samsung TV", 8000.0, 10, 9000);
        Products scratchCard = new Products("Scratch Card", 10.0, 50);
        Products.productsList.add(scratchCard);
Products.productsList.add(tv);
Products.productsList.add(cheese);
Products.productsList.add(biscuits);
        
        Customers salma=new Customers("salma",55000);
        System.out.println("v");
       System.out.println("Welcome to our E-Commerce System!");
System.out.println("We're happy to have you with us today ");
       
System.out.println("the available products in our store:");
System.out.println("-------------------------------------------------");
        System.out.println("Cheese Biscuits Samsung TV Scratch card");
       Scanner input=new Scanner(System.in);
        System.out.println("Enter product name or End to end shopping");
        while(true){
        
        
           
        String productName=input.nextLine();
        boolean found = false;
        if(!productName.equalsIgnoreCase("end"))
        {

            for (Products p : Products.productsList) {
                if (p.getname().equalsIgnoreCase(productName)) {
                    found = true;

                    System.out.print("Enter quantity: ");
                    int quantity;  
                    quantity=input.nextInt();
                    input.nextLine();
                    CartService.add_to_card(salma,p,quantity);
               break;
            }
        }
       if (!found) {
                System.out.println("Product not found. Please try again.");
            }
    }
        else
        { CheckOut.Checkoutprocess(salma);
        break;}
       
        }
        
        
        
       
    
}}
