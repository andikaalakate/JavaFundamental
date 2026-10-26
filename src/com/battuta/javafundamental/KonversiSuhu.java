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
public class KonversiSuhu {
    public static void main(String[] args) {
        double suhuCelcius = 37.5;

        final double REAMUR = 4.0 / 5.0;
        final double FAHRENHEIT = 9.0 / 5.0;
        final double TAMBAHAN_KELVIN = 273.15;

        double suhuReamur = REAMUR * suhuCelcius;
        double suhuFahrenheit = (FAHRENHEIT * suhuCelcius) + 32;
        double suhuKelvin = suhuCelcius + TAMBAHAN_KELVIN;

        System.out.println("=== Program Konversi Suhu ===");
        System.out.println("Suhu Celcius   : " + suhuCelcius + " °C");
        System.out.println("Suhu Reamur    : " + suhuReamur + " °Re");
        System.out.println("Suhu Fahrenheit: " + suhuFahrenheit + " °F");
        System.out.println("Suhu Kelvin    : " + suhuKelvin + " K");
    }
}

