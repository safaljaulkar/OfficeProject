package logintest;


import org.testng.annotations.Test;

import action.AddBookCartAction;
import action.LoginAction;
import base.BaseTest;

public class Login extends BaseTest {

	
	LoginAction action = new LoginAction();   //instance for action
	AddBookCartAction cart =new AddBookCartAction();
	
	@Test  //(priority = 1)
	public void VerifyLogin() {
		
	        
		action.login("Jerry1489@gmail.com", "Jerry@1997");  
		cart.AddBook(3);                                      
		      
		
		action.logout();
	
		
	}
	
}
