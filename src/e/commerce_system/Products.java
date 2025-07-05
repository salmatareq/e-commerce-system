
package e.commerce_system;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
import java.util.*;


//System.out.println(java.time.LocalDate.now()); 
public class Products {
   
    String name;
    double price;
    int quantity;
    boolean is_expire;
    boolean is_shippable;
 double weight;
 LocalDate expiryDate = LocalDate.of(2025, 12, 31);

 public static List<Products> productsList = new ArrayList<>();
   public Products(String name, double price, int quantity) {
         this.name=name;
       this.price=price;
       this.quantity=quantity;
        is_shippable=false;
        is_expire=false;
    }
  
     public Products(String name, double price, int quantity, double weight) {
        this(name, price, quantity);
        this.weight = weight;
        is_shippable=true;
        is_expire=false;
    }
     public Products(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        this(name, price, quantity,weight);
        
     this.expiryDate = expiryDate;
        is_shippable=true;
        is_expire=true;
    }
     public String getname(){
         return name;
     }
      public double getprice(){
         return price;
     }
       public double getweight(){
         return weight;
     }
       public int getquantity(){
         return quantity;
     }
         public boolean isExpire(){
         return is_expire;
     }
             public boolean isShippable(){
         return is_shippable;
     }
              public LocalDate getExpirydate() {
        return expiryDate;
    }
   public void product_details(String name){
       
   }
    
}
