package project.view;

import java.sql.Statement;
import java.util.Locale;
import java.util.ResourceBundle;

import static project.view.TextConstant.*;

public class View {
    public static String MESSAGES_BUNDLE_NAME = "messages";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(
            MESSAGES_BUNDLE_NAME,
            new Locale("ua", "UA"));
          //new Locale("en"));

    public void printMessage(String str){
        System.out.println(str);
    }
    public String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }

    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_STRING_DATA),
                bundle.getString(message)));
    }

}
