package statistik;

import java.util.Scanner;

public class Statistik {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int baris, kolom, jumlahBil;
        double sigma = 0, rerata = 0, varians = 0, stdev = 0, maksimal = 0 , minimal = 0;
        
        //input jumlah bilangan
        System.out.println("+--------------------------------------+");
        System.out.println("|          Program Statistika          |");
        System.out.println("+--------------------------------------+");
        System.out.println("");
        do
        {
            System.out.print("Masukkan Jumlah Bilangan (Max 100) = ");
            jumlahBil = sc.nextInt();
        }
        while(jumlahBil <= 0 || jumlahBil > 100);
        System.out.println("");
        
        int[]bil = new int[100];
        
        //input dan output bilangan
        for (baris = 0; baris < jumlahBil; baris++)
        {
            System.out.print("Bilangan ke- "+ baris +" = ");
                bil[baris] = sc.nextInt();
        }
        System.out.println("");
        
        //hitung sigma
        for (kolom = 0; kolom < jumlahBil; kolom++) 
        {
            sigma = sigma + bil[kolom];
        }
        
        //hitung rerata
        rerata = sigma / jumlahBil;
        
        //input dan output varian
        for (kolom = 0; kolom < jumlahBil; kolom++) 
        {
            //hitung varian
            varians = varians + (bil[kolom] - rerata) * (bil[kolom] - rerata);
        }
        
        varians = varians / (jumlahBil - 1); // hitung varian
        stdev = Math.sqrt(varians);          // hitung stdev
        maksimal = bil[0];
        minimal = bil[0];
        
        //proses untuk minimal dan maksimal
        for (kolom = 1; kolom < jumlahBil; kolom++) 
        {
            if(bil[kolom] > maksimal)
            {
                maksimal = bil[kolom];
            }
            else if (bil[kolom] < minimal)
            {
                minimal = bil[kolom];
            }
        }
        
        System.out.printf("Sigma Data     = %7.2f \n", sigma);
        System.out.printf("Rerata         = %7.2f \n", rerata);
        System.out.printf("Varians        = %7.2f \n", varians);
        System.out.printf("Standart Dev   = %7.2f \n", stdev);
        System.out.printf("Nilai Maksimum = %7.2f \n", maksimal);
        System.out.printf("Nilai Minimum  = %7.2f \n", minimal);
        
        System.out.println("");
        System.out.println("");
        System.out.println("+--------------------------------------+");
        System.out.println("|         2020 (Java)         |");
        System.out.println("+--------------------------------------+");
        System.out.println("");
        
    }
    
}
