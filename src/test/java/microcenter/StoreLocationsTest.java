package microcenter;

import base.CommonAPI;
import microCenterPages.HomePage;
import microCenterPages.StoreLocationsPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoreLocationsTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(StoreLocationsTest.class);

    @Test
    public void StoreLocation() {
        HomePage homePage = new HomePage(getDriver());
        homePage.scrollToViewStoreLocationsBtn(getDriver());
        homePage.clickOnStoreLocationsBtn();
        String expectedPageTitle = "Store Locations for Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
    @Test
    public void quennsStoresLocation() {
        HomePage homePage = new HomePage(getDriver());
        StoreLocationsPage storeLocationsPage = new StoreLocationsPage(getDriver());
        homePage.scrollToViewStoreLocationsBtn(getDriver());
        homePage.clickOnStoreLocationsBtn();
        storeLocationsPage.clickOnQueensLocations();
        String expectedPageTitle = "Computer Store in Flushing, NY - Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);

    }
    @Test
    public void NewJerseyStoresLocation() {
        HomePage homePage = new HomePage(getDriver());
        StoreLocationsPage storeLocationsPage = new StoreLocationsPage(getDriver());
        homePage.scrollToViewStoreLocationsBtn(getDriver());
        homePage.clickOnStoreLocationsBtn();
        storeLocationsPage.clickOnNewJerseyLocations();
        String expectedPageTitle = "Computer Store in North Jersey, NJ - Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }
    @Test
    public void VirginiaStoresLocation() {
        HomePage homePage = new HomePage(getDriver());
        StoreLocationsPage storeLocationsPage = new StoreLocationsPage(getDriver());
        homePage.scrollToViewStoreLocationsBtn(getDriver());
        homePage.clickOnStoreLocationsBtn();
        storeLocationsPage.clickOnvirginiaLocations();
        String expectedPageTitle = "Computer Store in Fairfax, VA - Micro Center";
        Assert.assertEquals(getPageTitle(),expectedPageTitle);


    }
}