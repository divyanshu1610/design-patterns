package creational.abstractfactory;

public class WindowsButton implements Button{

    @Override
    public void onClick() {
        System.out.println("Windows Button Clicked!!!");
    }

}