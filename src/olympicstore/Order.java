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
    private String custID;
    private String orderID;
    private String orderDate;
    private ArrayList productIDs;
    
    private static long orderIDCounter = 7000;
 
    
    // constructor
public Order(String customerID, String ordDate) {
    custID = customerID;
    orderID = Long.toString(orderIDCounter);
    orderIDCounter++;
    orderDate = ordDate;
    productIDs = new ArrayList();
} // end constructor

  // gets & set methods

String getCustID() { return custID; }

void setCustID(String cID) { custID = cID; }

String getOrderID() { return orderID; }

void setOrderID(String oID) { orderID = oID; }

String getOrderDate() { return orderDate; }

void setOrderDate(String oDate) { orderDate = oDate; }

void setProductIDs(long prodID) { productIDs.add(prodID); }

String getProductIDs() {
	String orders = "";
		
	//loop through the array and convert the values to a string
		for(int z = 0; z < productIDs.size(); z++)
		{
			orders = orders + (long) productIDs.get(z);
			//add a comma if it isn't the last time through the loop
			if (z < (productIDs.size() - 1))
				orders = orders + ", ";
		}
		return orders;
}

    
}
