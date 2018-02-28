package PageFactory;

import org.openqa.selenium.By;

public class StateMaster_CPF {
	public static By landingpagetitle=By.xpath("//h2[.='Order Details']");
	public static By statename=By.name("new_name");
	public static By statecode=By.name("new_state_code");
	public static By addstatebtn=By.xpath("//button[.='Add State']");	
	public static By statefilterbutton=By.xpath("//button[@class='btn btn-default']");
	public static By filterstatename=By.name("stateName");
	public static By filterStateCode=By.name("stateCode");
	public static By filterStateEdit=By.xpath("//button[@class='btn-link brown-text']/descendant::i[@class='fa fa-pencil']");
	public static By editStateName=By.name("name");
	public static By editStateCode=By.name("state_code");
	public static By updateEditState=By.xpath("//button[@class='btn-link brown-text']/descendant::i[text()='Update']");
	public static By cancelEditState=By.xpath("//button[@class='btn-link brown-text']/descendant::i[text()='Cancel']");
	public static By deleteEditState=By.xpath("//button[@class='btn-link brown-text']/descendant::i[contains(text(),'Delete')]");
	
}
