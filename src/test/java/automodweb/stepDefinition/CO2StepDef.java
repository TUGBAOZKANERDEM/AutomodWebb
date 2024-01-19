package automodweb.stepDefinition;

import automodweb.pages.CO2Page;
import automodweb.utilities.Driver;
import automodweb.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.sql.SQLOutput;

public class CO2StepDef {
    CO2Page co2Page=new CO2Page();


    @When("kullanıcı dropdowna tıklar.")
    public void kullanıcıDropdownaTıklar() throws InterruptedException {

        co2Page.dropdown.click();
        Thread.sleep(2000);
    }


    @Then("Kullanıcı Dropdowndan Aller retour seçeneğini seçer.")
    public void kullanıcıDropdowndanAllerRetourSeceneginiSecer() throws InterruptedException {
        co2Page.allerRetourDropdown.click();
        Thread.sleep(2000);

        String expectedAllerRetourText="Aller-retour";
        String actualAllerRetourText=co2Page.selectedAllerRetour.getText();
        Assert.assertEquals(expectedAllerRetourText, actualAllerRetourText);
    }

    @And("Kullanıcı De kutusuna tıklar.")
    public void kullanıcıDeKutusunaTıklar() {
        co2Page.DeBox.click();
    }

    @And("KUllanıcı De kutusuna bir yerleşim yeri girer.")
    public void kullanıcıDeKutusunaBirYerlesimYeriGirer() {
        co2Page.DeBox.sendKeys("Gare de Rouen Rive Droite, Rouen");
        co2Page.selectedLocation.click();
    }

    @And("Kullanıcı A kutusuna tıklar.")
    public void kullanıcıAKutusunaTıklar() {
        co2Page.ABox.click();
    }

    @And("Kullanıcı A kutusuna bir yerleşim yeri girer.")
    public void kullanıcıAKutusunaBirYerlesimYeriGirer() {
        co2Page.ABox.sendKeys("Lisieux, Lisieux");
        co2Page.selectedALocation.click();
    }

    @And("Kullanıcı Aller kutusuna tıklar.")
    public void kullanıcıAllerKutusunaTıklar() throws InterruptedException {
        co2Page.allerLink.click();
        Thread.sleep(2000);
    }


    @And("Kullanıcı Aller kutusuna takvimden tarih seçer.")
    public void kullanıcıAllerKutusunaTakvimdenTarihSecer() throws InterruptedException {
        Thread.sleep(2000);

        co2Page.AllerCalendarDate.click();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }


    @And("Kullanıcı Aller kutusundan saate tıklar.")
    public void kullanıcıAllerKutusundanSaateTıklar() throws InterruptedException {
        Thread.sleep(5000);
        co2Page.AllerHeure.click();

    }

    @And("Kullanıcı Aller kutusundan saat seçer.")
    public void kullanıcıAllerKutusundanSaatSecer() throws InterruptedException {
        Thread.sleep(3000);
        co2Page.AllerHeureChosen.click();

    }

    @And("Kullanıcı Retour kutusuna tıklar.")
    public void kullanıcıRetourKutusunaTıklar() throws InterruptedException {

        Thread.sleep(2000);
        co2Page.retourLink.click();
    }

    @And("kullanıcı Retour kutusundan tarih seçer.")
    public void kullanıcıRetourKutusundanTarihSecer() throws InterruptedException {
        Thread.sleep(2000);
        co2Page.RetourCalendarDate.click();

    }

    @And("Kullanıcı Retour kutusundan saate tıklar.")
    public void kullanıcıRetourKutusundanSaateTıklar() throws InterruptedException {
        Thread.sleep(2000);
        co2Page.retourHeure.click();

    }

    @And("Kullanıcı Retour kutusundan saat seçer.")
    public void kullanıcıRetourKutusundanSaatSecer() throws InterruptedException {
        Thread.sleep(2000);
        co2Page.retourSelectedHeure.click();
        co2Page.cerezLink.click();
    }


    @And("Kullanıcı Rechercher butonuna tıklar.")
    public void kullanıcıRechercherButonunaTıklar() {

        co2Page.rechercherButton.click();
    }


    @Then("Kullanıcı Transport en commun başlığını görür.")
    public void kullanıcıTransportEnCommunBaslıgınıGorur() {
        String expectedHeader="Transport en commun";
        String actualHeader=co2Page.transportEnCommunHeader.getText();
        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @And("Kullanıcı arama sonuçlarından herhangi birini seçer.")
    public void kullanıcıAramaSonuclarındanHerhangiBiriniSecer() throws InterruptedException {
        Thread.sleep(2000);
        co2Page.aramaSonucu.click();

    }

    @And("Kullanıcı Voir les étapes butonuna tıklar.")
    public void kullanıcıVoirLesEtapesButonunaTıklar() throws InterruptedException {

        ReusableMethods.scrollEnd();
        Thread.sleep(2000);
        co2Page.voirLesEtapes.click();

        ReusableMethods.scrollEnd();

    }

    @Then("Kullanıcı Karbon emisyon değerini görür.")
    public void kullanıcıCOEmisyonDegeriniGorur() {

        System.out.println("co2Page.firstCo2Result.isDisplayed() = " + co2Page.firstCo2Result.isDisplayed());
    }

    @And("KUllanıcı De kutusuna farklı bir yerleşim yeri girer.")
    public void kullanıcıDeKutusunaFarklıBirYerlesimYeriGirer() {
        co2Page.DeBox.sendKeys("Gare de Flers, Flers");
        co2Page.selectedgareDeFlerOption.click();


    }

    @And("Kullanıcı A kutusuna farklı bir yerleşim yeri girer.")
    public void kullanıcıAKutusunaFarklıBirYerlesimYeriGirer() throws InterruptedException {
        co2Page.ABox.sendKeys("Rouen Rive Droite, Rouen");
        Thread.sleep(2000);
        co2Page.selectedRouenOption.click();

    }

    @Then("Kullanıcı karbon emisyon değerinin değiştiğini görür.")
    public void kullanıcıKarbonEmisyonDegerininDegistiginiGorur() {
        co2Page.secondCo2Result.isDisplayed();

        if (co2Page.firstCo2Result== co2Page.secondCo2Result){
            System.out.println("Test is FAILED");
        }else{
            System.out.println("Test is PASSED!");
        }

    }
}
