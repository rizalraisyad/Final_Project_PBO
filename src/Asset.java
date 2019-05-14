public class Asset {
    String id;
    String deskripsi;
    Double jumlahUang = 0.0 ;
    int rumah = 0;
    int hotel= 0 ;
    int passCard = 0;

    public Asset(String id, String deskripsi){
        this.id = id;
        this.deskripsi = deskripsi;
    }
}
