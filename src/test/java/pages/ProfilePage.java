package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    private final SelenideElement profileButton = $(".nav-tab.tab-profile");

    public void verifyProfileButton() {
        profileButton.shouldHave(Condition.text("Войти"));
    }

    public void clickProfileButton() {
        profileButton.click();
    }
}