package structural.bridge;

public class Application {

    public static void main(String[] args) {

        Device device = new Radio();
        Remote remote = new Remote(device);

        System.out.println("Volume : " + device.getVolume());
        remote.volumeUp();
        remote.volumeUp();
        System.out.println("Volume : " + device.getVolume());

    }

}
