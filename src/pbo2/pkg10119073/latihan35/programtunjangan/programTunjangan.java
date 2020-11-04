package pbo2.pkg10119073.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung tunjangan
 * dengan object oriented
 *
 */

public class programTunjangan {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        Scanner scanner = new Scanner (System.in);
        karyawan.gajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum) : ");
        karyawan.status = scanner.next();
        
        karyawan.hasilHitung(karyawan.status, karyawan.gajiPokok);
        System.out.println("(Developed by : Aghnia Dewi Mahiranie)");
    }
    
}
