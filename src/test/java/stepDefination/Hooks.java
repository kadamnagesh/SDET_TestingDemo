package stepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforeValisdation() {
		System.out.println("before hook ");
	}
	@After ("@MobileTest")
	public void afterValidation() {
		System.out.println("after hook");
	}

}
