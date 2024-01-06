package creational.factory;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        WindowsButton button = new WindowsButton();
        return button;
    }

}
