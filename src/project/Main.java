package project;

import project.controller.Controller;
import project.model.Model;
import project.view.View;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
