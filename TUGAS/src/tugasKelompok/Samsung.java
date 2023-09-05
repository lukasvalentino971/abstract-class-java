package tugasKelompok;

public abstract class Samsung extends Handphone {
    private int volume;
    private boolean isPowerOn;

    Samsung(int volume, boolean isPowerOn){
        this.volume = volume;
        this.isPowerOn = isPowerOn;
    }

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
