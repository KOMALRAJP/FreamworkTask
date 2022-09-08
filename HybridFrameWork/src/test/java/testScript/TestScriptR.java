package testScript;
import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.base.Testbase;
import pom.page.Register_Page;

public class TestScriptR extends Testbase {
	
	Register_Page page;
	
	public TestScriptR() {
		super();
	}
		
	@BeforeMethod()
	public void setup() throws IOException {
		initialization();
		page = new Register_Page();

}
	@Test
	public void registratioTest() {
		page.ClickRegisterLink();
		page.Setfname(null);
		page.Setlname(null);
		page.Setaddress(null);
		page.SetCity(null);
		page.SetZipcode(null);
		page.Setphnum(null);
		page.SetSsn(null);
		page.SetUname(null);
		page.SetPass(null);
		page.SetReptpwd(null);
		page.SetConfpass(null);
		page.ClickReglink(null);
		
	}

}
