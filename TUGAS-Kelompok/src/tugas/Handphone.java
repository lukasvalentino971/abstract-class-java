package tugas;

public abstract class Handphone {
    public int min_volume, max_volume;
    public boolean power;

    public abstract void powerOn();

    public abstract void powerOff();

    public abstract void volumeUp();

    public abstract void volumeDown();
}
