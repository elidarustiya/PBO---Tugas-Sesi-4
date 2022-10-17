/**
 * Tugas Sesi 4_Pemprograman Berorientasi Objek
 * @author ACER_ELI DARUSTIYA_20210040068_TI21A
 */

public class NamaProduser extends Lagu {
    protected String nama_prod;
    
    public NamaProduser(String nama_prod, String nama_album)  {
        super(nama_album);
        this.nama_prod = nama_prod;
    }
    
public void infoLagu (){
    System.out.println("Nama album: " + super.nama_album);
    System.out.println("Nama Produser : " + this.nama_prod );
}
}
    