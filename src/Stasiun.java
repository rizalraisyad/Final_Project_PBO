public class Stasiun extends PetakPijakDibeli {
    double sewa1Stasiun;
    double sewa2Stasiun;
    double sewa3Stasiun;
    double sewa4Stasiun;
    public Stasiun(int no, String nama,String deskripsi){
        this.noPetak = no;
        this.namaPetak = nama;
        this.deskripsi = deskripsi;
        this.sewa1Stasiun = 2500;
        this.sewa2Stasiun = 5000;
        this.sewa3Stasiun = 10000;
        this.sewa4Stasiun = 20000;
        this.hargaHipotik = 10000;
    }
}
