package com.mycompany.app;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Администратор on 01.08.2017.
 */
public class YandexTest {
    @Before
    public void setUp() throws Exception {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "D:\\Program Files\\chromedriver\\chromedriver.exe");

    }


    @Test
    public void openYandex() throws Exception {
         //WebDriver driver = new ChromeDriver();
        //driver.get("http://www.google.com");
        open("http://yandex.ru");
        $("#text").setValue("123321").pressEnter();
        String s = String.valueOf($$(".serp-adv__found"));
        assertTrue(s.contains("млн") || s.contains("тыс"));

//        int results = 0;
//        while(results < 1000) {
//            int i = $$(byXpath("//*[@class='serp-list serp-list_left_yes']//li[@class='serp-item t-construct-adapter__legacy']")).size();
//            results += i;
//            Thread.sleep(10000);
//            $(byXpath("//*[@class='pager i-bem pager_js_inited']//a[contains(text(),'дальше')]")).click();
//            //String s = String.valueOf($$("div.serp-adv__found")); //.shouldHave(CollectionCondition.texts("млн"));
//            //System.out.println(i);
//            System.out.println(results);
//        }
    }
}
