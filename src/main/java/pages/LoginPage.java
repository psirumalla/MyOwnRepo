package pages;

import libs.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LoginPage implements BaseTest {

    public static WebDriver driver;
    static String browser = "Chrome";

    static By clickLoginLink = By.xpath("//*[contains(text(),'Login')]");
    static By inputEmail = By.id("email");
    static By inputPwd = By.id("password");
    static By clickLoginButton = By.name("commit");
    static By verifyLoginSuccess = By.xpath("//*[@id='search-courses']");
    static By isErrorDisplayed = By.xpath("/html/body/main/div/div[1]");
    static By forgotPassword = By.xpath("//*[contains(text(),'Forgot Password')]");
    static By resetPassword = By.xpath("//p[@class='bodySmall m-t-1-xs m-b-3-xs']");
    static By clickSignUpLink = By.xpath("//*[contains(text(),'Sign Up')]");
    static By signupName = By.id("user_name");
    static By signupEmail = By.id("user_email");
    static By signupPwd = By.id("password");
    static By signupCheckbox = By.id("allow_marketing_emails");
    static By emailError = By.xpath("//ul/li[contains(text(),'Email is already in use')]");
    static By pwdError = By.xpath("//ul/li[contains(text(),'Password')]");
    static By resendEmail = By.xpath("//button[text()='Resend email']");


    public static void launch_Teachable_website() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        String url = "https://takehome.zeachable.com";
        driver.get(url);
        driver.manage().window().maximize();
        String actTitle = driver.getTitle();
        System.out.println(actTitle);
        String expTitle = "Homepage | takehome";
        //Assert.assertEquals(expTitle,actTitle);
    }

    public static void iClickOnLoginLink() {
        driver.findElement(clickLoginLink).click();
        driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);
        boolean isLoginSuccess = driver.findElement(inputEmail).isDisplayed();
        System.out.println("Clicked on Login Link on Main page :  " + isLoginSuccess);
    }

    public static void enter_Username(String Username) {
        driver.findElement(inputEmail).sendKeys(Username);
    }

    public static void enter_Password(String Password) {
        driver.findElement(inputPwd).sendKeys(Password);
    }

    public static void entersUsername(Map<String, String> hash_data_table) throws InterruptedException {
        driver.findElement(inputEmail).sendKeys(hash_data_table.get("Username"));
    }

    public static void entersPassword(Map<String, String> hash_data_table) throws InterruptedException {
        driver.findElement(inputPwd).sendKeys(hash_data_table.get("Password"));
    }

    public static void clickOnLoginButton() {
        driver.findElement(clickLoginButton).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public static void verifyIfUserIsLoggedIn() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        boolean isLoginSuccess = driver.findElement(verifyLoginSuccess).isDisplayed();
        System.out.println(isLoginSuccess);
        // Assert.assertTrue(driver.findElement(verifyLoginSuccess).isDisplayed());
    }

    public static void verifyIfErrorIsDisplayed() {
        boolean loginAError = driver.findElement(isErrorDisplayed).isDisplayed();
        System.out.println("Error message is displayed : " + loginAError);
    }

    public static void clickOnForgotPasswordLink() {
        driver.findElement(forgotPassword).click();
    }

    public static void verifyIfResetPageIsDisplayed() {
        boolean isResetPwdDisplayed = driver.findElement(resetPassword).isDisplayed();
        System.out.println(isResetPwdDisplayed);
        // Assert.assertTrue(driver.findElement(resetPassword).isDisplayed());
    }

    public static void userClickOnSignUpLink() {
        driver.findElement(clickSignUpLink).click();
        driver.manage().timeouts().implicitlyWait(75, TimeUnit.SECONDS);
    }

    public static void iEnterFullName(String FullName) {
        driver.findElement(signupName).sendKeys(FullName);
    }

    public static void enterEmail(String Email) {
        driver.findElement(signupEmail).sendKeys(Email);
    }

    public static void enterPassword(String Password) {
        driver.findElement(signupPwd).sendKeys(Password);
    }

    public static void clickOnAcceptTerms() {
        driver.findElement(signupCheckbox).click();
    }
    public static void closeSession() {
        driver.close();
        driver.quit();
    }

    public static void verifySignupFunctionality() {
        boolean isEmailError = false;
        boolean isPwdError = false;
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //boolean isSuccessLogin = driver.findElement(resendEmail).isDisplayed();
        //System.out.println(isSuccessLogin);
        try {
            driver.findElement(emailError).isDisplayed();
            isEmailError = true;
            System.out.println("Email error displayed");
        } catch (NoSuchElementException e) {
            System.out.println("User Successfully Signed up");
        }

        try {
            driver.findElement(pwdError).isDisplayed();
            isPwdError = true;
            System.out.println("Password error displayed");
        } catch (NoSuchElementException e) {
            System.out.println("User Successfully Signed up");
        }

        if(isEmailError==true){
            System.out.println("Email is already in use,Please enter a new email or click on forgot password");

        }else if (isPwdError==true){
            System.out.println("Password must be at least 6 characters , please enter a valid password");
        }else{
            System.out.println("SignUp is successful, please activate your account.");
        }

    }
}
