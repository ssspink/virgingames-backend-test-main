package com.virgingames.currencyinfo;

import com.virgingames.testbase.TestBase;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;


@RunWith(SerenityRunner.class)
public class CurrencyTest extends TestBase {

    static String currency;
    @Steps
    CurrencySteps currencySteps;

    @Title("Validate Currency GBP")
    @Test
    public void currencyGBP() {
        ValidatableResponse response = currencySteps.getDataWithCurrencyGBP();
        response.statusCode(200).log().ifValidationFails();
        response.body("data.pots[1].currency", equalTo("GBP"));
    }

    @Title("Validate Currency EUR")
    @Test
    public void currencyEUR() {
        ValidatableResponse response = currencySteps.getDataWithCurrencyEUR();
        response.statusCode(200).log().ifValidationFails();
        response.body("data.pots[1].currency", equalTo("EUR"));
    }

    @Title("Validate Currency SEK")
    @Test
    public void currencySEK() {
        ValidatableResponse response = currencySteps.getDataWithCurrencySEK();
        response.statusCode(200).log().ifValidationFails();
        response.body("data.pots[1].currency", equalTo("SEK"));
    }
}
