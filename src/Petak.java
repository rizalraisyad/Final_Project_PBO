public abstract class Petak {
String namaPetak = "";
String deskripsi = "";
double hargaTanah ;
double hargaSewaTanah ;
double hargaHipotik;
boolean isTerjual;
double hargaRumah;
double hargaHotel;
boolean isAdaRumah;
int jumlahrumah;
int jumlahhotel;
int jumlahkomplek;
double hargaSewa1Rumah;
double hargaSewa2Rumah;
double hargaSewa3Rumah;
double hargaSewa4Rumah;
double hargaSewaHotel;
double sewa1Stasiun;
double sewa2Stasiun;
double sewa3Stasiun;
double sewa4Stasiun;
int noPetak;
int jualBeli;
String namaPemilik;
String keterangan;
public void printNamadanDeskripsi(){
        System.out.println("Nama Petak : "+namaPetak);
        System.out.println("Deskripsi : "+deskripsi);
    }
    public int cekstatuspemilik(){
        int status=0;
    return status;
    }
    public void beliKota_Perusahaan(String nama){
    }
    public void printhitungHargaSewak(){

    }

    public void printhitungHargaJual(){

    }

    public void printcekStatusKepemilikan(){

    }

    public double hitungNilaiSewa(Petak oPetak){
        double sewa=0;
        if(oPetak.isTerjual == true && oPetak.keterangan.equals("KP")){
            if (oPetak.jumlahrumah == 0 && oPetak.jumlahhotel == 0 ){
                sewa = oPetak.hargaTanah;
            }
        }
        return sewa;
    }
}
