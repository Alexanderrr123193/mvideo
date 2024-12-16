import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import pages.MvideoPage;
import pages.*;

public class MvideoTest extends TestBase {

    MvideoPage mvideoPage = new MvideoPage();
    HairStylingProductsPage hairStylingProductsPage = new HairStylingProductsPage();
    CartPage cartPage = new CartPage();
    ProfilePage profilePage = new ProfilePage();
    LoginPage loginPage = new LoginPage();

    @DisplayName("Проверка корзины на главной странице")
    @Test
    public void testCart() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        cartPage.openCart();
        cartPage.verifyEmptyCartMessage("Корзина пуста");
    }

    @DisplayName("Проверка видимости номера телефона на главной странице")
    @Test
    public void testPhone() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        mvideoPage.checkPhoneNumber();
    }

    @DisplayName("Проверка профиля на главной странице")
    @Test
    public void testVisibleProfile() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        profilePage.verifyProfileButton();
    }

    @DisplayName("Проверка возможности залогиниться")
    @Test
    public void testVisibleProfileToLogInToTheSite() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        profilePage.clickProfileButton();
        loginPage.verifyLoginFormHeader("Вход или регистрация");
    }

    @DisplayName("Проверка наличия категории товара в каталоге")
    @Test
    public void testCheckProductCategory() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        mvideoPage.checkProductCategoryAvailability();
        hairStylingProductsPage.checkCategoryPageTitle("Товары для укладки волос");
    }
}