package creational.abstractfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GUIFactory guiFactory;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OS info [macos|win]");
        String sys = sc.nextLine();
        sc.close();
        if(sys.equalsIgnoreCase("macos")){
            guiFactory = new MacOsFactory();
        }else {
            guiFactory = new WindowsFactory();
        }
        Button button = guiFactory.createButton();
        CheckBox checkBox = guiFactory.createCheckBox();
        button.onClick();
        checkBox.onChecked();
    }
}
