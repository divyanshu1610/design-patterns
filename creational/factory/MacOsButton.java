package creational.factory;

public class MacOsButton implements Button {

    @Override
    public void onClick() {
        System.out.println(getType() + " Clicked!!");
    }

    @Override
    public void render() {
        System.out.println(getType() + " rendered.");
    }

    @Override
    public String getType() {
        return "MacOs Button";
    }
    
}
