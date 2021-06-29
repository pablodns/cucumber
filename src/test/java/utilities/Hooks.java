package utilities;

import io.cucumber.java.Before;


import io.cucumber.java.After;

public class Hooks {

	@Before
	public void beforeScenario() {
		//System.out.println("beforeScenario");
	}

	@After
	public void afterScenario() {
		//System.out.println("afterScenario");
		TestBase.tearDown();
	}

}