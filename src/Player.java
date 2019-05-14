import java.util.ArrayList;

public class Player {
    double uang;
    String nama="";
    int posisi;
    ArrayList<Asset> arrAsset = new ArrayList<>();
    int jumlahkota;
    int jumlahperusahaan;
    int jumlahstasiun;
    int jumlahkartubebaspenjara;
    public  Player(String vNama){
        nama = vNama;
    }

    public static int randomDadu(){
        int x = (int)(Math.random()*((6-1)+1))+1;
        return x;
    }

    public void Jalan(){
        int hasilDadu=0;
        hasilDadu = hasilDadu + randomDadu();
        hasilDadu = hasilDadu + randomDadu();
        this.posisi = (this.posisi + hasilDadu);
    }
    public void tambahAsset(Asset oAsset){
        arrAsset.add(oAsset);
    }
    public Asset lihatBarang(){
        System.out.println("Asset Anda:");
        for (Asset cari : arrAsset){
            System.out.println("No Petak : "+cari.noPetak);
            System.out.println("Nama  : "+cari.namaPetak);
            System.out.println("Deskripsi  : "+cari.deskripsi);
            System.out.println("Harga Hipotik  : "+cari.hipotik);
        }
        return null;
    }

}
