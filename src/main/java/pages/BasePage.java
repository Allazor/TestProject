package pages;

import data.FakeData;
import helper.ElementActions;
import pages.google.MainPage;

public abstract class BasePage {
    protected ElementActions actions = new ElementActions();
    protected FakeData fakeData = new FakeData();
}
