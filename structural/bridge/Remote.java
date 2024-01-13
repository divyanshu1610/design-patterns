package structural.bridge;

public class Remote {

    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower() {
        if (this.device.isEnabled()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    public void volumeUp() {
        int volume = this.device.getVolume() + 1;
        if (volume > 100) {
            volume = 100;
        }
        this.device.setVolume(volume);
    }

    public void volumeDown() {
        int volume = this.device.getVolume() - 1;
        if (volume < 0) {
            volume = 0;
        }
        this.device.setVolume(volume);
    }

}
