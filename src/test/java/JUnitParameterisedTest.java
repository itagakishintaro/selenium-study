import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
/**
 * Created by itdbd on 2014/12/01.
 */
@RunWith(Theories.class)
public class JUnitParameterisedTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @DataPoints // ここで複数のテストデータを定義
    public static Fixture[] PARAMs = {
        new Fixture("btnK", "Google 検索"),
        new Fixture("btnI", "I'm Feeling Lucky")
    };

    @Theory
    public void JUnitパラメタライズドテスト(Fixture fixture) {
        driver.get("http://www.google.co.jp");
        // パラメータの値ごとにテストを実施
        WebElement element = driver.findElement(By.name(fixture.name));
        assertThat( element.getAttribute("value"), is(fixture.value) );
    }

    static class Fixture{
        String name;
        String value;

        public Fixture(String name, String value){
            this.name = name;
            this.value = value;
        }
    }
}
