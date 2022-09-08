package pom.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pom.base.Testbase;
public class Register_Page extends Testbase{

	//object repository
	@FindBy(xpath= "//div[@id='nav-signin-tooltip']//child::span")
	WebElement signin;
	
	  @FindBy(xpath="prop.getProperty('registerbtn')")
	  WebElement RegisterLink;
	
	  @FindBy (id="prop.getProperty('fname')")
      WebElement Fname;	 
	  
	  
	  @FindBy (id=" prop.getProperty('lname')")
	  WebElement Lname;
	 	
	 
	 @FindBy (id="prop.getProperty('address')")
	  WebElement Address;
		 
	 @FindBy (id="prop.getProperty('city')")
	  WebElement City;
	
	 @FindBy (id=" ('state')")
	  WebElement State;
	 
	 @FindBy (id="prop.getProperty('zipcode')")
	  WebElement Zipcode;
	
	 @FindBy (id="prop.getProperty('phoneNumber')")
	  WebElement  PhoneNumber  ;
	
	 @FindBy (id="prop.getProperty('ssn')")
	  WebElement Ssn ;
	 
	 @FindBy (id="prop.getProperty('username')")
	  WebElement Username;
	 
	 @FindBy (id="prop.getProperty('password')")
	  WebElement Password ;
	 
	 @FindBy (id="prop.getProperty('repeatpassword')")
	  WebElement Repeatpassword ;
	
	 @FindBy (id="prop.getProperty('confmpwd')")
	  WebElement confmpass;
	 
	 @FindBy (id="prop.getProperty('registerBtn')")
	  WebElement  Registerlink;
	 
	public Register_Page() {
		PageFactory.initElements(driver,this);
	}
	
	public void ClickRegisterLink()
	{
	RegisterLink.click();
	}
	
	public void Setfname(String fname)
	{
	Fname.sendKeys(fname);
	}
	
	public void Setlname(String lname)
	{
		Lname.sendKeys(lname);
	}
	
	public void Setaddress(String addres)
	{
		Address.sendKeys(addres);
	}
	
	public void SetCity(String city)
	{
		City.sendKeys(city);
	}
	
	public void SetState(String state)
	{
		State.sendKeys(state);
	}
	
	public void SetZipcode(String zipcode)
	{
		Zipcode.sendKeys(zipcode);
	}
	
	public void Setphnum(String phnum)
	{
		PhoneNumber.sendKeys(phnum);
	}
	
	public void SetSsn(String ssn)
	{
		Ssn.sendKeys(ssn);
	}
	
	public void SetUname(String uname)
	{
		Username.sendKeys(uname);
	}
	
	public void SetPass(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void SetReptpwd(String repeatpwd)
	{
		Repeatpassword.sendKeys(repeatpwd);
	}
	
	public void SetConfpass(String confpwd)
	{
		confmpass.sendKeys(confpwd);
	}
	
	public void ClickReglink(String reglink)
	{
		Registerlink.click();
	}
	
	
	
	

}
