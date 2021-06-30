package steps;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {

	public Hooks() {
		// TODO Auto-generated constructor stub
	}
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