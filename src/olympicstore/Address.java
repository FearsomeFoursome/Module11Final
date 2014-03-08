
package olympicstore;

public class Address {
	
	// variables
	private String FName;
	private String LName;
	private String Address1;
	private String Address2;
	private String City;
	private String State;
	private String ZIP;
	private String Phone;
	
	// constructors
	Address()
	{
		FName = LName = Address1 = Address2 = City = Phone = "";
		State = "Select";
		ZIP = "";
	} // end no-arg constructor

	Address(String fname, String lname, String add1, String add2, String city, String state, String zip, String phone)
	{
		FName = fname;
		LName = lname;
		Address1 = add1;
		Address2 = add2;
		City = city;
		State = state;
		ZIP = zip;
		Phone = phone;
	} // end all-args constructor
	
	// gets and sets
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
	
	void setZIP(String zip)
	{
		ZIP = zip;
	} // end setZIP
	
	String getZIP()
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
