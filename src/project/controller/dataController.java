package project.controller;

import project.view.View;
import java.util.Scanner;

public class dataController {
    private View view;
    private Scanner sc;

    public dataController(View view, Scanner sc){
        this.view = view;
        this.sc = sc;
    }
    public String inputStringWithScanner(String msg, String regex){
        String result;
        view.printStringInput(msg);
        while(!(sc.hasNext()&& (result = sc.next()).matches(regex))){
            view.printWrongStringInput(msg);
        }
        return result;
    }
}
