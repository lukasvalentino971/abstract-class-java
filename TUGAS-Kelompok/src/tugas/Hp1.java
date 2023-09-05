package tugas;

public class Hp1 extends Samsung {

    private int ukuranLayar;
    private int android;
    private int volume;
    private boolean isPowerOn;

    Hp1(int ukuranLayar, int android, int volume){
        this.ukuranLayar = ukuranLayar;
        this.android = android;
        this.volume = volume;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setAndroid(int android) {
        this.android = android;
    }

    public int getAndroid() {
        return android;
    }

    @Override
    public void versi(String v) {
        System.out.print(v);
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Kondisi             : On...");
    }



    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Kondisi             : Off...");
    }

    @Override
    public void volumeUp() {
        if(isPowerOn){
            if (this.volume == max_volume) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang     : " + this.getVolume());
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

    public void cetakInfo(){
        System.out.println("Ukuran Layar        : " + this.ukuranLayar);
        System.out.println("Versi Android       : " + this.android);
        System.out.println("Volume              : " +getVolume());
    }
}
