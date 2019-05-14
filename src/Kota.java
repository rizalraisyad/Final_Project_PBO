public class Kota extends Petak{
//    double hargaRumah;
//    double hargaHotel;
//    boolean isAdaRumah;
//    int jumlahrumah;
//    int jumlahkomplek;
//    double hargaSewa1Rumah;
//    double hargaSewa2Rumah;
//    double hargaSewa3Rumah;
//    double hargaSewa4Rumah;
//    double hargaSewaHotel;
//    double hargaTanah ;
//    double hargaSewaTanah ;
//    double hargaHipotik;
//    boolean isTerjual;
    public Kota(int no,String namaPetak,String deksripsi,double hargaTanah,double hargaSewaTanah,double hargaSewa1Rumah,double hargaSewa2Rumah,double hargaSewa3Rumah,double hargaSewa4Rumah,double hargaSewaHotel,double hargaHipotik,String keterangan){
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
        this.jualBeli = 1;
        this.keterangan = keterangan;
        this.namaPemilik="none";
    }



    @Override
    public int cekstatuspemilik(){
        super.cekstatuspemilik();
        int status = 0; // untuk belum terjual
        if(isTerjual == false){
            status =0;
        }else {
            status =1;
        }
        return status;
    }
    public void printNamadanDeskripsi(){
        super.printNamadanDeskripsi();
        System.out.println("Nama Petak : "+namaPetak);
        System.out.println("Deskripsi : "+deskripsi);
    }
    public void printhitungHargaSewak(){
        super.printhitungHargaSewak();
    }

    public void printhitungHargaJual(){
        super.printhitungHargaJual();
    }

    public void printcekStatusKepemilikan(){
        super.printcekStatusKepemilikan();
        if(isTerjual == false){
            System.out.println("Belum Terjual");
        }else {
            System.out.println("Terjual");
        }
    }
    public void beliKota_Perusahaan(String nama){
    super.beliKota_Perusahaan(nama);
    this.isTerjual = true;
    this.namaPemilik = nama;
    }

}
