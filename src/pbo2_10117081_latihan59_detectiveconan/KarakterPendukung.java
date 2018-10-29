/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan59_detectiveconan;

/**
 *
 * @author Geo Syah Alkautsar
 */
public class KarakterPendukung extends Tokoh{

    private String relasi;
    
    public KarakterPendukung(String nama, String peran, String relasi) {
        super(nama, peran);
        this.relasi=relasi;
    }

    public String getRelasi() {
        return relasi;
    }
    
    public void tampil(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Relasi dengan Tokoh Utama : "+getRelasi());
        System.out.println("");
    }
    
}
