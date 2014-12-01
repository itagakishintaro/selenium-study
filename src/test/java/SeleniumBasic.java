/**
 * Created by itdbd on 2014/12/01.
 */
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SeleniumBasic  {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test() {
        /*
         * 基本は、次のサイトのサンプルコードです。
         * http://www.seleniumhq.org/docs/03_webdriver.jsp
         * asset部分だけ追加しています。
         */
        driver.get("http://www.google.co.jp"); // 指定したURLに移動
        WebElement element = driver.findElement(By.name("q")); // html要素を取得
        element.sendKeys("Cheese!"); // 値を入力
        element.submit(); // submit
        // ページがロードされるまで待つ
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });
        // ページのタイトルをJUnitでテスト
        assertThat(driver.getTitle(), is("Cheese! - Google 検索"));
    }
}