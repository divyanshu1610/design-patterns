package creational.abstractfactory;

public class WindowsCheckBox implements CheckBox{

    @Override
    public void onChecked() {
        System.out.println("Windows CheckBox checked");
    }
    
}
