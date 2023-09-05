package tugas;

public class Main {
    public static void main(String[] args) {
        Hp1 hp1 = new Hp1(5, 11, 76);

        System.out.print("Merk HP             : " );
        hp1.versi("Samsung J2 Prime");
        System.out.println();
        hp1.powerOn();
        hp1.volumeUp();
        hp1.cetakInfo();

    }
}
