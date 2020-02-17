package project.controller;

import project.view.View;

import java.util.Scanner;
import project.controller.*;

import static project.controller.regexContainer.*;
import static project.view.TextConstant.*;

public class InputData {
    public String firstName;
    public String login;

    private View view;
    Scanner sc;

    public InputData(View view, Scanner sc){
        this.view = view;
        this.sc = sc;
    }
    public void InputNote(){
        dataController dataController = new dataController(view, sc);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;
        this.firstName = dataController.inputStringWithScanner(FIRST_NAME, str);
        this.login = dataController.inputStringWithScanner(LOGIN_DATA, REGEX_LOGIN);
    }

}
