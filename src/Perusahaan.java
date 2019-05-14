public class Perusahaan extends Petak {
    //4 x jumlah angka dadu x satuan uang monopoli terendah Tetapi bila pemain berhenti di salah satu petak perusahaan listrik/ air dan keduanya telah dipunyai oleh salah satu pemain yang lain, maka prosedur membayarnya merupakan 10 x jumlah angka dadu x satuan uang monopoli terendah
    int jumlahPerusahaan;
//    public double hargaTanah ;
//    public double hargaSewaTanah ;
//    public double hargaHipotik;
//    public boolean isTerjual;
    public Perusahaan(int no, String nama, String deskripsi,int harga,String keterangan){
        this.noPetak = no;
        this.namaPetak = nama;
        this.deskripsi = deskripsi;
        this.jualBeli = 1;
        this.hargaTanah = harga;
        this.keterangan = keterangan;
    }

    public void hitungSewa(){

    }

}
