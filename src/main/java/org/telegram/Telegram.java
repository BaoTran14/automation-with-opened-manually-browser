package org.telegram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Telegram {
    WebDriver driver;

    public void beforeExecution(){
        initializeExistingBrowser();
    }

    private void initializeExistingBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    public void get_all_user_name_in_a_single_group_chat(){
        driver.findElement(By.cssSelector("ul.navbar-nav a[href='/faq']")).click();
        String title = driver.getTitle();
        System.out.println(title);
    }

    public void add_all_user_to_my_group_chat(){
        driver.findElement(By.cssSelector("ul.navbar-nav a[href='/apps']")).click();
        String title = driver.getTitle();
        System.out.println(title);
    }

    public static void main(String[] arg){
        Telegram telegram = new Telegram();
        telegram.beforeExecution();
        telegram.get_all_user_name_in_a_single_group_chat();
        telegram.add_all_user_to_my_group_chat();
    }
}
