/*
 * This project is contributed by Muhammad Ghalib
 * .
 * dummyeuy (github, stackoverflow and any other social media/network)
 */
package latihan03;
import java.util.Scanner;
import java.io.*;
/**
 * source code diperoleh dari https://eturo.blogspot.com/2012/01/tutorial-simple-atm-machine-program-in.html
 * @author dummyeuy
 */
public class ATMMachine {

    public static void checkBalance()
    {
        System.out.println("\tSaldo Anda saat ini: " + BalanceInquiry.getBalance());
    }
    
    public static void withdrawMoney()
    {
        if(BalanceInquiry.balance==0)
        {
            System.out.println("\tSaldo Anda saat ini kosong.");
            System.out.println("\tAnda tidak bisa melakukan penarikan tunai!");
            System.out.println("\tSilahkan untuk mengisi deposit saldo Anda dahulu.");
        }
        else if(BalanceInquiry.balance<=500)
        {
            System.out.println("\tAnda tidak memiliki saldo yang cukup untuk penarikan tunai");
            System.out.println("\tPeriksa saldo Anda pada Bank terkait.");
        }
        else if(Withdraw.withdraw > BalanceInquiry.balance)
        {
            System.out.println("\tNominal penarikan tunai lebih besat daripada saldo Anda");
            System.out.println("\tMohon periksa nominal yang Anda masukkan.");
        }
        else
        {
            BalanceInquiry.balance = BalanceInquiry.balance - Withdraw.withdraw;
            System.out.println("\n\tAnda menarik tunai senilai: Rp " + Withdraw.withdraw);
        }
    }
                    
    public static void depositMoney()
    {
        System.out.println("\tAnda mendeposit senilai " + Deposit.getDeposit());
    }
    
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int select = 0;
        int choice = 0;
        
        System.out.println("====================================================");
        System.out.println("\tSelamat datang di mesin ATM sederhana");
        System.out.println("====================================================");
        System.out.println();
        
        do
        {try
                {
            do {
                
                    System.out.println("\tSilahkan pilih transaksi ATM");
                    System.out.println("\tTekan [1] Deposit");
                    System.out.println("\tTekan [2] Penarikan Tunai");
                    System.out.println("\tTekan [3] Cek Saldo");
                    System.out.println("\tTekan [4] Keluar");
                
                    System.out.print("\n\tApa yang ingin Anda lakukan? ");
                    select = read.nextInt();
    
                        if(select>4)
                        {
                            System.out.println("\n\tMohon pilih transaksi yang sesuai.");
                        }
                        else
                        {
                        switch (select)
                        {
                            case 1:
                                System.out.print("\n\tMasukkan nomimal yang akan dideposit: ");
                                Deposit.deposit = read.nextDouble();
                                BalanceInquiry.balance = Deposit.deposit + BalanceInquiry.balance;
                                depositMoney();
                                break;
                                
                            case 2:
                                
                                System.out.print("\n\tUntuk melakukan penarikan tunai, pastikan bahwa saldo rekening Anda cukup.");
                                System.out.println();
                                System.out.print("\tMasukkan nominal yang akan ditarik tunai: ");
                                Withdraw.withdraw = read.nextDouble();
                                withdrawMoney();
                                break;
                                
                            case 3:
                                checkBalance();
                                break;
                            
                            default:
                                System.out.print("\n\tKeluar dari transaksi.");
                                break;
                                
                        }
                    }                
                           
            }while(select>4);
            
            do {
                try
                {
                    System.out.println("\n\tApa Anda ingin melakukan transaksi lain?");
                    System.out.println("\n\tTekan [1] Ya \n\tTekan [2] Tidak");
                    System.out.print("\tMasukkan pilihan: ");
                    choice = read.nextInt();
                
                        if(choice>2)
                        {
                            System.out.print("\n\tMohon masukkan opsi yang benar.");
                        }
                    }
                    
                    catch(Exception e)
                    {
                        System.out.println("\tKesalahan Input! Mohon masukkan angka saja.");
                        read = new Scanner(System.in);
                        System.out.println("\tMasukkan pilihan Anda: ");
                        choice = read.nextInt();
                    }
            } while(choice>2);
        }
        catch(Exception e)
                {
                    System.out.println("\tKesalahan Input! Mohon masukkan angka saja.");
                    read = new Scanner(System.in);
                    System.out.println("\tMasukkan pilihan Anda: ");
                    select = read.nextInt();
                }
                
        }while(choice<=1);
        
        System.out.println("\n\tTerimakasih telah menggunakan mesin ATM sederhana ini.");
    }
}