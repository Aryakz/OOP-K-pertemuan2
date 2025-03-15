package oop.pertemuan2;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Nyoman Arya Wiyaksana
 * Tgl 15 Maret 2025
 */
public class OOPPertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        nama = "Arya";
        String nim;
        nim = "2301010062";
        double ipk;
        ipk = 4;
        
        BufferedReader dtain = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Input Nama : ");
        try{
            nama=dtain.readLine();
        }catch(IOException e){
            System.out.print("Error Pembacaan Data");
        }
        System.out.print("Input NIM : ");
        try{
            nim=dtain.readLine();
        }catch(IOException e){
            System.out.print("Error Pembacaan Data");
        }
      
        
        System.out.printf("Nama saya %s dengan NIM %s dengan IPK %.2f",nama,nim,ipk);
    }
    
}
