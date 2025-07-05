"# e-commerce-system" 
Add products with price, quantity, weight, and expiry date.
- Supports:
  - Perishable products (like Cheese, Biscuits)
  - Non-perishable products (like TV, Scratch Cards)
  - Shippable products with weight
- Add products to cart with quantity (limited to available stock)
- Check for expired products
- Shipping weight calculation
- Balance validation on checkout
- Checkout summary with subtotal, shipping fee, and final amount


Project Structure

ecommerce-system/

├── e.commerce_system/

│   ├── ECommerce_system.java

│   ├── Products.java

├── CustomerPackage/

│   ├── Customers.java

│   ├── Item_details.java


Example Run

Welcome to our E-Commerce System!

We're happy to have you with us today 

the available products in our store:

-------------------------------------------------

Cheese Biscuits Samsung TV Scratch card

Enter product name or End to end shopping

Biscuits

Enter quantity: 1

Product is Expired

Samsung TV

Enter quantity: 1

Cheese

Enter quantity: 3

end

1 Samsung TV 9000.0g

3 Cheese 400.0g

Total package weight 9.4kg


**   Checkout receipt   ** 

1 Samsung TV 8000.0

3 Cheese 100.0

--------------------------

subtotal                 8300.0

fees                   581.0

Amount                 8300.0581.0

Payment successful!

Remaining balance: 46119.0

