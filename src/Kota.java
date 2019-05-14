public class Kota extends PetakPijakDibeli{
    double hargaRumah;
    double hargaHotel;
    boolean isAdaRumah;
    int jumlahrumah;
    int jumlahkomplek;
    double hargaSewa1Rumah;
    double hargaSewa2Rumah;
    double hargaSewa3Rumah;
    double hargaSewa4Rumah;
    double hargaSewaHotel;
    public Kota(int no,String namaPetak,String deksripsi,double hargaTanah,double hargaSewaTanah,double hargaSewa1Rumah,double hargaSewa2Rumah,double hargaSewa3Rumah,double hargaSewa4Rumah,double hargaSewaHotel,double hargaHipotik){
        this.noPetak = no;
        this.namaPetak = namaPetak;
        this.deskripsi = deksripsi;
        this.hargaTanah = hargaTanah;
        this.hargaHotel = 15000;
        this.hargaRumah = 4000;
        this.jumlahrumah = 0;
        this.jumlahkomplek = 0;
        this.hargaSewaTanah = hargaSewaTanah;
        this.hargaSewa1Rumah = hargaSewa1Rumah;
        this.hargaSewa2Rumah = hargaSewa2Rumah;
        this.hargaSewa3Rumah = hargaSewa3Rumah;
        this.hargaSewa4Rumah = hargaSewa4Rumah;
        this.hargaSewaHotel = hargaSewaHotel;
        this.hargaHipotik = hargaHipotik;
        this.isTerjual = false;
        this.isAdaRumah = false;
    }
    
    public void bangunRumah(){

    }
    public void bangunHotel(){

    }
}
