package com.booksWagon.stepDefinition;

import java.io.IOException;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.booksWagon.pages.SearchPage;
import com.booksWagon.utils.DriverManager;
import com.booksWagon.utils.Utils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFunctionality {

    WebDriver driver = DriverManager.getDriver();
    SearchPage search = new SearchPage();
    String path = "C:\\Users\\tavva.teja\\Downloads\\BooksWagonProject\\BooksWagonProject\\src\\test\\resources\\testingData\\TestData.xlsx";
    List<String> list = new ArrayList<>();

    @Given("user is logged in and is on homepage")
    public void user_is_logged_in_and_is_on_homepage() throws IOException {
        search.launch();
        search.enterCredentials();
    }

    @When("user is searching for item and searched items are shown")
    public void user_is_searching_for_item_and_searched_items_are_shown() throws IOException {
        int row = Utils.getRowCount(path, "Data1");

        for (int i = 1; i < row; i++) {
            String keywordToSearch = Utils.getCellData(path, "Data1", i, 0);
            search.enterAndSearch(keywordToSearch);
            boolean val = search.validateSearch(keywordToSearch);
            boolean asser = true;
            Assert.assertEquals(asser, val);
            list.add(Boolean.toString(val));
            search.navigateBack();
        }
    }

    @Then("storing the result in excel")
    public void storing_the_result_in_excel() throws IOException {
        int row = Utils.getRowCount(path, "Data1");
        search.populateExcel(path, list, row);
    }

    @When("user is searching for item and searched refined items are shown")
    public void user_is_searching_for_item_and_searched_refined_items_are_shown() throws IOException {
        String keywordToSearch = Utils.getCellData(path, "Data2", 1, 0);
        search.enterAndSearch(keywordToSearch);
    }

    @And("user is refining the search by title")
    public void user_is_refining_the_search_by_title() throws InterruptedException, IOException {
        search.searchTitle();
        boolean val = search.assertTitle();
        boolean asser = true;
        Assert.assertEquals(asser, val);
        search.navigateBack();
        Utils.setCellData(path, "Data2", 1, 3, Boolean.toString(val));
    }

    @And("user is refining the search by availability")
    public void user_is_refining_the_search_by_availability() throws InterruptedException, IOException {
        search.searchAvailability();
        boolean val = search.assertAvailability();
        boolean asser = true;
        Assert.assertEquals(asser, val);
        search.navigateBack();
        Utils.setCellData(path, "Data2", 2, 3, Boolean.toString(val));
    }

    @And("user is refining the search by binding")
    public void user_is_refining_the_search_by_binding() throws InterruptedException, IOException {
        search.searchBinding();
        boolean val = search.assertBinding();
        boolean asser = true;
        Assert.assertEquals(asser, val);
        search.navigateBack();
        Utils.setCellData(path, "Data2", 3, 3, Boolean.toString(val));
    }

    @And("user is refining the search by language")
    public void user_is_refining_the_search_by_language() throws InterruptedException, IOException {
        search.searchLanguage();
        boolean val = search.assertLangauge();
        boolean asser = true;
        Assert.assertEquals(asser, val);
        search.navigateBack();
        Utils.setCellData(path, "Data2", 4, 3, Boolean.toString(val));
    }
}