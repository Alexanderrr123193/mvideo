package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class HairStylingProductsPage {
    private final SelenideElement categoryPageTitle = $(".content-main-title.section h1");
    @Step("Проверить заголовок страницы категории: {expectedTitle}")
    public void checkCategoryPageTitle(String expectedTitle) {
        categoryPageTitle.shouldHave(Condition.text(expectedTitle));
    }
}
