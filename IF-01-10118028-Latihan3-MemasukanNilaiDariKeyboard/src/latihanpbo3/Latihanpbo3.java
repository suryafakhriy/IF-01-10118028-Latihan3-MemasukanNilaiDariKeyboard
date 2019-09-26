/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo3;

import java.util.Scanner;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-1 2018
   NIM       : 10118028
   DESKRIPSI : Memasukan nilai dari keyboard
 */
public class Latihanpbo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukan nama anda : ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
        
    }
    
}
