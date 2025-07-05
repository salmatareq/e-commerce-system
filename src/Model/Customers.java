
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
