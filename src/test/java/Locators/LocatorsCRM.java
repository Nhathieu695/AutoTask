package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.PublicKey;
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
        public static String linkNewCustomers = "//a[normalize-space()='New Customer']";
        public static String linkCustomerDetails = "//a[@href='#contact_info']";
        public static String inputCompany = "//input[@id='company']";
        public static String inputVatNumber = "//input[@id='vat']";
        public static String inputPhone = "//input[@type='text' and @id='phonenumber']";
        public static String inputWebsite = "//input[@id='website' or @name='website']";

        // Add new Groups
        public static String buttonAddNewGroups = "//a[@data-toggle='modal']";
        public static String inputGroups = "//input[@id='name']";
        public static String buttonSaveGroups = "//button[@class='btn btn-primary']";
        public static String selectGroups = "//button[contains(@aria-owns,'bs-select-1')]/descendant::div[3]";
        public static String chooseGroups = "//div[@class='tab-content mtop15']//li[1]";

        // Add Currency
        public static String selectCurrency = "//button[contains(@aria-owns,'bs-select-2')]/descendant::div[3]";
        public static String chooseCurrency = "//small[normalize-space()='$']";

        // Add default Language
        public static String selectDefaultLanguage = "//button[contains(@aria-owns,'bs-select-3')]/descendant::div[3]";
        public static String chooseDefaultLanguage = "//span[normalize-space()='Vietnamese']";


        public static String textAreaAddress = "//textarea[@id='address']";
        public static String inputCity = "//input[@id='city']";
        public static String inputState = "//input[@id='state']";
        public static String inputZipCode = "//input[@id='zip']";

        // Add Country
        public static String selectCountry = "//button[contains(@aria-owns,'bs-select-4')]/descendant::div[3]";
        public static String chooseCountry = "//span[normalize-space()='Vietnam']";

        public static String buttonSaveandCreateContact = "//button[normalize-space()='Save and create contact']";
        public static String buttonSave = "//button[@class='btn btn-primary only-save customer-form-submiter']";

        //Xpath tương đối 6-10
        public static String linkProject = "//ul[@id='side-menu']/descendant::li[@class='menu-item-projects']/a";
        public static String headerProject = "//div[@class='panel-footer text-right']/ancestor::div[4]//h4";
        public static String linkFormProject = "//li[@role='presentation']/child::a[@href='#tab_project']";
        public static String inputProjectName = "//label[@for='name']/following-sibling::input";

        // select Customer
        public static String selectCustomer = "//button[contains(@aria-owns,'bs-select-6')]/descendant::div[3]";
        public static String inputCustomer = "//button[contains(@aria-owns,'bs-select-6')]/following-sibling::div/child::div/input";
        public static String chooseCustomer = "//span[@class='text' and text()='NATIONAL AUSTRALIA BANK']";

        public static String textCalculate_tasks = "//div[@class='form-group']/descendant::label[normalize-space()='Calculate progress through tasks']";
        public static String checkboxCalculate = "//div[@class='checkbox checkbox-success']/child::input";


        public static String progressProject = "//div[@role='tabpanel']/child::div[3]/following-sibling::label";
        public static String PercentProcessProject = "//div[@role='tabpanel']/child::div[3]/following-sibling::label/span";
        public static String fluctuationProgressProject = "//div[@role='tabpanel']/child::input";

        // select billing type
        public static String buttonBillingType = "//select[@id='billing_type']/following::button[1]";
        public static String chooseBillingType = "//a[@id='bs-select-1-2']";

        //select status
        public static String buttonStatus = "//select[@id='status']/following::button[1]";
        public static String chooseStatus = "//a[@id='bs-select-2-1']";

        public static String inputRatePerHour = "//div[@app-field-wrapper='description']/parent::div/descendant::div[@app-field-wrapper='project_rate_per_hour']/child::input";
        public static String inputEstimatedHours = "//div[@app-field-wrapper='estimated_hours']/child::input";

        //select member
        public static String buttonMembers = "//select[@id='project_members[]']/following-sibling::button";
        public static String inputMembers = "//select[@id='project_members[]']/following::div[5]/child::input";
        public static String chooseMembers = "//span[normalize-space()='Admin Anh Tester']";

        public static String inputStartDate = "//div[@class='input-group date']/child::input[@id='start_date']";
        public static String inputDeadline = "//div[@class='input-group date']/child::input[@id='deadline']";

        public static String inputTags = "//p[normalize-space()='Description']/preceding-sibling::div[1]/ul/li/input";

        //edit iFrame
        public static String editDescription = "//iframe[@id='description_ifr']";

        public static String checkboxSendCreatedEmail = "//label[normalize-space()='Send project created email']/preceding-sibling::input";
        public static String buttonSaveProject = "//div[@class='panel_s']/child::div[2]/button";
}
