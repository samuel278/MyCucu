package cucu3;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Calc {
@Given("I enter {int} in the calculator")
public void Enter(int num1)
{
	 System.out.println("I enter "+num1+" in the calculator");
}

@And("I press {word}")
public void add(String a)
{
	 System.out.println("I press "+a+"");
}

@And("I have entered {int} in the calculator")
public void I_have_entered_50_in_the_caluculator(int b)
{
	 System.out.println("I have entered "+b+" in the calculator");
}
@When("I press equal symbol")
public void I_press_equal_symbol()
{
	 System.out.println("I press equal symbol");
}
@Then("The result should be {int} on the screen")
public void The_result_should_be_100_on_the_screen(int c)
{
	 System.out.println("The result should be "+c+" on the screen");
}
}


