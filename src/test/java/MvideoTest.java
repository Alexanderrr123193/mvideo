import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class MvideoTest extends TestBase {
    @DisplayName("Check cart on main page")
    @Test
    public void testCart() {
        Selenide.open("https://www.mvideo.ru");
        Selenide.$(".nav-tabs .nav-tab.tab-cart").click();
        Selenide.$(".cart-empty__title").shouldHave(Condition.text("Корзина пуста"));


    }
    @DisplayName("Check visible number phone on main page")
    @Test
    public void testPhone(){
        Selenide.open("https://www.mvideo.ru");
        Selenide.$("mvid-header-container .phone-link-text")
                .shouldHave(Condition.text("8-800-600-7775"));


    }
    @DisplayName("Check visible profile on main page")
    @Test
    public void testVisibleProfile(){
        Selenide.open("https://www.mvideo.ru");
        Selenide.$(".nav-tab.tab-profile")
                .shouldHave(Condition.text("Войти"));
    }
    @DisplayName("Check the ability to log in to the site")
    @Test
    public void testVisibleProfileToLogInToTheSite(){
        Selenide.open("https://www.mvideo.ru");
        Selenide.$(".nav-tab.tab-profile").click();
        Selenide.$("mvid-login-form-phone form h2")
                .shouldHave(Condition.text("Вход или регистрация"));
    }

    @DisplayName("Checking the availability of the product category")
    @Test
    public void testCheckProductCategory() {
        Selenide.open("https://www.mvideo.ru");
        Selenide.$(".ng-star-inserted .button__label")
                .shouldBe(Condition.visible)
                .click();
     SelenideElement audioCategory = $("div.left-menu > div:nth-child(9)").shouldBe(Condition.visible);
       actions().moveToElement(audioCategory).perform();
        audioCategory.shouldBe(Condition.visible);
        Selenide.$(".links-container.links-container--visible .main-links__link-home[href='https://www.mvideo.ru/tovary-dlya-ukladki-volos-4887']")
                .shouldBe(Condition.visible)
                .click();
        Selenide.$("body > div.wrapper > div > div.main-holder > div > div > div.page-container.clearfix > div.content-main-title.section > h1")
                .shouldHave(Condition.text("Товары для укладки волос"));
    }
}
