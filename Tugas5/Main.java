package Tugas5;

public class Main {
    public static void main(String[] args) {

        KartuDebit kartu = new KartuDebit("888", "999", "232120");
        MesinAtm mesinATM = new MesinAtm();

        mesinATM.init(kartu);
    }
}

