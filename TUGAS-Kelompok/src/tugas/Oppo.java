package tugas;

public class Oppo extends Handphone {
    private int volume;
    private boolean isPowerOn;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("On...");
        System.out.println("OPPO");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Off...");
    }

    @Override
    public void volumeUp() {
        if(isPowerOn){
            if (this.volume == max_volume) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Hidupin dulu ya, rawwrrrr!!");
        }
    }

    @Override
    public void volumeDown() {
        if(isPowerOn){
            if (this.volume == min_volume) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("Hidupin dulu ya, rawwrrrr!!");
        }
    }

    public int getVolume() {
        return volume;
    }
}
