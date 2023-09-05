package tugasKelompok;

public class Oppo extends Handphone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
    }

    @Override
    public void powerOff() {
        super.powerOff();
    }

    @Override
    public void volumeUp() {
        super.volumeUp();
    }

    @Override
    public void volumeDown() {
        super.volumeDown();
    }

    public int getVolume() {
        return volume;
    }
}
