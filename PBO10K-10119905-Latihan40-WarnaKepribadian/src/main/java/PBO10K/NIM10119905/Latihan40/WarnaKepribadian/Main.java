/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan40.WarnaKepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * Nama     : AbrahamRumayara
 * Kelas    : IF10K
 * NIM      : 10119905
 * Deskripsi Program : Program ini digunakan untuk melihat sifat warna
 */
    
public class Main {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Orang o = new Orang();
        Warna w = new Warna();
        
        System.out.println(w.merah + "YUK " + w.hijau + "CEK " + w.kuning + "KEPRIBADIAN " + "\u001b[36m DARI " + w.ungu + "WARNA " + w.biru + "FAVORITMU" + w.normal);
        System.out.println();
        System.out.println("\u001b[41m \u001b[37m" + "         MERAH        " + w.normal);
        System.out.println("\u001b[42m \u001b[37m" + "         HIJAU        " + w.normal);
        System.out.println("\u001b[43m \u001b[37m" + "         KUNING       " + w.normal);
        System.out.println("\u001b[44m \u001b[37m" + "         BIRU         " + w.normal);
        System.out.println("\u001b[45m \u001b[37m" + "         UNGU         " + w.normal);
        System.out.println();
        System.out.println("PILIH WARNA FAVORITMU : ");
        w.namaWarna = input.next();
        w.namaWarna = w.namaWarna.toUpperCase();
        System.out.println("NAMA KAMU : ");
        o.nama = input.next();
        o.nama = o.nama.toUpperCase();
        System.out.println();
        o.nama();
        w.artiWarna();
    }
}
