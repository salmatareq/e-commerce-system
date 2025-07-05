
package Model;
import Cart.Item_details;
import java.time.LocalDate;
import java.util.*;

public class Customers {
    String name;
    double subtotal;
double fees; 
double paid_amount ; 
 double balance; 

 public Customers (String name,double balance){
     this.name=name;
     this.balance=balance;
 }
 public  List<Item_details> Customer_purchases = new ArrayList<>();
 /*public void add_to_card(Products p,int quntity){
 
   Item_details item=new Item_details(p,quntity);
   if (quntity > p.getquantity()) {
    System.out.println("Insufficient quantity for product " + p.getname());
    return;
}
   if(p.isExpire()&&p.getExpirydate().isBefore(LocalDate.now())){
       System.out.println("Product is Expired");
   return;
   }
   if((p.getprice()*quntity)+subtotal>this.balance){
        System.out.println("Customer's balance is insufficient");
  return;}
  subtotal+=p.getprice()*quntity;
      // System.out.println("1");
  int x=-1;
     for(int i=0;i<Customer_purchases.size();i++){
          if(!Customer_purchases.get(i).product.isShippable())
          {
          
           x=i;
          break;
          }
      }
     if(x==-1)
          Customer_purchases.add(item);
     else 
      Customer_purchases.add(x,item);
   }
   */
    
 /*
 public void Checkout(){
      if(subtotal==0){System.out.println("cart is empty");
      return;}
  double total_weight=0;
     for(int i=0;i<Customer_purchases.size();i++){
          if(Customer_purchases.get(i).product.isShippable())
          {  System.out.println(Customer_purchases.get(i).quantity+" "+Customer_purchases.get(i).product.getname()+" "+Customer_purchases.get(i).product.getweight()+"g");
          total_weight+=Customer_purchases.get(i).product.getweight();}
     }if(total_weight>0)
     { System.out.println("Total package weight "+(total_weight / 1000) + "kg");
     
            fees=subtotal*.07; 
          }
      
             
      System.out.println("\n**   Checkout receipt   ** ");
  for(int i=0;i<Customer_purchases.size();i++){
     // subtotal+=Customer_purchases.get(i).product.getprice()*Customer_purchases.get(i).quantity;
           System.out.println(Customer_purchases.get(i).quantity+" "+Customer_purchases.get(i).product.getname()+" "+Customer_purchases.get(i).product.getprice());
    
             }
      System.out.println("--------------------------");
       System.out.println("subtotal                 "+subtotal);
    
          
      System.out.println("fees                   "+fees );
      System.out.println("Amount                 "+subtotal+fees );
      
paid_amount=subtotal+fees;
    balance -= paid_amount;
    System.out.println("Payment successful!");
    System.out.println("Remaining balance: " + balance);
}*/
public double getsubtotal(){

return subtotal;
}

  public double getfees(){

return fees;
}
 

public void setfees(double x){
    fees=x;
}

public List<Item_details> getCustomerPurchases() {
    return Customer_purchases;
}

public void Update_balance(double balance){

this.balance-=balance;

}
public void setpaidAmount(double amount){
   this.paid_amount=amount;
}

    public double getbalance() {
        return balance;
         }
    public void setsubtotal(double x){
    
        this.subtotal+=x;
    
    
    }

}
