package Television_control_set;

public class TelevisionSet {

    private boolean turnOn;
    private boolean turnOff;
    private int volume;
    private int channels;

    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return true;
    }

    public void increaseTelevisionVolume() {
        volume++;
    }

    public void decreaseTelevisionVolume() {
        volume--;
    }

    public void switchDifferentChannels() {
        channels++;
    }
}
