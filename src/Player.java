public class Player {
    int uang;
    String nama="";
    int posisi;

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

}
