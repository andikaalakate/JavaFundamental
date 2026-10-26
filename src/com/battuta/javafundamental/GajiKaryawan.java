package com.battuta.javafundamental;

/**
 *
 * @author kurokidaizaya
 * Nama     : Andika Pratama
 * NIM      : 110225013
 * Prodi    : Sistem Informasi
 * Semester : 3
 * Kelas    : Pagi
 * Matkul   : Pemrograman Berbasis Objek (PBO)
 */

public class GajiKaryawan {
    public static void main(String[] args) {
        double gajiPokok = 4500000.0;
        double persenTunjangan = 0.15;
        double persenPajak = 0.05;

        double nominalTunjangan = gajiPokok * persenTunjangan;
        double gajiKotor = gajiPokok + nominalTunjangan;
        double nominalPajak = gajiKotor * persenPajak;
        double gajiBersih = gajiKotor - nominalPajak;

        int gajiDiterimaInt = (int) gajiBersih;
        double selisihDesimal = gajiBersih - gajiDiterimaInt;

        System.out.println("=== Perhitungan Gaji Karyawan ===");
        System.out.println("Gaji Pokok          : Rp " + gajiPokok);
        System.out.println("Persen Tunjangan    : " + (persenTunjangan * 100) + "%");
        System.out.println("Nominal Tunjangan   : Rp " + nominalTunjangan);
        System.out.println("Gaji Kotor          : Rp " + gajiKotor);
        System.out.println("Persen Pajak        : " + (persenPajak * 100) + "%");
        System.out.println("Nominal Pajak       : Rp " + nominalPajak);
        System.out.println("Gaji Bersih         : Rp " + gajiBersih);
        System.out.println("Gaji Diterima (int) : Rp " + gajiDiterimaInt);
        System.out.println("Selisih Desimal     : Rp " + selisihDesimal);
    }
}