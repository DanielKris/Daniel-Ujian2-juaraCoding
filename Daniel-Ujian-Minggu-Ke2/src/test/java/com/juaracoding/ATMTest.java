package com.juaracoding;

import com.juaracoding.ujianj.ATM;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ATMTest {
        private ATM atm;

        @BeforeMethod
        public void setUp() {
            // Inisialisasi objek ATM dengan saldo awal 1000
            atm = new ATM(1000);
        }
        @Test
        // Menampilkan saldo awal sebesar 1000 rupiah
        public void testLihatSaldo() {
            double saldo = atm.lihatSaldo();
            Assert.assertEquals(saldo, 1000.0);
        }
        @Test
        // Apabila saldo 1000 di setorkan 500, maka saldo bertambah menjadi
        public void testSetorUang() {
            atm.setorUang(500);
            Assert.assertEquals(atm.lihatSaldo(), 1500.0);
        }
        // Mencoba menyetor jumlah negatif
        @Test(expectedExceptions = IllegalArgumentException.class)
        public void testSetorUangNegativeAmount() {
            atm.setorUang(-500); //
    }
        @Test
        // apabila saldo di tarik 500, maka saldo akhir seharusnya 500
        public void testTarikUangSufficientFunds() {
            atm.tarikUang(500);
            Assert.assertEquals(atm.lihatSaldo(), 500.0);
        }
        // Mencoba menarik lebih dari saldo yang tersedia
        @Test(expectedExceptions = IllegalArgumentException.class)
            public void testTarikUangInsufficientFunds() {
            atm.tarikUang(1500);
    }
}
