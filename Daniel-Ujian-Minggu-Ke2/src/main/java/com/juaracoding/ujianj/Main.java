package com.juaracoding.ujianj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); // penggunaan scanner untuk memudahkan penginputan user, dan Meminta pengguna untuk memasukkan saldo awal
            System.out.print("Masukkan saldo awal: ");
            double saldoAwal = sc.nextDouble();

            // Membuat objek ATM dengan saldo awal yang dimasukkan pengguna
            ATM atm = new ATM(saldoAwal);

            while (true) { // Loop utama program
                // Menampilkan menu
                System.out.println("=====================================");
                System.out.println("|           SELAMAT DATANG          |");
                System.out.println("|         BANK - JUARACODING        |");
                System.out.println("-------------------------------------");
                System.out.println("1. INFO SALDO");
                System.out.println("2. SETOR DANA");
                System.out.println("3. PENARIKAN TUNAI");
                System.out.println("4. Keluar");
                System.out.print("PILIH MENU: ");
                int pilihan = sc.nextInt();

                // Fungsi Switch case untuk memproses pilihan pengguna
                switch (pilihan) {
                    case 1:
                        System.out.println("Saldo Anda saat ini: " + atm.lihatSaldo()); // Memanggil method cekSaldo dari objek ATM
                        break;
                    case 2:
                        System.out.print("Masukkan jumlah yang akan disetor: ");
                        double setorUang = sc.nextDouble();
                        atm.setorUang(setorUang); // Memanggil method setor dari objek ATM
                        break;
                    case 3:
                        System.out.print("Masukkan jumlah yang akan ditarik: ");
                        double tarikUang = sc.nextDouble();
                        atm.tarikUang(tarikUang); // Memanggil method tarik dari objek ATM
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan layanan kami.");
                        System.exit(0); // Keluar dari program
                    default:
                        System.out.println("Pilihan tidak valid."); // Pesan jika pilihan tidak valid
            }
       }
    }
}