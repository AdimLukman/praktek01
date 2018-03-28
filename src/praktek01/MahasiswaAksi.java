/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author flea
 */
public class MahasiswaAksi {
    public static void main(String[] args) {
        mahasiswa Harry = new mahasiswa();
        
        Harry.nama="Harry Potter";
        Harry.NPM="16630312";
        Harry.Jurusan="Tehnik Informatika";
        Harry.Matkul="PBO";
        Harry.Kelas="Reguler Malam";
        Harry.IPK=3.5;
        
        Harry.cetakInfo();
        
    }
    
}
