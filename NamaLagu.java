/**
 * Tugas Sesi 4_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

public class NamaLagu extends Lagu {
    protected String Judul_Lagu;
    private java.lang.String Nama_Lagu;
    
    public NamaLagu(String Nama_Lagu, String nama_album) {
        super(nama_album);
        this.Nama_Lagu = Nama_Lagu;
    }

    
    public void infoLagu(){
        System.out.println("Nama album : " + super.nama_album);
        System.out.println("Adalah judul album : " +this.Nama_Lagu);
    }
    
}
