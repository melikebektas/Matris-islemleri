import java.io.PrintStream;

public class Matrix { 


    private int satirToplam;

    private Matrix(int a, int b) {                     
        int[][] dizi = new int[a][b]; 

        for (int i = 0; i < a; i++) {  
            for (int j = 0; j < b; j++) {

                dizi[i][j] = 4 * i + (j + 1);
            }

        }
        for (int i = 0; i < a; i++) {             System.out.println("");
            for (int j = 0; j < b; j++) {
                System.out.print(dizi[i][j] + " ");

            }

        }

    }

    private int satirTopla(int satirNo) { 
        int satirToplam = 0;
        int[][] dizi;
        int i=0;
        int j=0;
        dizi = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

           for (j=0;j<4;j++){  
               satirToplam += dizi[satirNo][j];
       }

        return satirToplam;
    }

    private int sutunTopla(int sutunNo){
        int sutunToplam =0;
        int i=0;
        int j=0;
        int[][] dizi;
        dizi = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

       
        for (i=0; i<3;i++) sutunToplam += dizi[i][sutunNo];
        return sutunToplam;

    }


    private void satirSutunDegistir() {
        
        int A[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int B[][] = new int[4][3];

        System.out.print("\n" +"matrisin transpozu");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                B[j][i] = A[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + " ");
            }

        }
    }



    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        System.out.printf("\n"+"1. satırın toplamı :%d%n", matrix.satirTopla(1));
        System.out.printf("1.sutunun toplamı :%d%n", matrix.sutunTopla(1));
        matrix.satirSutunDegistir();

    }

}





