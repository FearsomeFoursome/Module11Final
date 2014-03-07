/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package olympicstore;

import java.util.ArrayList;

public class Customer {
	
	// variables
	String FName;
	String LName;
	String Email;
	String Password;
	int SecurityQuestion;
	String SecurityAnswer;
	Address BillAddress;
	Address ShipAddress;
	String CCNum;
	String CCExp;
	String CCName;
	long CustID;
	ArrayList CustOrders;
	
	static long CustIDCounter = 1000;
	
	// constructor - initializes variables being set on the create account screen
	Customer(String email, String password, int question, String answer)
	{
		Email = email;
		Password = password;
		SecurityQuestion = question;
		SecurityAnswer = answer;
		CustID = CustIDCounter;
		CustIDCounter++;
		FName = LName = CCExp = CCName = CCNum = "";
		custOrders = new ArrayList();
	} // end constructor
	
	//gets and sets
	//email, password, ID, and security information are set in constructor; no separate sets required
	
	String getEmail()
	{
		return Email;
	} // end getEmail
	
	String getPassword()
	{
		return Password;
	} // end getPassword
	
	long getCustID()
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
	
	void setFName(String fname)
	{
		FName = fname;
	} // end setFName
	
	String getFName()
	{
		return FName;
	} // end getFName
	
	void setLName(String lname)
	{
		LName = lname;
	} // end setLName
	
	String getLName()
	{
		return LName;
	} // end getLName
	
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
	
	void setBillAddress(String add1, String add2, String city, String state, int zip, String phone)
	{
		BillAddress = new Address(add1, add2, city, state, zip, phone);
	} // end setBillAddress
	
	void setShipAddress(String add1, String add2, String city, String state, int zip, String phone)
	{
		ShipAddress = new Address(add1, add2, city, state, zip, phone);
	} // end setShipAddress

	//gets for all pieces of address data
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
		
	int getBillZIP()
	{
		return BillAddress.getZIP();
	} // end getBillZIP
			
	String getBillPhone()
	{
		return BillAddress.getPhone();
	} // end getBillPhone
	
	String getShipAddress1()
	{
		return ShipAddress.getAddress1();
	} // end getShipAddress1
	
	String getShipAddress2()
	{
		return ShipAddress.getAddress2();
	} // end getShipAddress2
	
	String getShiplCity()
	{
		return ShipAddress.getCity();
	} // end getShipCity
	
	String getShipState()
	{
		return ShipAddress.getState();
	} // end getShipState
		
	int getShipZIP()
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
	
	Object getOrders()
	{
		return CustOrders.toArray();
	}
	
} // end class Customer
