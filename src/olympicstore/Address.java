
package olympicstore;

public class Address {
	
	// variables
	String Address1;
	String Address2;
	String City;
	String State;
	int ZIP;
	String Phone;
	
	// constructors
	Address()
	{
		Address1 = Address2 = City = State = Phone = "";
		ZIP = 0;
	} // end no-arg constructor

	Address(String add1, String add2, String city, String state, int zip, String phone)
	{
		Address1 = add1;
		Address2 = add2;
		City = city;
		State = state;
		ZIP = zip;
		Phone = phone;
	} // end all-args constructor
	
	// gets and sets
	void setAddress1(String add1)
	{
		Address1 = add1;
	} // end setAddress1
	
	String getAddress1()
	{
		return Address1;
	} // end getAddress1
	
	void setAddress2(String add2)
	{
		Address2 = add2;
	} // end setAddress2
	
	String getAddress2()
	{
		return Address2;
	} // end getAddress2
	
	void setCity(String city)
	{
		City = city;
	} // end setCity
	
	String getCity()
	{
		return City;
	} // end getCity
	
	void setState(String state)
	{
		State = state;
	} // end setState
	
	String getState()
	{
		return State;
	} // end getState
	
	void setZIP(int zip)
	{
		ZIP = zip;
	} // end setZIP
	
	int getZIP()
	{
		return ZIP;
	} // end getZIP
	
	void setPhone(String phone)
	{
		Phone = phone;
	} // end setPhone
	
	String getPhone()
	{
		return Phone;
	} // end getPhone
	
}
