package PageFactory;

import java.util.Date;

import org.openqa.selenium.By;

public class NewOrder_CPF {
	static Date d=new Date();
public static By NewOrderlink=By.xpath("//a[@class='btn btn-color-settings font-size-desk-btn' and text()='New Order']");
public static By companyName=By.xpath("//span[@id='react-select-15--value']/descendant::div[.='Company Name']");
public static By reference_category=By.name("reference_category");
public static By product=By.xpath("//span[@id='react-select-17--value']/descendant::div[.='Product']");
public static By remarks=By.name("remarks");
public static By takenInHelpWith=By.xpath("//span[@id='react-select-16--value']/descendant::div[text()='User Name']");
public static By insurance=By.name("insurance_by");
public static By freightPaid=By.xpath("//div[@class='col-lg-8 col-md-8 col-xs-6 col-sm-6']/descendant::input[@name='freight_state']");
public static By freightToPay=By.xpath("//div[@class='col-lg-4 col-md-4 col-xs-6 col-sm-6']/descendant::input[@name='freight_state']");
public static By labourCost=By.name("Labour cost");
public static By qty=By.name("new_qty");
public static By addbtn=By.xpath("//div[@class='col-md-1 col-sm-1 col-xs-12 text-center']/descendant::span[contains(text(),'ADD')]");
public static By discount=By.name("new_discount");
public static By packingNForwarding=By.name("Packing and forwarding");
public static By saveNContinuebtn=By.xpath("//button[contains(text(),'Save & Continue')]");
public static By newOrderTitlePage=By.xpath("//h2[.='New Order']");
public static By freightvalue=By.name("Freight");
public static By productEdit=By.xpath("//div[.='Milk  M03']/following-sibling::div[5]/span/span");
public static By productDelete=By.xpath("//div[.='Milk  M03']/following-sibling::div[5]/span[2]");
public static By productUpdate=By.xpath("//div[.='Milk  M03']/following-sibling::div[5]/span[2]");
public static By productCancel=By.xpath("//div[.='Milk  M03']/following-sibling::div[5]/span[1]");
public static By editQuantity=By.xpath("//div[.='Milk  M03']/following-sibling::div[1]/input");
public static By editDiscount=By.xpath("//div[.='Milk  M03']/following-sibling::div[4]/input");
public static By orderBookDate=By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 col-xs-12 form-group'][2]/descendant::div/div/div[1]");
@SuppressWarnings("deprecation")
public static By orderBookDateCalender=By.xpath("//div[@class='react-datepicker__current-month' and text()='"+d.getMonth()+"']/descendant::div[@class='react-datepicker__day react-datepicker__day--wed' and text()='"+d.getDate()+"']");
public static By nextBtnInCalender=By.xpath("//a[@class='react-datepicker__navigation react-datepicker__navigation--next']");
public static By plannedInvoiceDate=By.xpath("//div[@class='col-lg-6 col-md-6 col-sm-6 col-xs-12 form-group'][3]/descendant::div/div/div[1]");
public static By plannedInvoiceTodaysDateCalender=By.xpath("//div[@class='react-datepicker__day react-datepicker__day--tue react-datepicker__day--selected react-datepicker__day--today']");
public static By orderBookedDateTodaysCalender=By.xpath("//div[@class='react-datepicker__day react-datepicker__day--tue react-datepicker__day--today']");


}
