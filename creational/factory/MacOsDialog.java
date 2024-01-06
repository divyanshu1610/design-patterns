package creational.factory;

public class MacOsDialog extends Dialog{

    @Override
    public Button createButton() {
        MacOsButton macOsButton = new MacOsButton();
        return macOsButton;
    }
    
}
