
package Cart;

import Model.Customers;
import Model.Products;
import java.time.LocalDate;


public class CartService {
   
    public static void add_to_card(Customers customer,Products p,int quntity){
 
   Item_details item=new Item_details(p,quntity);
   if (quntity > p.getquantity()) {
    System.out.println("Insufficient quantity for product " + p.getname());
    return;
}
   if(p.isExpire()&&p.getExpirydate().isBefore(LocalDate.now())){
       System.out.println("Product is Expired");
   return;
   }
   if((p.getprice()*quntity)+customer.getsubtotal()>customer.getbalance()){
        System.out.println("Customer's balance is insufficient");
  return;}
  
          double total=p.getprice()*quntity;
          customer.setsubtotal(total);
     
  int x=-1;
     for(int i=0;i<customer.Customer_purchases.size();i++){
          if(!customer.Customer_purchases.get(i).product.isShippable())
          {
          
           x=i;
          break;
          }
      }
     if(x==-1)
          customer.Customer_purchases.add(item);
     else 
      customer.Customer_purchases.add(x,item);
   }
   
    
    
    
    
    
    
    
    
}
