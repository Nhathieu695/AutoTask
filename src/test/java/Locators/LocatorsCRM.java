package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsCRM {

        // Xpath tương đối 1_5
        // trang login
        public static String headerLogin = "//h1[normalize-space()='Login']";
        public static String inputEmail = "//input[@id='email']";
        public static String inputPassword = "//input[@id='password']";
        public static String checkBoxRememberMe = "//input[@id='remember']";
        public static String buttonLogin = "//button[normalize-space()='Login']";
        public static String linkForgotPassword = "//a[contains(@href,'https://crm.anhtester.com/admin/authentication/forgot_password')]";
        public static String menuCustomers = "//span[normalize-space()='Customers']";

        // form new customer
        public static String linkCustomerDetails = "//a[@href='#contact_info']";
        public static String inputCompany = "//input[@id='company']";
        public static String inputVatNumber = "//input[@id='vat']";
        public static String inputPhone = "//input[@type='text' and @id='phonenumber']";
        public static String inputWebsite = "//input[@id='website' or @name='website']";
        public static String inputGroups = "//div[@class='input-group input-group-select select-groups_in[]']//div[@class='filter-option-inner-inner' and normalize-space()='Nothing selected']";
        public static String buttonGroups = "//div[@class='dropdown bootstrap-select show-tick input-group-btn _select_input_group bs3']//button[@title='Nothing selected']";
        public static String buttonCurrency = "//div[@class='dropdown bootstrap-select bs3 open']//button[@title='System Default']";
        public static String buttonDefaultLanguage = "//button[@class='btn dropdown-toggle btn-default']";
        public static String textAreaAddress = "//textarea[@id='address']";
        public static String inputCity = "//input[@id='city']";
        public static String inputState = "//input[@id='state']";
        public static String inputZipCode = "//input[@id='zip']";
        public static String inputCountry = "//div[@app-field-wrapper='country']//div[@class='filter-option-inner-inner'][normalize-space()='Nothing selected']";
        public static String buttonCountry = "//div[@app-field-wrapper='country']//button[@title='Nothing selected']";
        public static String buttonSaveandCreateContact = "//button[normalize-space()='Save and create contact']";
        public static String buttonSave = "//button[@class='btn btn-primary only-save customer-form-submiter']";

        //Xpath tương đối 6-10
        public static String linkProject = "//ul[@id='side-menu']/descendant::li[@class='menu-item-projects']/a";
        public static String headerProject = "//div[@class='panel-footer text-right']/ancestor::div[4]//h4";
        public static String linkFormProject = "//li[@role='presentation']/child::a[@href='#tab_project']";
        public static String inputProjectName = "//label[@for='name']/following-sibling::input";
        public static String buttonCustomer = "//div[@class='dropdown-menu open']/preceding-sibling::button[@class='btn dropdown-toggle bs-placeholder btn-default']";
        public static String textCalculate_tasks = "//div[@class='form-group']/descendant::label[normalize-space()='Calculate progress through tasks']";
        public static String checkboxCalculate = "//div[@class='checkbox checkbox-success']/child::input";
        public static String progressProject = "//div[@role='tabpanel']/child::div[3]/following-sibling::label";
        public static String PercentProcessProject = "//div[@role='tabpanel']/child::div[3]/following-sibling::label/span";
        public static String fluctuationProgressProject = "//div[@role='tabpanel']/child::input";
        public static String buttonBillingType = "//select[@id='billing_type']/following::button";
        public static String buttonStatus = "//select[@id='status']/following::button";
        public static String inputRatePerHour = "//div[@app-field-wrapper='description']/parent::div/descendant::div[@app-field-wrapper='project_rate_per_hour']/child::input";
        public static String inputEstimatedHours = "//div[@app-field-wrapper='estimated_hours']/child::input";
        public static String buttonMembers = "//div[@class='dropdown bootstrap-select show-tick bs3']/child::button[@data-id='project_members[]']";
        public static String inputStartDate = "//div[@class='input-group date']/child::input[@id='start_date']";
        public static String inputDeadline = "//div[@class='input-group date']/child::input[@id='deadline']";
        public static String inputTags = "//p[normalize-space()='Description']/preceding-sibling::div[1]/child::input";
        public static String editDescription = "//p[normalize-space()='Description']/following-sibling::div[1]/descendant::div[2]/child::div[2]/child::div[1]";
        public static String checkboxSendCreatedEmail = "//label[normalize-space()='Send project created email']/preceding-sibling::input";
        public static String buttonSaveProject = "//div[@class='panel_s']/child::div[2]/button";
}
