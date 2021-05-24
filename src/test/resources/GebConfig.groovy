import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe")
driver = {
    def driverInstance = new ChromeDriver()
    driverInstance.manage().window().maximize()
    driverInstance
}

baseUrl = "https://www.hudl.com/"

