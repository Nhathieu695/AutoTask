package WebElement;

import Locators.LocatorsCRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementCRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");
        //login
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LocatorsCRM.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LocatorsCRM.buttonLogin)).click();

        //Add new Customers
        driver.findElement((By.xpath(LocatorsCRM.menuCustomers))).click();
        driver.findElement(By.xpath(LocatorsCRM.linkNewCustomers)).click();
        driver.findElement(By.xpath(LocatorsCRM.linkCustomerDetails)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputCompany)).sendKeys("NATIONAL AUSTRALIA BANK");
        driver.findElement(By.xpath(LocatorsCRM.inputVatNumber)).sendKeys("10");
        driver.findElement(By.xpath(LocatorsCRM.inputPhone)).sendKeys("4203480234802");
        driver.findElement(By.xpath(LocatorsCRM.inputWebsite)).sendKeys("https://www.nab.com.au/");
        driver.findElement(By.xpath(LocatorsCRM.buttonAddNewGroups)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputGroups)).sendKeys("NAB");
        driver.findElement(By.xpath(LocatorsCRM.buttonSaveGroups)).click();
        driver.findElement(By.xpath(LocatorsCRM.selectGroups)).click();
        driver.findElement(By.xpath(LocatorsCRM.chooseGroups)).click();
        driver.findElement(By.xpath(LocatorsCRM.selectCurrency)).click();
        driver.findElement(By.xpath(LocatorsCRM.chooseCurrency)).click();
        driver.findElement(By.xpath(LocatorsCRM.selectDefaultLanguage)).click();
        driver.findElement(By.xpath(LocatorsCRM.chooseDefaultLanguage)).click();
        driver.findElement(By.xpath(LocatorsCRM.textAreaAddress)).sendKeys("Nguyễn Thái Sơn");
        driver.findElement(By.xpath(LocatorsCRM.inputCity)).sendKeys("Hồ Chí Minh");
        driver.findElement(By.xpath(LocatorsCRM.inputState)).sendKeys("Gò Vấp");
        driver.findElement(By.xpath(LocatorsCRM.inputZipCode)).sendKeys("7000");
        driver.findElement(By.xpath(LocatorsCRM.selectCountry)).click();
        driver.findElement(By.xpath(LocatorsCRM.chooseCountry)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonSave)).click();
        Thread.sleep(2000);

        // Add new Project
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://crm.anhtester.com/admin/projects/project");
        System.out.println("get title " + driver.getTitle());
        driver.findElement(By.xpath(LocatorsCRM.inputProjectName)).sendKeys("Practice webElement and webDriver");
        driver.findElement(By.xpath(LocatorsCRM.selectCustomer)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.inputCustomer)).sendKeys("NATIONAL AUSTRALIA BANK");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.chooseCustomer)).click();
        driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).click();
        driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).click();
        System.out.println("check box" + driver.findElement(By.xpath(LocatorsCRM.checkboxCalculate)).isSelected());
        driver.findElement(By.xpath(LocatorsCRM.buttonBillingType)).click();
        driver.findElement(By.xpath(LocatorsCRM.chooseBillingType)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonStatus)).click();
        driver.findElement(By.xpath(LocatorsCRM.chooseStatus)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputRatePerHour)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputRatePerHour)).sendKeys("123");
        driver.findElement(By.xpath(LocatorsCRM.inputEstimatedHours)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputEstimatedHours)).sendKeys("456");
        driver.findElement(By.xpath(LocatorsCRM.buttonMembers)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.inputMembers)).sendKeys("Admin Anh Tester");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.chooseMembers)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputStartDate)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputStartDate)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputStartDate)).sendKeys("05-11-2003");
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.inputDeadline)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputDeadline)).clear();
        driver.findElement(By.xpath(LocatorsCRM.inputDeadline)).sendKeys("09-05-2025");
        driver.findElement(By.xpath("//label[normalize-space()='Tags']")).click();
        driver.findElement(By.xpath(LocatorsCRM.inputTags)).click();
        driver.findElement(By.xpath(LocatorsCRM.inputTags)).sendKeys("hieu");
       driver.findElement(By.xpath("//p[@class='bold']")).click();
        // switch to iframe
        WebElement iframe = driver.findElement(By.id("description_ifr"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.id("tinymce")).click();
        driver.findElement(By.id("tinymce")).sendKeys("thực hành webDriver");
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.xpath(LocatorsCRM.checkboxSendCreatedEmail)).click();
        driver.findElement(By.xpath(LocatorsCRM.buttonSaveProject)).click();

        driver.quit();
    }
}
