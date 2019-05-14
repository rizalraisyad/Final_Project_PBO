public class Penjara extends Petak {
    boolean isPenjaraPenuh = false;
    public Penjara(int no, String nama, String deskripsi,String keterangan){
        this.isPenjaraPenuh = false;
        this.noPetak = no;
        this.namaPetak = nama;
        this.deskripsi = deskripsi;
        this.jualBeli = 0;
        this.keterangan = keterangan;
    }
    public void masukPenjara(){
        isPenjaraPenuh = true;
    }
}
