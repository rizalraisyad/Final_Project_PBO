import java.util.Scanner;

public class Arena {
    private Player player1;
    private Player player2;

    public void tambahPlayer(Player r1, Player r2){
        player1 = r1;
        player2 = r2;
    }
    public void tampilanPetak(){
        int i=0;
        int j=0;
        for(i=0;i<=10;i++){
            System.out.print("|");
            System.out.println("|");
        }
    }

    public void loadPetak(){
        for(int i =0 ; i<11;i++){
            System.out.print("|");
            System.out.print("_|");
            if(i==0 || i == 10) {
                for (int j = 0; j < 11; j++) {
                    System.out.print("_|");
                }

                System.out.print("|");
                System.out.println();
            }else{
                for (int j = 0; j < 11; j++) {
                    if(j==10){
                        System.out.print("|_|");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }



    public void bermain(){
        System.out.println(player1.nama+"       "+player1.uang);
        System.out.println(player2.nama+"       "+player2.uang);
        loadPetak();
        //turn inisiasi
        Player playerTurn = player1;
        Player playerWait = player2;
        boolean isSelesai = false;
        do{

            System.out.println("\nNama Player "+playerTurn.nama);
            System.out.println("Uang Player "+playerTurn.uang);
            System.out.println("Posisi awal : "+playerTurn.posisi);
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukkan angka 1 untuk kocok dadu : ");
            int input = sc.nextInt();
            if(input == 1){
                playerTurn.Jalan();
                System.out.println("Posisi Akhir : "+playerTurn.posisi);
                if(playerTurn.posisi/40>0){
                    playerTurn.uang = playerTurn.uang +50000;
                }
                playerTurn.posisi=playerTurn.posisi%40;
                Player temp = playerTurn;
                playerTurn = playerWait;
                playerWait = temp;
            }else {
                System.out.println("Retry");
            }
        }while (!isSelesai);
    }



    // deklarasi kelas
    public static void main(String[] args){
        Arena oArena = new Arena(); // Buat objek arenanya
        // Bikin petak-petak
        Kota KotaAmbon = new Kota(1,"Kota Ambon","Komplek A",6000,200,1000,3000,9000,16000,25000,3000);
        Kota KotaBalikpapan = new Kota(3,"Kota Balikpapan","Komplek A",6000,400,2000,6000,18000,32000,55000,3000);
        Kota KotaBandaAceh = new Kota(6,"Kota BandaAceh","Komplek B",10000,800,4000,10000,30000,45000,55000,6000);
        Kota KotaBandung = new Kota(8,"Kota Bandung","Komplek B",10000,600,3000,9000,27000,40000,55000,5000);
        Kota KotaBanjarmasin = new Kota(9,"Kota Banjarmasin","Komplek B",10000,600,3000,9000,27000,40000,55000,5000);
        Kota KotaBengkulu = new Kota(11,"Kota Bengkulu","Komplek C",14000,1200,6000,8000,50000,70000,90000,8000);
        Kota KotaDenpasar = new Kota(13,"Kota Denpasar","Komplek C",14000,1000,5000,15000,45000,62500,75000,7000);
        Kota KotaJakarta = new Kota(14,"Kota Jakarta","Komplek C",16000,1000,5000,15000,45000,62500,75000,7000);
        Kota KotaKendari = new Kota(16,"Kota Kendari","Komplek D",18000,1400,7000,20000,55000,75000,95000,9000);
        Kota KotaKupang = new Kota(18,"Kota Kupang","Komplek D",18000,1600,8000,22000,60000,80000,100000,9000);
        Kota KotaMagelang = new Kota(19,"Kota Magelang","Komplek D",20000,1400,7000,20000,55000,75000,95000,9000);
        Kota KotaMakassar = new Kota(21,"Kota Makassar","Komplek E",22000,1800,9000,25000,70000,87500,105000,11000);
        Kota KotaManado = new Kota(23,"Kota Manado","Komplek E",22000,2000,10000,30000,75000,92500,110000,12000);
        Kota KotaPontianak = new Kota(24,"Kota Pontianak","Komplek E",24000,1800,9000,25000,70000,87500,105000,11000);
        Kota KotaPurwokerto = new Kota(26,"Kota Purwokerto","Komplek F",26000,2400,14000,36000,85000,102500,120000,14000);
        Kota KotaSerang = new Kota(27,"Kota Serang","Komplek F",26000,2200,11000,33000,80000,97500,115000,13000);
        Kota KotaSorong = new Kota(29,"Kota Sorong","Komplek F",28000,2200,11000,33000,80000,97500,115000,13000);
        Kota KotaTegal = new Kota(31,"Kota Tegal","Komplek G",30000,2600,13000,39000,90000,110000,127500,15000);
        Kota KotaTernate = new Kota(32,"Kota Ternate","Komplek G",30000,2800,15000,45000,100000,120000,140000,16000);
        Kota KotaYogyakarta = new Kota(34,"Kota Yogyakarta","Komplek G",32000,2600,13000,39000,90000,110000,127500,15000);
        Kota KotaCimahi = new Kota(37,"Kota Cimahi","Komplek H",35000,3500,17500,50000,110000,130000,150000,17500);
        Kota KotaPalembang = new Kota(39,"Kota Palembang","Komplek H",40000,5000,20000,60000,140000,170000,200000,20000);
        Stasiun StasiunBandung = new Stasiun(4,"Stasiun Bandung","Stasiun");
        Stasiun StasiunCimahi = new Stasiun(15,"Stasiun Cimahi","Stasiun");
        Stasiun StasiunBalapan = new Stasiun(25,"Stasiun Balapan","Stasiun");
        Stasiun StasiunYogyakarta = new Stasiun(35,"Stasiun Yogyakarta","Stasiun");

        Player player1 = new Player("Rizal M"); // siapkan player1
        Player player2 = new Player("Tia H"); // siapkan player2

        //Siapkan asset awal (Uang)
        player1.uang = 250000;
        player1.posisi = 0;
        player2.uang = 250000;
        player2.posisi = 0;

        //tambahkan player ke arena
        oArena.tambahPlayer(player1,player2);
        oArena.bermain();
    }


}
