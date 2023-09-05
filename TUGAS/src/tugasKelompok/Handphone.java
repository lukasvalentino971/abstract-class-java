package tugasKelompok;

public abstract class Handphone {
    public int maxVolume;
    public int minVolume;

    Handphone(int maxVolume, int minVolume){
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
    }

    public abstract void powerOn();

    public void powerOff(){
        System.out.println("Handphone OFF");
    }

    public void volumeUp(int increment){
        System.out.println("Volume dinaikkan");
    }

    public void volumeDown(){
        System.out.println("Volume diturunkan");
    }


}
