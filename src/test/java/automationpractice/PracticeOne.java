package automationpractice;

import commons.BrowserUtil;
import utility.UIActions;

public class PracticeOne {

    public static void main(String[] args) {
        BrowserUtil.openBrowser();
        UIActions I = new UIActions();
        I.gotoSite("https://www.google.com");
        //....
        //....
        //.. You're automation code here ...
        //...
        //...
        BrowserUtil.closeBrowser();
    }
}
