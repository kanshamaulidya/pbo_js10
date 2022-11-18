/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author HP
 */
public class Program {
   public static void main(String [] args) {
       Kucing kc = new Kucing();
       Ikan paus = new Ikan();
       Ayam ayam = new Ayam();
       
       Orang ani = new Orang("Ani");
       Orang budi = new Orang("Budi");
       Orang k = new Orang("Kansha");
       
       ani.peliharaanHewan(kc);
       budi.peliharaanHewan(paus);
       k.peliharaanHewan(ayam);
       
       ani.ajakPeliharaanJalanJalan();
       budi.ajakPeliharaanJalanJalan();
       k.ajakPeliharaanJalanJalan();
       
   }
}
