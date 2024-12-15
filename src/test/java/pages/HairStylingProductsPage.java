package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HairStylingProductsPage {
    private final SelenideElement categoryPageTitle = $(".content-main-title.section h1");

    public void checkCategoryPageTitle(String expectedTitle) {
        categoryPageTitle.shouldHave(Condition.text(expectedTitle));
    }
}
