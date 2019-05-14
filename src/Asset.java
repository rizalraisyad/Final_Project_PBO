import java.util.ArrayList;

public class Asset {
    String  noPetak;
    String namaPetak;
    String deskripsi;
    String hipotik;
    Double jumlahUang = 0.0 ;
    int rumah = 0;
    int hotel= 0 ;
    int passCard = 0;

    public Asset(String id,String namaPetak,String deskripsi,String hipotik){
        this.noPetak = id;
        this.namaPetak = namaPetak;
        this.deskripsi = deskripsi;
        this.hipotik = hipotik;
    }
}
