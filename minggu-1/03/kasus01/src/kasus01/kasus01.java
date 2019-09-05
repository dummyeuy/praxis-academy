// Muhammad Ghalib - KASUS01 (minggu-1, hari 03)
// hasil dokumentasi dari saya (Ghalib) menggunakan karakter '//' selalu ditempatkan diatas code block yang dimaksud
//project ini didapat atas izin HedyGading
//dan berkas .jar nya bisa dilihat di https://github.com/HedyGading/praxis-academy/blob/master/Minggu 1/01/Kasus01.jar 

// inisialisasi package project
package latihan01;
/*
    Hedy Gading
    Latihan 01
*/
//pembuatan class
public class Latihan01 {

    //memunculkan/men-display String yang dituliskan
    public static void main(String[] args) {
        System.out.println("Hello Wolrd"); // latihan 4 no 11 dan no 12
        String namadepan = "Hedy";
        String namabelakang = "Gading";
        String gent = null,status;
        System.out.println("Nama : "+namadepan+" "+namabelakang);
        /*
        *
        */
        //inisialisasi variable serta array-nya
        int i,j; //Latih 4 Variabel
        int a=2,b=2,z=1; //Latih 4 Konstanta
        double [] hasil; //Latih 4 array
        int [][] Matriks; // Latih 4 Multidimensi array
        Matriks=new int[3][3]; // Latih 4 tipe data (int,double)
        i=2;
        j=4;
        //men-display mockup ruang hitung penjumlahan, perkalian dan urutan data
        System.out.println("");
        System.out.print("penjumlahan = ");
        System.out.println(i+j);     //Latih 4 Fungsi Matematika
        System.out.print("perkalian = ");
        System.out.println(i*j);
        System.out.println("");
        System.out.println("urutan data [0-10] ");
        //eksekusi looping
        for (i=0;i<=10;i++){
            System.out.print(i+"  ");
        }
        System.out.println("\n");
        System.out.println("Segitiga bawah");
        for (i=1;i<=5;i++){   // Latih 4 looping
            for(j=i;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriks "+a+"x"+b);
        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
                Matriks[i][j]=z;
                z++;
            }
        }
        for(i=1;i<=a;i++){
            for(j=1;j<=b;j++){
                System.out.print(Matriks[i][j]+" ");
            }
            System.out.println();
        }
        //penerapan methode switch
        switch(i){ //Latih 4 switch
            case 1:
                gent="Laki-Laki";
                break;
            case 2:
                gent="Perempuan";
                break;
            case 3:
                gent="dipertanyakan";
                break;
        }
        //penerapan methode block
        if(i%2==0){ // Latih 4 Block
            System.out.println("\nvariabel i Genap");
        }
        else{
            System.out.println("\nvariabel i ganjil");
        }
        System.out.println("\nNama = Ghalib\nKelamin = "+gent);
        System.out.println("\n"+gent.charAt(i)); //String tunggal
        
    }
}