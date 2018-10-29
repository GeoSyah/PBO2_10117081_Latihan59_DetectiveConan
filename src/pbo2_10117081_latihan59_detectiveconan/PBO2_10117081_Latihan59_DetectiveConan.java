/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan59_detectiveconan;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM :10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Memperlihatkan deskripsi karater/tokoh dalam Anime Detective Conan
 */
public class PBO2_10117081_Latihan59_DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KarakterUtama conan = new KarakterUtama("Conan Edogawa", "Detektif",
                "Menyelesaikan Kasus", "Detektif Cilik");
        conan.tampil();
        
        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ahli Karate",
                "Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA");
        ran.tampil();
        
        KarakterUtama kogoro = new KarakterUtama("Kogoro Mouri", "Detektif Swasta",
                "Memecahkan kasus", "Detektif Swasta");
        kogoro.tampil();
        
        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori", "Detektif SMA",
                "Temannya Conan");
        heiji.tampil();
        
        KarakterDetektifCilik ai = new KarakterDetektifCilik("Ai Haibara", "Detektif",
                "Membantu Conan Memecahkan Masalah", "Detektif Cilik");
        ai.tampil();
        
        KarakterDetektifCilik agasha = new KarakterDetektifCilik("Professor Hiroshi Agasha",
                "Professor", "Membuat Peralatan Canggih Untuk Conan", "Detektif Cilik");
        agasha.tampil();
        
    }
    
}
