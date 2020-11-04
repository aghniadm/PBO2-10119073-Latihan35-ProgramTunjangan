package pbo2.pkg10119073.latihan35.programtunjangan;

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

public class Karyawan {
    public String status;
    public double gajiPokok;
    public double tunjangan;

    public double hitungTunjangan(String parStatus, double parGajiPokok) {
        return tunjangan = (parStatus.equals("Menikah") ? 0.35 * parGajiPokok : 0);
    }

    public double hitungTotalGaji(double parGajiPokok, double parTunjangan) {
        return tunjangan = parGajiPokok + parTunjangan;
    }

    public void hasilHitung(String parStatus, double parGajiPokok) {
        System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok \t: Rp " + gajiPokok);
        System.out.println("Tunjangan \t: Rp " + hitungTunjangan(parStatus, parGajiPokok));
        System.out.println("Total Gaji \t: Rp " + hitungTotalGaji(parGajiPokok, tunjangan));
        
    }
}
