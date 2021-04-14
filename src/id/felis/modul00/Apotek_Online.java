package id.felis.modul00;
import java.util.Scanner;

public class Apotek_Online {
    /*
        PROGRAM PEMBELIAN OBAT
        APOTEK ONLINE
        IKUTI LANGKAH NYA DENGAN BAIK
         */
    static Scanner sNumber = new Scanner(System.in);
    static Scanner sString = new Scanner(System.in);

    //METHOD UNTUK PEMBELIAN OBAT
    public static void buy(){
        System.out.println("\n\tPEMBELIAN OBAT");
        System.out.println("ID Produk       Nama Obat       Fungsi Obat             Harga");
        System.out.println("    1           Panadol         Pereda Sakit Kepala     Rp  5.000");
        System.out.println("    2           Amlodipin       Obat darah tinggi       Rp 50.000");
        System.out.println("    3           Diapet          Obat diare              Rp  7.000");
        System.out.println("    4           Procold         Obat Flu                Rp  5.000");
        System.out.println("    5           Woods           Obat Batuk              Rp 20.000");
        System.out.println("    6           Combratin       Obat Cacing             Rp 14.000");
        System.out.println("    7           Salonpas Koyo   Pereda Nyeri Otot       Rp  7.000");
        System.out.println("    8           Theragran       Multi Vitamin           Rp 22.000");
    }

    //METHOD FUNCTION UNTUK MENAMBAHKAN DATA KE DATABASE
    public static String[][] addInfo(String[][] arryInfo, int pilih, int jumlah){
        //DEKLARASI ARRAY DENGAN VALUE UNTUK BACKUP DATA
        String[][] arryTemp = arryInfo;
        //MENGGANTI ARRAY DENGAN ELEMENT DITAMBAH SATU
        arryInfo = new String[arryTemp.length + 1][5];
        //RESTORE DATA DARI arryTemp KE arryInfo
        for (int i = 0; i < arryTemp.length; i++) {
            arryInfo[i][0] = arryTemp[i][0];
            arryInfo[i][1] = arryTemp[i][1];
            arryInfo[i][2] = arryTemp[i][2];
            arryInfo[i][3] = arryTemp[i][3];
            arryInfo[i][4] = arryTemp[i][4];
        }
        String data = "";
        String dibayar = "";

        //PROSES INPUT DAN MENAMBAH DATA
        System.out.print("\nMasukkan Nama\t\t: ");
        arryInfo[arryTemp.length][0] = sString.nextLine().toUpperCase();
        System.out.print("Masukkan Alamat\t\t: ");
        arryInfo[arryTemp.length][1] = sString.nextLine();
        System.out.print("Masukkan No.Telp\t: ");
        arryInfo[arryTemp.length][2] = sString.nextLine();
        switch (pilih){
            case 1:
                data = "\n\n'Panadol'\nObat sakit kepala\nHarga: Rp 5.000\nJumlah Pembelian : " + jumlah;
                dibayar = "\nTotal Harga\t: Rp " + 5 * jumlah + ".000";
                System.out.println("Nama Obat\t:\n\nPanadol\nObat sakit kepala\nHarga: Rp 5.000");
                System.out.println("Jumlah Pembelian : " + jumlah);
                System.out.println("\nTotal Harga\t: Rp " + 5 * jumlah + ".000");
                break;
            case 2:
                data = "\n\n'Amlodipin'\nObat darah tinggi\nHarga: Rp 50.000\nJumlah Pembelian : "+jumlah;
                dibayar = "\nTotal Harga\t: Rp " + jumlah * 50+".000";
                System.out.println("Nama Obat\t:\n\nAmlodipin\nObat darah tinggi\nHarga: Rp 50.000");
                System.out.println("Jumlah Pembelian : "+jumlah);
                System.out.println("\nTotal Harga\t: Rp " + jumlah * 50+".000");
                break;
            case 3:
                data = "\n\n'Diapet'\nObat diare\nHarga: Rp 7.000\nJumlah Pembelian : "+jumlah;
                dibayar = "\nTotal Harga\t: Rp " + jumlah * 7+".000";
                System.out.println("Nama Obat\t:\n\nDiapet\nObat diare\nHarga: Rp 7.000");
                System.out.println("Jumlah Pembelian : "+jumlah);
                System.out.println("\nTotal Harga\t: Rp " + jumlah * 7+".000");
                break;
            case 4:
                data = "\n\n'Procold'\nObat Flu\nHarga: Rp 5.000\nJumlah Pembelian : "+jumlah;
                dibayar = "\nTotal Harga\t: Rp " + jumlah * 5+".000";
                System.out.println("Nama Obat\t:\n\nProcold\nObat Flu\nHarga: Rp 5.000");
                System.out.println("Jumlah Pembelian :"+jumlah);
                System.out.println("\nTotal Harga\t: Rp " + jumlah * 5+".000");
                break;
            case 5:
                data = "\n\n'Woods'\nObat Batuk\nHarga: Rp 20.000\nJumlah Pembelian : "+jumlah;
                dibayar = "\nTotal Harga\t: Rp " + jumlah * 20+".000";
                System.out.println("Nama Obat\t:\n\nWoods\nObat Batuk\nHarga: Rp 20.000");
                System.out.println("Jumlah Pembelian : "+jumlah);
                System.out.println("\nTotal Harga\t: Rp " + jumlah * 20+".000");
                break;
            case 6:
                data = "\n\n'Combratin'\nObat Cacing\nHarga: Rp 14.000\nJumlah Pembelian : "+jumlah;
                dibayar = "\nTotal Harga\t: Rp " + jumlah * 14+".000";
                System.out.println("Nama Obat\t:\n\nCombratin\nObat Cacing\nHarga: Rp 14.000");
                System.out.println("Jumlah Pembelian : "+jumlah);
                System.out.println("\nTotal Harga\t: Rp " + jumlah * 14+".000");
                break;
            case 7:
                data = "\n\n'Salonpas Koyo'\nPereda Nyeri Otot\nHarga: Rp 7.000\nJumlah Pembelian : "+jumlah;
                dibayar = "\nTotal Harga\t: Rp " + jumlah * 7+".000";
                System.out.println("Nama Obat\t:\n\nSalonpas Koyo\nPereda Nyeri Otot\nHarga: Rp 7.000");
                System.out.println("Jumlah Pembelian : "+jumlah);
                System.out.println("\nTotal Harga\t: Rp " + jumlah * 7+".000");
                break;
            case 8:
                data = "\n\n'Theragran'\nMulti Vitamin\nHarga: Rp 22.000\nJumlah Pembelian : "+jumlah;
                dibayar = "\nTotal Harga\t: Rp " + jumlah * 22+".000";
                System.out.println("Nama Obat\t:\n\nTheragran\nMulti Vitamin\nHarga: Rp 22.000");
                System.out.println("Jumlah Pembelian : "+jumlah);
                System.out.println("\nTotal Harga\t: Rp " + jumlah * 22+".000");
                break;
        }
        arryInfo[arryTemp.length][3] = data;
        arryInfo[arryTemp.length][4] = dibayar;

        return arryInfo;
    }

    //METHOD UNTUK MENCETAK DATA DARI DATABASE
    public static void printInfo(String[][] arryInfo){
        for (int i = 0; i < arryInfo.length; i++) {
            System.out.println("Nama\t\t: " + arryInfo[i][0]);
            System.out.println("Alamat\t\t: " + arryInfo[i][1]);
            System.out.println("No.Telp\t\t: " + arryInfo[i][2]);
            System.out.println("Nama Obat\t: " + arryInfo[i][3]);
            System.out.println(arryInfo[i][4]);
        }
        System.out.println();
    }
    //SELECTIONASC PENYELEKSIAN ELEMEN STRUKTUR DATA
    public static String[][] selectionAsc(String[][] array){
        int flag;
        //BUAT ARRAY TEMP UNTUK MENAMPUNG NILAI
        String[] temp = new String[5];

        for (int i = 0; i < array.length - 1; i++) {
            flag = i;
            //MEMBANDINGKAN DATA DARI YANG KECIL KE BESAR
            for (int j = i; j < array.length; j++) {
                //PERBANDINGAN JIKA STRING
                if (array[j][0].compareTo(array[flag][0]) < 0) flag = j;
            }

            if (flag != i){
                //MEMINDAHKAN ARRAY INDEKS i KE temp
                for (int j = 0; j < temp.length; j++)
                    temp[j] = array[i][j];
                //MEMINDAHKAN ARRAY INDEKS i ke INDEKS flag
                for (int j = 0; j < temp.length; j++)
                    array[i][j] = array[flag][j];
                for (int j = 0; j < temp.length; j++)
                    array[flag][j] = temp[j];
            }
        }
        return array;
    }
    //MEMBERIKAN NILAI PADA SAAT AKHIR
    public static int sequential(String[][] arry, String key){
        for (int i = 0; i < arry.length; i++) {
            if (arry[i][0].equals(key))
                return i;
        }
        return -1;
    }
    //MENCARI SUATU KUMPULAN DATA(SEARCH)
    public static void search(String[][] arry, String key){
        int result = sequential(arry, key);
        if (result == -1){
            System.out.println("Data " + key + " tidak ditemukan");
        }else{
            System.out.println("Data " + key + " ditemukan di indeks ke-" + result);
            System.out.println("Nama\t\t: " + arry[result][0]);
            System.out.println("Alamat\t\t: " + arry[result][1]);
            System.out.println("No.Telp\t\t: " + arry[result][2]);
            System.out.println("Nama Obat\t: " + arry[result][3]);
            System.out.println(arry[result][4]);

        }
    }
    //PEMBAGIAN FUNGSI SUATU PROGRAM
    public static void main(String[] args) {
        String[][] arryInfo = new String[0][5];
        int pilih = 0;

        do {
            System.out.println("\n==============================");
            System.out.println("        APOTIK ONLINE         ");
            System.out.println("==============================");
            System.out.println("\n1. Pembelian Obat");
            System.out.println();
            System.out.println("2. Pencarian Data Pembeli");
            System.out.println();
            System.out.println("3. Pembayaran");
            System.out.println();
            System.out.print("Masukkan Pilihan: ");
            pilih = sNumber.nextInt();
            switch (pilih){
                case 1:
                    buy();
                    System.out.println("");
                    System.out.print("Masukkan pilihan\t: ");
                    int nomor = sNumber.nextInt();
                    System.out.print("Masukkan Jumlah\t\t: ");
                    int jumlah = sNumber.nextInt();
                    arryInfo = addInfo(arryInfo, nomor, jumlah);
                    break;
                case 2:
                    System.out.println("\n\tPENCARIAN DATA PEMBELI");
                    selectionAsc(arryInfo);
                    for (int i = 0; i < arryInfo.length; i++) {
                        int no = i + 1;
                        System.out.println(no + ". " + arryInfo[i][0]);
                    }
                    System.out.print("\nMasukkan nama yang dicari\t: ");
                    String nama = sString.nextLine().toUpperCase();
                    search(arryInfo, nama);
                    break;
                case 3:
                    System.out.println("\n\tPEMBAYARAN");
                    System.out.println("\nDimohon untuk melaksanakan pembayaran melalui salah satu metode pembayaran ini :" +
                            "\n1. Transfer Bca\t\t(9011092929)" +
                            "\n2. Transfer Mandiri\t(701299211)" +
                            "\n3. Transfer GOPAY\t(08211233412)");
                    System.out.println("Jika sudah melaksanakan pembayaran, mohon dikirim bukti pembayaran ke nomor " +
                            "08211233412");
                    System.out.println("\nTerimakasih Sudah Membeli :)");
                    System.out.println("Semoga lekas sembuh dan sehat selalu.....");
                    System.out.println("============='Apotik Online'=============");

                    break;

            }
        }while(pilih != 3);
    }
}

