package creational.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dialog dialog = null;
        Scanner sc = new Scanner(System.in);
        String sys = sc.nextLine();
        sc.close();
        if(sys.equalsIgnoreCase("macos")){
           dialog = new MacOsDialog();
        } else {
            dialog = new WindowsDialog();
        }
        dialog.render();
    }
    
}
