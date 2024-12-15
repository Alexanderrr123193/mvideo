package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MvideoPage {

    // Локаторы для главной страницы
    public SelenideElement cartButton = $(".nav-tabs .nav-tab.tab-cart");
    public SelenideElement emptyCartMessage = $(".cart-empty__title");
    public SelenideElement phoneNumber = $("mvid-header-container .phone-link-text");
    public SelenideElement profileButton = $(".nav-tab.tab-profile");
    public SelenideElement loginFormHeader = $("mvid-login-form-phone form h2");
    public SelenideElement productCategoryButton = $(".ng-star-inserted .button__label");
    public SelenideElement audioCategoryMenu = $("div.left-menu > div:nth-child(9)");
    public SelenideElement categoryLink = $(".links-container.links-container--visible .main-links__link-home[href='https://www.mvideo.ru/tovary-dlya-ukladki-volos-4887']");
    public SelenideElement categoryPageTitle = $("body > div.wrapper > div > div.main-holder > div > div > div.page-container.clearfix > div.content-main-title.section > h1");

    // Метод для открытия главной страницы
    public void openMainPage() {
        Selenide.open("https://www.mvideo.ru");
    }
    public void checkPhoneNumber() {
        phoneNumber.shouldHave(Condition.text("8-800-600-7775"));
    }
    public void checkProfileButton() {
        profileButton.shouldHave(Condition.text("Войти"));
    }
    public void checkProductCategoryAvailability() {
        productCategoryButton.shouldBe(Condition.visible).click();
        audioCategoryMenu.shouldBe(Condition.visible).hover();
        categoryLink.shouldBe(Condition.visible).click();
    }
    public void checkCategoryPageTitle(String expectedTitle) {
        categoryPageTitle.shouldHave(Condition.text(expectedTitle));
    }
    public void closeCityPopup() {
        Selenide.$(".location-interactive .location-options .mv-main-button--content")
                .shouldHave(Condition.text("Все верно")).click();
    }

}
