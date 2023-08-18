package com.virgingames.currencyinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;


public class CurrencySteps {
    @Step("Get data with currency: GBP")
    public ValidatableResponse getDataWithCurrencyGBP() {
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.currencyGBP)
                .then();
    }

    @Step("Get data with currency: EUR")
    public ValidatableResponse getDataWithCurrencyEUR() {
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.currencyEUR)
                .then();
    }

    @Step("Get data with currency: SEK")
    public ValidatableResponse getDataWithCurrencySEK() {
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.currencySEK)
                .then();
    }
}
