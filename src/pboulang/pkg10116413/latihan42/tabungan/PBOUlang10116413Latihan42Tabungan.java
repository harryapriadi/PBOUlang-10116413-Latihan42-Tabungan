/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10116413.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA         : HARRY APRIADI
 * KELAS        : PBOULANG
 * NIM          : 10116413
 * DESKRIPSI    : 
 */
public class PBOUlang10116413Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn1 = new Scanner(System.in);
        Tabungan tab = new Tabungan();

        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : ");
        int x = tab.tabungan(scn1.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        int y = tab.ambilUang(scn1.nextInt());
        System.out.println("Saldo Anda Sekarang : " + (tab.tabungan(x) - tab.ambilUang(y)));

    }

}
