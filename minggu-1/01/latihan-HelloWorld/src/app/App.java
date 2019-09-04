package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // String intro = "Salam kenal, saya Ghalib";
        // String namaLengkap = "Lengkapnya, Muhammad Ghalib Adhiprawira";
        // String tempatLahir = "Bandung";
        // int tanggalLahir = 12;
        // String bulanLahir = "Agustus";
        // int tahunLahir = 1996;
        // boolean nikah = statusNikah;

        String nama, statusNikah;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama lengkap Anda: ");
        nama = input.nextLine();

        System.out.print("Status pernikahan (yes/no)");
        statusNikah = input.nextLine();

        if (statusNikah.equals("yes")){
            System.out.println("Wah " + nama + ", Anda beruntung ya!");

        } else if(statusNikah.equals("no")){
            System.out.println("Maaf ya, " + nama + " belum laku nih");
        } else {
            System.out.println("Tolong dijawab dengan yes atau no");
        }
        // System.out.println(intro + ". " + namaLengkap);
        // System.out.println("Saya lahir di" + tempatLahir);
      
    }
}