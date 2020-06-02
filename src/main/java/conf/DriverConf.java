package conf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.co.test")
public class DriverConf {


    @Bean
    public WebDriver webDriver() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "src/main/resources/drivers/chromedriver");
        return new ChromeDriver();
    }

}
