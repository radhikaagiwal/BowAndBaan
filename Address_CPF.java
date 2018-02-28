package PageFactory;

import org.openqa.selenium.By;

public class Address_CPF {
public static By addressName=By.name("full_name");
public static By Flat=By.name("address1");
public static By Colony=By.name("address2");
public static By landmark=By.name("landmark");
public static By addressStateName=By.xpath("//div[contains(text(),'Select state')]");
public static By addressCityName=By.xpath("//div[contains(text(),'Select Cities')]");
public static By pin=By.name("zipcode");
public static By addressPhone=By.name("phone");
public static By saveAddressbtn=By.xpath("//button[contains(text(),'Save Address')]");
}
