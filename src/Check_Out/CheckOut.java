
package Check_Out;

import Model.Customers;
import Cart.Item_details;
import java.util.List;


public class CheckOut {
    
   
    public static void Checkoutprocess(Customers customer){
    List<Item_details> list = customer.getCustomerPurchases();
     if(customer.getsubtotal()==0){System.out.println("cart is empty");
      return;}
  double total_weight=0;
  boolean once=false;
     for(int i=0;i<customer.Customer_purchases.size();i++){
          if(customer.Customer_purchases.get(i).product.isShippable())
          { if(!once){
                      System.out.println("** Shipment notice **");
                      once=true;
          }
              System.out.println(customer.Customer_purchases.get(i).quantity+" "+customer.Customer_purchases.get(i).product.getname()+" "+customer.Customer_purchases.get(i).product.getweight()+"g");
          total_weight+=customer.Customer_purchases.get(i).product.getweight();}
     }if(total_weight>0)
     { System.out.println("Total package weight "+(total_weight / 1000) + "kg");
     
           customer.setfees((customer.getsubtotal()*.07)); 
          }
      
             
      System.out.println("\n**   Checkout receipt   ** ");
  for(int i=0;i<customer.Customer_purchases.size();i++){
     // subtotal+=Customer_purchases.get(i).product.getprice()*Customer_purchases.get(i).quantity;
           System.out.println(customer.Customer_purchases.get(i).quantity+" "+customer.Customer_purchases.get(i).product.getname()+" "+customer.Customer_purchases.get(i).product.getprice());
    
             }
      System.out.println("--------------------------");
       System.out.println("subtotal                 "+customer.getsubtotal());
    
        double paid_amount=customer.getsubtotal()+customer.getfees();
      System.out.println("fees                   "+customer.getfees() );
      System.out.println("Amount                 "+paid_amount );
      
    
   customer.Update_balance(paid_amount);
    System.out.println("Payment successful!");
    System.out.println("Remaining balance: " + customer.getbalance());
}
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

