package PageFactory;

import org.openqa.selenium.By;

public class Customerdetails_CPF {
public static By customerDetailsPageTitle=By.xpath("//h2[.='Customer Details']");	
public static By newcustomerlink=By.xpath("//div[@class='col-lg-1 col-md-1 hidden-sm hidden-xs add-settings-button mob-header-button ']/descendant::a[.='New Customer']");
public static By companyname=By.name("display_name");
public static By customerfirstname=By.name("first_name");
public static By customermobilenumber=By.name("mobile_no");
public static By savecustomerdetails=By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center']/descendant::button[.=' Save']");
public static By clearcustomerdetails=By.xpath("//div[@class='col-lg-12 col-md-12 col-sm-12 col-xs-12 text-center']/descendant::button[.='  Clear']");
public static By companystatus=By.xpath("//div[@class='Select-value']");
public static By industry=By.name("//span[@id='react-select-58--value']/descendant::div[.='Select an industry']");
public static By customerRegion=By.xpath("//span[@id='react-select-59--value']/descendant::div[.='Select Region']");
public static By flatDiscount=By.name("flat_discount");
public static By customerlastname=By.name("last_name");
public static By customerdesignation=By.name("designation");
public static By customeremail=By.name("email");
public static By selectDepartment=By.xpath("//span[@id='react-select-60--value']/descendant::div[.='Select Department']");
public static By addNweContactButton=By.xpath("//button[contains(text(),'Add New Contact')]");
public static By transporter_name=By.name("transporter_name");
public static By departmentFirstName=By.xpath("//input[@id='contact_details_first_name' and @name='first_name']");
public static By pan_number=By.name("pan_number");
public static By departmentLastName=By.xpath("//input[@id='contact_details_last_name' and @name='last_name']");
public static By departmentPseudoName=By.name("pseudo_name");
public static By departmentDesignation=By.xpath("//input[@id='contact_details_designation' and @name='designation']");
public static By email=By.name("contact_details_email");
public static By departmentEmail=By.xpath("//input[@id='contact_details_email' and @name='email']");
public static By websiteName=By.name("website");
public static By phone_no=By.xpath("//input[@id='contact_details_phone_no' and @name='phone_no']");
public static By tin_no=By.name("tin_no");
public static By departmentMobile_no=By.xpath("//input[@id='contact_details_mobile_no' and @name='mobile_no']");
public static By gst_number=By.name("gst_number");
public static By fax_number=By.xpath("//input[@id='contact_details_fax_number' and @name='fax_number']");
public static By selectMailingList=By.xpath("//div[contains(text(),'Select mailing list')]");
public static By cancelDepartmentContact=By.xpath("//button[contains(text(),'Cancel')]");
public static By customerType=By.xpath("//div[contains(text(),'Select a type')]");
public static By savenAddAddress=By.xpath("//button[contains(text(),'Save & Add Address')]");
public static By saveDepartmentContact=By.xpath("//button[contains(text(),'Save Contact')]");
public static By customerdetailslink=By.xpath("//a[@href='/customers' and text()='Customer Details']");
}
