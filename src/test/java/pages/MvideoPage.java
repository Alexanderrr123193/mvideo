package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class MvideoPage {

    public SelenideElement phoneNumber = $("mvid-header-container .phone-link-text");
    public SelenideElement productCategoryButton = $(".ng-star-inserted .button__label");
    public SelenideElement audioCategoryMenu = $("div.left-menu > div:nth-child(9)");
   public SelenideElement categoryLink = $(".links-container.links-container--visible .main-links__link-home[href='https://www.mvideo.ru/tovary-dlya-ukladki-volos-4887']");
    @Step("Открыть главную страницу")
    public void openMainPage() {
        Selenide.open("https://www.mvideo.ru");
    }

    @Step("Закрыть всплывающее окно выбора города")
    public void closeCityPopup() {
        Selenide.$(".location-interactive .location-options .mv-main-button--content")
                .shouldHave(Condition.text("Все верно")).click();
    }

    @Step("Проверить номер телефона на главной странице")
    public void checkPhoneNumber() {
        phoneNumber.shouldHave(Condition.text("8-800-600-7775"));
    }

    @Step("Проверить доступность категории продуктов")
    public void checkProductCategoryAvailability() {
        productCategoryButton.shouldBe(Condition.visible).click();
        audioCategoryMenu.shouldBe(Condition.visible).hover();
        categoryLink.shouldBe(Condition.visible).click();
    }
}
