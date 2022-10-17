/**
 * Tugas Sesi 4_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

public class Album {
   
    public static void main(String[] args) {
        Lagu LaguSaya = null;
        
        NamaLagu Namalagu = new NamaLagu ("Love Yourself Answer", "jamais vu");
        NamaProduser nama_prod = new NamaProduser("Matthew Tishler", "jamais vu");
        LaguSaya = Namalagu;
        LaguSaya.infoLagu();
        
        LaguSaya = nama_prod;
        LaguSaya.infoLagu();
    }
}