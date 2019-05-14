public class Penjara extends PetakPijakan {
    boolean isPenjaraPenuh = false;
    public Penjara(int no, String nama, String deskripsi){
        this.isPenjaraPenuh = false;
        this.noPetak = no;
        this.namaPetak = nama;
        this.deskripsi = deskripsi;
        this.jualBeli = 0;
    }
    public void masukPenjara(){
        isPenjaraPenuh = true;
    }
}
