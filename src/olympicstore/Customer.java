/*
 * Customer class code.
 * Class built primarily by Amy Roberts.
 */
package olympicstore;

import java.util.ArrayList;

public class Customer {
	
	// variables
	private String Email;
	private String Password;
	private int SecurityQuestion;
	private String SecurityAnswer;
	private Address BillAddress;
	private Address ShipAddress;
	private String CCNum;
	private String CCExp;
	private String CCName;
	private String CustID;
	private ArrayList CustOrders;
	
	private static int CustIDCounter = 1000;
	
	// constructor - initializes variables being set on the create account screen
	Customer(String email, String password, int question, String answer)
	{
		Email = email;
		Password = password;
		SecurityQuestion = question;
		SecurityAnswer = answer;
		CustID = Integer.toString(CustIDCounter);
		CustIDCounter++;
		CCExp = CCName = CCNum = "";
		CustOrders = new ArrayList();
		BillAddress = new Address();
		ShipAddress = new Address();
	} // end constructor
	
	//gets and sets
	//email, password, ID, and security information are set in constructor; 
	//we aren't allowing changing security data or password, so no separate sets required
	
	String getEmail()
	{
		return Email;
	} // end getEmail
	
	String getPassword()
	{
		return Password;
	} // end getPassword
	
	String getCustID()
	{
		return CustID;
	} // end getCustID
	
	int getSecurityQuestion()
	{
		return SecurityQuestion;
	} // end getSecurityQuestion
	
	String getSecurityAnswer()
	{
		return SecurityAnswer;
	} // end getSecurityAnswer
	
	void setCCnum(String ccnum)
	{
		CCNum = ccnum;
	} // end setCCNum
	
	String getCCNum()
	{
		return CCNum;
	} // end getCCNum
	
	void setCCExp(String ccexp)
	{
		CCExp = ccexp;
	} // end setCCExp
	
	String getCCExp()
	{
		return CCExp;
	} // end getCCExp
	
	void setCCName(String ccname)
	{
		CCName = ccname;
	} // end setCCName
	
	String getCCName()
	{
		return CCName;
	} // end getCCName
	
	//pass-through gets and sets for address objects inside of customer objects
	void setBillAddress(String fname, String lname, String add1, String add2, String city, String state, String zip, String phone)
	{
		BillAddress = new Address(fname, lname, add1, add2, city, state, zip, phone);
	} // end setBillAddress
	
	void setShipAddress(String fname, String lname, String add1, String add2, String city, String state, String zip, String phone)
	{
		ShipAddress = new Address(fname, lname, add1, add2, city, state, zip, phone);
	} // end setShipAddress

	//gets for all pieces of address data, using Address class methods
	String getBillFName()
	{
		return BillAddress.getFName();
	} // end getBillFName
	
	String getBillLName()
	{
		return BillAddress.getLName();
	} // end getBillLName
	
	String getBillAddress1()
	{
		return BillAddress.getAddress1();
	} // end getBillAddress1
	
	String getBillAddress2()
	{
		return BillAddress.getAddress2();
	} // end getBillAddress2
	
	String getBillCity()
	{
		return BillAddress.getCity();
	} // end getBillCity
	
	String getBillState()
	{
		return BillAddress.getState();
	} // end getBillState
		
	String getBillZIP()
	{
		return BillAddress.getZIP();
	} // end getBillZIP
			
	String getBillPhone()
	{
		return BillAddress.getPhone();
	} // end getBillPhone
	
	String getShipFName()
	{
		return ShipAddress.getFName();
	} // end getShipFName
	
	String getShipLName()
	{
		return ShipAddress.getLName();
	} // end getShipLName
	
	String getShipAddress1()
	{
		return ShipAddress.getAddress1();
	} // end getShipAddress1
	
	String getShipAddress2()
	{
		return ShipAddress.getAddress2();
	} // end getShipAddress2
	
	String getShipCity()
	{
		return ShipAddress.getCity();
	} // end getShipCity
	
	String getShipState()
	{
		return ShipAddress.getState();
	} // end getShipState
		
	String getShipZIP()
	{
		return ShipAddress.getZIP();
	} // end getShipZIP
			
	String getShipPhone()
	{
		return ShipAddress.getPhone();
	} // end getShipPhone
	
	void addOrder(int orderid)
	{
		CustOrders.add(orderid);
	}
	
	//for testing purposes, output a string
	String getOrders()
	{
		String orders = "";
		//loop through the array and convert the values to a string
		for(int z = 0; z < CustOrders.size(); z++)
		{
			orders = orders + (long) CustOrders.get(z);
			//add a comma if it isn't the last time through the loop
			if (z < (CustOrders.size() - 1))
				orders = orders + ", ";
		}
		return orders;
	}
	
} // end class Customer
