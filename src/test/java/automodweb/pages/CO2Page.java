package automodweb.pages;

import automodweb.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CO2Page {

    public CO2Page(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//div[@id='is-TripType-Select-Button']")
    public WebElement dropdown;

    @FindBy(xpath="//li[@value='1']")
    public WebElement allerRetourDropdown;

    @FindBy(xpath = "//span[@class='is-Combobox-InnerValue']")
    public WebElement selectedAllerRetour;

    @FindBy(xpath="//input[@id='is-Journey-Departure']")
    public WebElement DeBox;

    @FindBy(xpath="//div[@id='is-Journey-Departure-Suggestions']//div[1]//div[2]//div[1]//div[2]")
    public WebElement selectedLocation;

    @FindBy(xpath="//input[@id='is-Journey-Arrival']")
    public WebElement ABox;

    @FindBy(xpath="//div[@role='option']//div[2]//div[1]//div[2]")
    public WebElement selectedALocation;

    @FindBy(xpath="//span[@id='is-Full-DateTimePreference-Departure-Display']")
    public WebElement allerLink;

    @FindBy(xpath = "//div[@id='is-Full-DateTimePreference-Departure-DateTimePicker']//div[@class='day'][normalize-space()='18']")
    public WebElement AllerCalendarDate;

    @FindBy(xpath = "//input[@id='is-Full-DateTimePreference-Departure-Hour-Input']")
    public WebElement AllerHeure;

    @FindBy(xpath = "//li[@id='is-Full-DateTimePreference-Departure-Hour-Input-Choice-Item-142']")
    public WebElement AllerHeureChosen;

    @FindBy(xpath="//div[@id='is-Full-DateTimePreference-Return-LabelDisplay']")
    public WebElement retourLink;

    @FindBy(xpath = "//div[@id='is-Full-DateTimePreference-Return-DateTimePicker']//div[@class='day'][normalize-space()='22']")
    public WebElement RetourCalendarDate;

    @FindBy(xpath = "//input[@id='is-Full-DateTimePreference-Return-Hour-Input']")
    public WebElement retourHeure;

    @FindBy(xpath = "//li[@id='is-Full-DateTimePreference-Return-Hour-Input-Choice-Item-150']")
    public WebElement retourSelectedHeure;

    @FindBy(xpath = "//button[@class='tarteaucitronCTAButton tarteaucitronAllow']")
    public WebElement cerezLink;

    @FindBy(xpath="//button[@id='is-Full-DateTimePreference-Return-Ok']")
    public WebElement okButton;

    @FindBy(xpath="//button[@id='is-Journey-SearchButton']")
    public WebElement rechercherButton;

    @FindBy(xpath = "//h3[@class='is-Widget-H3 is-Widget-H3_WithLatMargins']")
    public WebElement transportEnCommunHeader;

    @FindBy(xpath ="//div[@role='button']")
    public WebElement aramaSonucu;

    @FindBy(xpath = "//a[contains(@class,'is-Journey-Preview-Roadmap-Button')]")
    public WebElement voirLesEtapes;

    @FindBy(xpath = "//strong[normalize-space()='-90.2%']")
    public WebElement firstCo2Result;

    @FindBy(xpath="//div[@id='is-Journey-Departure-LabelInInput']//div[@role='option']//div[2]//div[1]//div[2]")
    public WebElement selectedgareDeFlerOption;

    @FindBy(xpath="//div[@id='is-Journey-Arrival-Suggestions']//div[1]//div[2]//div[1]//div[1]")
    public WebElement selectedRouenOption;

    @FindBy(xpath="//strong[normalize-space()='-87.2%']")
    public WebElement secondCo2Result;
}
