public class SmartTv {
    boolean isOn = false;
    int channel = 4;
    int volume = 25;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void increaseChannel() {
        channel++;
    }

    public void decreaseChannel() {
        channel--;
    }

    public void increaseVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
    }

}
