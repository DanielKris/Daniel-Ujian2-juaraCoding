package com.juaracoding.ujianj;

public class ATM {
    private double saldo; // penggunaan tipe double karna saldo ATM mungkin nilainya lebih dari triliun

    public ATM(double saldoAwal) { // menginisiasi saldo awal
        this.saldo = saldoAwal;
    }

    public double lihatSaldo() { // Mengembalikan saldo saat ini.
        return saldo;
    }

    public void setorUang(double jumlah) { //  Menambah saldo dengan jumlah yang diberikan
        if (saldo >= 0){
            saldo += jumlah; // fungsi Menambahkan jumlah setoran ke saldo
            System.out.println("Setor uang berhasil, saldo anda saat ini : " +saldo);
    }else{
       throw new IllegalArgumentException("Jumlah setoran tidak boleh kurang dari 0");
    }
}

    public void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah; // Mengurangkan jumlah penarikan dari saldo
            System.out.println("Berhasil melakukan penarikan. Saldo Anda sekarang: " + saldo);
        } else {
            throw new IllegalArgumentException("Saldo Anda tidak mencukupi."); // Tampilan apabila saldo atm tidak cukup

        }
    }
}
