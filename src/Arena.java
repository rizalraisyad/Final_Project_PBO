import java.util.ArrayList;
import java.util.Scanner;

public class Arena {
    private Player player1;
    private Player player2;
    private ArrayList<Petak> arrPetak = new ArrayList<>();

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
        int turn=0;
        System.out.println(player1.nama+"       "+player1.uang);
        System.out.println(player2.nama+"       "+player2.uang);
        loadPetak();
        //turn inisiasi
        Player playerTurn = player1;
        Player playerWait = player2;
        boolean isSelesai = false;

        do{

            System.out.println("\nGiliran : "+playerTurn.nama);
            System.out.println("Uang Player "+playerTurn.uang);
            System.out.println("Posisi awal : "+playerTurn.posisi);
            Scanner sc = new Scanner(System.in);
            System.out.println("MENU PILIHAN ");
            System.out.println("1. Untuk Lempar Dadu");
            System.out.println("2. Untuk Lihat Asset");
            int input = sc.nextInt();
            if(input == 1){
                playerTurn.Jalan();
                System.out.println("Posisi Akhir : "+playerTurn.posisi);

                System.out.println("Sekarang Anda Berada di : "+playerTurn.posisi);


                for (Petak search : arrPetak){
                    if(search.noPetak == playerTurn.posisi){
                        System.out.println("Sekarang Anda Berada di : "+search.namaPetak);
                        System.out.println("Deskripsi : "+search.deskripsi);
                        if(search.isTerjual == false && search.jualBeli == 1 && playerTurn.uang>= search.hargaTanah){
                            System.out.println("Harga Tanah/Perusahaan : "+search.hargaTanah);
                            System.out.println("Menu Pilihan");
                            System.out.println("1.Beli Tanah/Perusahaan");
                            System.out.println("2.Tidak Beli");
                            Scanner scan = new Scanner(System.in);
                            System.out.println("Masukkan angka 1 untuk kocok dadu : ");
                            int pilmenu = scan.nextInt();
                            if(pilmenu == 1){
                                Asset kartu = new Asset(String.valueOf(search.noPetak),search.namaPetak,search.deskripsi,String.valueOf(search.hargaHipotik));
                                playerTurn.uang = playerTurn.uang - search.hargaTanah;
                                playerTurn.tambahAsset(kartu);
                            }else {
                                break;
                            }
                        }
                    }

                }
            }else if(input ==2 ){
                playerTurn.lihatBarang();
            }else{
                System.out.println("Retry");
            }
            if(playerTurn.posisi/40>0){
                playerTurn.uang = playerTurn.uang +50000;
            }
            playerTurn.posisi=playerTurn.posisi%40;
            Player temp = playerTurn;
            playerTurn = playerWait;
            playerWait = temp;
        }while (!isSelesai);
    }



    // deklarasi kelas
    public static void main(String[] args){
        Arena oArena = new Arena(); // Buat objek arenanya

        // Bikin Objek petak-petak
        Kota KotaAmbon = new Kota(1,"Kota Ambon","Komplek_A",6000,200,1000,3000,9000,16000,25000,3000);
        oArena.arrPetak.add(KotaAmbon);
        Kota KotaBalikpapan = new Kota(3,"Kota Balikpapan","Komplek_A",6000,400,2000,6000,18000,32000,55000,3000);
        oArena.arrPetak.add(KotaBalikpapan);
        Kota KotaBandaAceh = new Kota(6,"Kota BandaAceh","Komplek_B",10000,800,4000,10000,30000,45000,55000,6000);
        oArena.arrPetak.add(KotaBandaAceh);
        Kota KotaBandung = new Kota(8,"Kota Bandung","Komplek_B",10000,600,3000,9000,27000,40000,55000,5000);
        oArena.arrPetak.add(KotaBandung);
        Kota KotaBanjarmasin = new Kota(9,"Kota Banjarmasin","Komplek_B",10000,600,3000,9000,27000,40000,55000,5000);
        oArena.arrPetak.add(KotaBanjarmasin);
        Kota KotaBengkulu = new Kota(11,"Kota Bengkulu","Komplek_C",14000,1200,6000,8000,50000,70000,90000,8000);
        oArena.arrPetak.add(KotaBengkulu);
        Kota KotaDenpasar = new Kota(13,"Kota Denpasar","Komplek_C",14000,1000,5000,15000,45000,62500,75000,7000);
        oArena.arrPetak.add(KotaDenpasar);
        Kota KotaJakarta = new Kota(14,"Kota Jakarta","Komplek_C",16000,1000,5000,15000,45000,62500,75000,7000);
        oArena.arrPetak.add(KotaJakarta);
        Kota KotaKendari = new Kota(16,"Kota Kendari","Komplek_D",18000,1400,7000,20000,55000,75000,95000,9000);
        oArena.arrPetak.add(KotaKendari);
        Kota KotaKupang = new Kota(18,"Kota Kupang","Komplek_D",18000,1600,8000,22000,60000,80000,100000,9000);
        oArena.arrPetak.add(KotaKupang);
        Kota KotaMagelang = new Kota(19,"Kota Magelang","Komplek_D",20000,1400,7000,20000,55000,75000,95000,9000);
        oArena.arrPetak.add(KotaMagelang);
        Kota KotaMakassar = new Kota(21,"Kota Makassar","Komplek_E",22000,1800,9000,25000,70000,87500,105000,11000);
        oArena.arrPetak.add(KotaMakassar);
        Kota KotaManado = new Kota(23,"Kota Manado","Komplek_E",22000,2000,10000,30000,75000,92500,110000,12000);
        oArena.arrPetak.add(KotaManado);
        Kota KotaPontianak = new Kota(24,"Kota Pontianak","Komplek_E",24000,1800,9000,25000,70000,87500,105000,11000);
        oArena.arrPetak.add(KotaPontianak);
        Kota KotaPurwokerto = new Kota(26,"Kota Purwokerto","Komplek_F",26000,2400,14000,36000,85000,102500,120000,14000);
        oArena.arrPetak.add(KotaPurwokerto);
        Kota KotaSerang = new Kota(27,"Kota Serang","Komplek_F",26000,2200,11000,33000,80000,97500,115000,13000);
        oArena.arrPetak.add(KotaSerang);
        Kota KotaSorong = new Kota(29,"Kota Sorong","Komplek_F",28000,2200,11000,33000,80000,97500,115000,13000);
        oArena.arrPetak.add(KotaSorong);
        Kota KotaTegal = new Kota(31,"Kota Tegal","Komplek_G",30000,2600,13000,39000,90000,110000,127500,15000);
        oArena.arrPetak.add(KotaTegal);
        Kota KotaTernate = new Kota(32,"Kota Ternate","Komplek_G",30000,2800,15000,45000,100000,120000,140000,16000);
        oArena.arrPetak.add(KotaTernate);
        Kota KotaYogyakarta = new Kota(34,"Kota Yogyakarta","Komplek_G",32000,2600,13000,39000,90000,110000,127500,15000);
        oArena.arrPetak.add(KotaYogyakarta);
        Kota KotaCimahi = new Kota(37,"Kota Cimahi","Komplek_H",35000,3500,17500,50000,110000,130000,150000,17500);
        oArena.arrPetak.add(KotaCimahi);
        Kota KotaPalembang = new Kota(39,"Kota Palembang","Komplek_H",40000,5000,20000,60000,140000,170000,200000,20000);
        oArena.arrPetak.add(KotaPalembang);
        Stasiun StasiunBandung = new Stasiun(5,"Stasiun Bandung","Stasiun",20000);
        oArena.arrPetak.add(StasiunBandung);
        Stasiun StasiunCimahi = new Stasiun(15,"Stasiun Cimahi","Stasiun",20000);
        oArena.arrPetak.add(StasiunCimahi);
        Stasiun StasiunBalapan = new Stasiun(25,"Stasiun Balapan","Stasiun",20000);
        oArena.arrPetak.add(StasiunBalapan);
        Stasiun StasiunYogyakarta = new Stasiun(35,"Stasiun Yogyakarta","Stasiun",20000);
        oArena.arrPetak.add(StasiunYogyakarta);
        Perusahaan PerusahaanListrik = new Perusahaan(12,"Perusahaan Listrik","Perusahaan",15000);
        oArena.arrPetak.add(PerusahaanListrik);
        Perusahaan PerusahaanAir = new Perusahaan(28,"Perusahaan Air","Perusahaan",15000);
        oArena.arrPetak.add(PerusahaanAir);
        DanaUmum Danaumum1 = new DanaUmum(2,"Dana Umum ke-1","Danaumum");
        oArena.arrPetak.add(Danaumum1);
        DanaUmum Danaumum2 = new DanaUmum(17,"Dana Umum ke-2","Danaumum");
        oArena.arrPetak.add(Danaumum2);
        DanaUmum Danaumum3 = new DanaUmum(33,"Dana Umum ke-3","Danaumum");
        oArena.arrPetak.add(Danaumum3);
        Kesempatan Kesempatan1 = new Kesempatan(7,"Kesempatan ke-1","Kesempatan");
        oArena.arrPetak.add(Kesempatan1);
        Kesempatan Kesempatan2 = new Kesempatan(22,"Kesempatan ke-2","Kesempatan");
        oArena.arrPetak.add(Kesempatan2);
        Kesempatan Kesempatan3 = new Kesempatan(36,"Kesempatan ke-3","Kesempatan");
        oArena.arrPetak.add(Kesempatan3);
        PajakJalan PajakJalan = new PajakJalan(4,"Pajak Jalan","Pajak_Jalan");
        oArena.arrPetak.add(PajakJalan);
        PajakIstimewa PajakIs = new PajakIstimewa(38,"Pajak Istimewa","PajakIs");
        oArena.arrPetak.add(PajakIs);
        Penjara MasukPenjara = new Penjara(30,"Masuk Penjara ","Masuk_Penjara");
        oArena.arrPetak.add(MasukPenjara);
        Penjara Penjara = new Penjara(10,"Penjara Hanya Lewat dan Hanya untuk yang keluar penjara","Penjara");
        oArena.arrPetak.add(Penjara);
        Start Start = new Start(0,"Start/Awal","Start");
        oArena.arrPetak.add(Start);
        BebasParkir BebasParkir = new BebasParkir(20,"Parkir Bebas","PB");
        oArena.arrPetak.add(Start);
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
