package javaapplication1;

public class Main {
    public static void main(String[]args) {
        Manusia m= new Manusia();

        m.setRambut("Pendek");
        System.out.println(m.getRambut());

        System.out.println(m.memasak("Sayur Asem"));

        PesawatTelepon pt= new PesawatTelepon();

        pt.setKabel("Spiral");
        System.out.println(pt.getKabel());

        System.out.println(pt.terima_panggilan(true));
    }
}
