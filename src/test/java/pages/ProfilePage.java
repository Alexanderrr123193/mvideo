package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    private final SelenideElement profileButton = $(".nav-tab.tab-profile");
    @Step("Проверить кнопку профиля")
    public void verifyProfileButton() {
        profileButton.shouldHave(Condition.text("Войти"));
    }
    @Step("Кликнуть на кнопку профиля")
    public void clickProfileButton() {
        profileButton.click();
    }
}