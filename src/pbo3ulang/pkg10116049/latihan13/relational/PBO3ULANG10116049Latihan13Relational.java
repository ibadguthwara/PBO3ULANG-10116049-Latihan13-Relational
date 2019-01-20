/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan13.relational;

/**
 *
 * @author ibadguthwara
 * NAMA 	     : M. Ibad Guthwara
 * KELAS	     : PBO 3 ULANG
 * NIM		     : 10116049
 * DESKRIPSI PROGRAM : Program ini berisi program untuk operator relational
 */
public class PBO3ULANG10116049Latihan13Relational {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bil1 = 10;
        int bil2 = 20;
        
        System.out.println("a == b = " + (bil1 == bil2));  //sama dengan
        System.out.println("a != b = " + (bil1 != bil2));  //tidak sama dengan
        System.out.println("a > b = " + (bil1 > bil2));    //lebih besar
        System.out.println("a < b = " + (bil1 < bil2));    //lebih kecil
        System.out.println("b >= a = " + (bil2 >= bil1));  //lebih besar sama dengan
        System.out.println("b <= a = " + (bil2 <= bil1));  //lebih kecil sama dengan
    }
    
}
