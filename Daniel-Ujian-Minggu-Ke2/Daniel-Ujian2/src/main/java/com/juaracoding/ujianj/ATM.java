package com.juaracoding.ujianj;

public class ATM {
    private double saldo; // penggunaan tipe double karna saldo ATM mungkin nilainya lebih dari triliun

    public ATM(double saldo) { // menginisiasi saldo awal
        this.saldo = saldo;
    }
    public double lihatSaldo() { // Mengembalikan saldo saat ini.
        return saldo;
    }
    public void setorUang(double jumlah) { //  Menambah saldo dengan jumlah yang diberikan
        try {
            saldo += jumlah; // fungsi Menambahkan jumlah setoran ke saldo
            System.out.println("Setor uang berhasil, saldo anda saat ini : " + saldo);
        } catch (e:IllegalArgumentException)
        System.out.println("Setor uang Tidak berhasil");
    }
    public void tarikUang(double jumlah) {
        try {
            saldo -= jumlah; // Mengurangkan jumlah penarikan dari saldo
            System.out.println("Berhasil melakukan penarikan. Saldo Anda sekarang: " + saldo);
        } catch (e:IllegalArgumentException)
            System.out.println("Saldo Anda tidak mencukupi."); // Tampilan apabila saldo atm tidak cukup
        }
    }
}