package com.syntax.GroupExercise;

public class Task5 {
    // Picture task
}

interface WebDriver {
    void open();
    void close();
    String getTitle = null;
}

interface RemoteWebDriver extends WebDriver {
    void navigate();

}

interface TakesScreenshot extends RemoteWebDriver {
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver,TakesScreenshot, WebDriver {

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    @Override
    public void navigate() {
    }
    @Override
    public void getScreenshot() {
    }
}

class FirefoxDriver implements RemoteWebDriver{

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    @Override
    public void navigate() {
    }
}

class SafariDriver implements RemoteWebDriver{

    @Override
    public void open() {
    }

    @Override
    public void close() {
    }

    @Override
    public void navigate() {
    }
}