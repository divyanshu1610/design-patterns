package creational.factory;

public abstract class Dialog {

    public abstract Button createButton();

    public void render() {
        Button button = createButton();
        System.out.println("Rendering Button :" + button.getType());
        button.render();
    }
}