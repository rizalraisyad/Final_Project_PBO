public class Stasiun extends Petak {
//    double sewa1Stasiun;
//    double sewa2Stasiun;
//    double sewa3Stasiun;
//    double sewa4Stasiun;
//    double hargaTanah ;
//    double hargaSewaTanah ;
//    double hargaHipotik;
//    boolean isTerjual;
    public Stasiun(int no, String nama,String deskripsi,int harga,String keterangan){
        this.isTerjual = false;
        this.noPetak = no;
        this.namaPetak = nama;
        this.deskripsi = deskripsi;
        this.sewa1Stasiun = 2500;
        this.sewa2Stasiun = 5000;
        this.sewa3Stasiun = 10000;
        this.sewa4Stasiun = 20000;
        this.hargaHipotik = 10000;
        this.jualBeli = 1;
        this.hargaTanah = harga;
        this.keterangan = keterangan;
    }
}
