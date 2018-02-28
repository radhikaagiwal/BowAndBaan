package PageFactory;

import org.openqa.selenium.By;

public class CityMaster_CPF {
public static By cityname=By.name("new_city");
public static By stateNameInCityMaster=By.xpath("//span[@id='react-select-17--value']/descendant::div[@class='Select-placeholder']");
public static By addcitybtn=By.xpath("//button[.='Add City']");
public static By cityFilterButton=By.xpath("//button[@class='btn btn-default']");
public static By cityFilterName=By.name("city_filter");
public static By filterCityEdit=By.xpath("//button[@class='btn-link brown-text']/descendant::i[@class='fa fa-pencil']");
public static By editCityName=By.name("name");
public static By editCityStateName=By.id("react-select-44--value-item");
public static By updateEditedCity=By.xpath("//i[.='Update']");
public static By cancelEditedCity=By.xpath("//i[.='Cancel']");
public static By deleteEditCity=By.xpath("//button[@class='btn-link brown-text']/descendant::i[contains(text(),'Delete')]");
}
