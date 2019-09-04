package app;
import java.util.Scanner;
public class kasus1 {
    public static void main(String[] args) {
        int i,j;
        int [][] A,B,C;
        Scanner input = new Scanner(System.in);
        A=new int[2][2];
        B=new int[2][2];
        C=new int[2][2];
        A[0][0]=1;
        A[0][1]=2;
        A[1][0]=3;
        A[1][1]=4;
        B[0][0]=1;
        B[0][1]=2;
        B[1][0]=3;
        B[1][1]=4;
        System.out.println("Matriks A");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(A[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("\nMatriks B");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(B[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("\nPenjumlahan Matriks A dan Matriks B");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("\n\"Merubah Matriks A dan Matriks B\"");
        System.out.println("\nMatriks A");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print("Matriks A["+(i+1)+"]["+(j+1)+"] : ");
                A[i][j]=input.nextInt();
            }
        }
        System.out.println("\nMatriks B");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print("Matriks B["+(i+1)+"]["+(j+1)+"] : ");
                B[i][j]=input.nextInt();
            }
        }
        System.out.println("\nMatriks A Baru");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(A[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("\nMatriks B Baru");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                System.out.print(B[i][j]+" ");
            }
             System.out.println();
        }
        System.out.println("\nPenjumlahan Matriks A baru dan Matriks B baru");
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                C[i][j]=A[i][j]+B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
}