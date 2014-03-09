/*
 * Class for mock Order
 */
package olympicstore;
import java.util.ArrayList;

/**
 *
 * @author SYoung
 */
public class Order {
    
    // instance variables
    long custID;
    long orderID;
    int orderDate;
    ArrayList productIDs;
    
    static long orderIDCounter = 7000;
 
    
    // constructor
public Order(long customerID, int ordDate) {
    custID = customerID;
    orderID = orderIDCounter;
    orderIDCounter++;
    orderDate = ordDate;
    productIDs = new ArrayList();
} // end constructor

  // gets & set methods

long getCustID() { return custID; }

void setCustID(long cID) { custID = cID; }

long getOrderID() { return orderID; }

void setOrderID(long oID) { orderID = oID; }

int getOrderDate() { return orderDate; }

void setOrderDate(int oDate) { orderDate = oDate; }

void setProductIDs(long prodID) { productIDs.add(prodID); }

Object getProductIDs() { return productIDs.toArray(); }

    
}
