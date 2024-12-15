import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.MvideoPage;
public class MvideoTest extends TestBase {

    MvideoPage mvideoPage = new MvideoPage();

    @DisplayName("Check cart on main page")
    @Test
    public void testCart() {
        mvideoPage.openMainPage();
        mvideoPage.cartButton.click();
        mvideoPage.emptyCartMessage.shouldHave(Condition.text("Корзина пуста"));
    }

    @DisplayName("Check visible number phone on main page")
    @Test
    public void testPhone() {
        mvideoPage.openMainPage();
        mvideoPage.checkPhoneNumber();
    }

    @DisplayName("Check visible profile on main page")
    @Test
    public void testVisibleProfile() {
        mvideoPage.openMainPage();
        mvideoPage.checkProfileButton();
    }

    @DisplayName("Check the ability to log in to the site")
    @Test
    public void testVisibleProfileToLogInToTheSite() {
        mvideoPage.openMainPage();
        mvideoPage.profileButton.click();
        mvideoPage.loginFormHeader.shouldHave(Condition.text("Вход или регистрация"));
    }

    @DisplayName("Checking the availability of the product category")
    @Test
    public void testCheckProductCategory() {
        mvideoPage.openMainPage();
        mvideoPage.checkProductCategoryAvailability();
        mvideoPage.checkCategoryPageTitle("Товары для укладки волос");
    }
}
