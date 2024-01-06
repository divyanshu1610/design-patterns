package creational.abstractfactory;

public class MacOsCheckBox implements CheckBox {

    @Override
    public void onChecked() {
        System.out.println("MacOS CheckBox checked!!");
    }

}
