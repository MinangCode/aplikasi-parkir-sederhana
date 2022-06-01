import java.util.Scanner;

public class AppParkir {
    public static void main(String []args) {
        int lamaparkir;
        int biayaparkir=0;
        int biayaparkirnext=0;
        String tipe;
        int total;
      
        for (int i = 0; i < 2; i++){
            Scanner Obj=new Scanner(System.in);
            System.out.print("Masukan Plat Nomer: ");
            String plat = Obj.nextLine();
            System.out.println("1. Motor");
            System.out.println("2. Mobil");
			      System.out.println("3. Mini Bus");
			      System.out.println("4. Bis");
			      System.out.println("5. Truck");
            System.out.print("Pilih Jenis kendaraan	: ");
            int jeniskendaraan = Obj.nextInt();
            System.out.print("Jam Masuk	: ");
            int jammasuk = Obj.nextInt();
            System.out.print("Jam Keluar	: ");
            int jamkeluar = Obj.nextInt();
           
            if(jammasuk > jamkeluar){
                jamkeluar = jamkeluar+24;
            }

            System.out.println("Apakah Anda termasuk member ? ");
            System.out.println("1. VIP");
            System.out.println("2. Non VIP");
            System.out.print("Pilih: ");

            int pilih = Obj.nextInt();
            if (pilih==1) {
            System.out.println("Anda adalah member VIP, Parkir menjadi GRATIS");
            }

            else if (pilih == 2) {

            System.out.println("============================================================================");

            System.out.println();
			System.out.println("Terimakasih telah melakukan transaksi dengan rincian sebagai berikut :");
            System.out.println("Plat Nomer	: " +plat);

            
            if(jeniskendaraan == 1){
                tipe ="Motor";
                biayaparkir = 3000;
                biayaparkirnext = 3000;
                System.out.println("Jenis Kendaraan	: "+tipe);
				
            }else if(jeniskendaraan == 2){
                tipe ="Mobil";
                biayaparkir = 5000;
                biayaparkirnext = 5000;
                System.out.println("Jenis Kendaraan	: "+tipe);
				
			      }else if(jeniskendaraan == 3){
                tipe ="mini bus";
                biayaparkir = 8000;
                biayaparkirnext = 8000;
                System.out.println("Jenis Kendaraan	: "+tipe);
				
			      }else if(jeniskendaraan == 4){
                tipe ="Bis";
                biayaparkir = 10000;
                biayaparkirnext = 10000;
                System.out.println("Jenis Kendaraan	: "+tipe);
				
			      }else if(jeniskendaraan == 5){
                tipe ="Truck";
                biayaparkir = 15000;
                biayaparkirnext = 15000;
                System.out.println("Jenis Kendaraan	: "+tipe);
				
            }else{
                System.out.println("Jenis Kendaraan Tidak Terdaftar");
            }

            lamaparkir=jamkeluar - jammasuk;
            System.out.println("Lama Parkir	: "+lamaparkir+" Jam");
            if(lamaparkir == 1){
                total = biayaparkir;
                System.out.println("Total Bayar	: "+total);
				System.out.println("Semoga pelayanan kami memuaskan");
				System.out.println();
            }
            else if(lamaparkir > 1){
                total = biayaparkir+((lamaparkir-1)*biayaparkirnext);
                System.out.println("Total Bayar	: "+total);
				System.out.println("Semoga pelayanan kami memuaskan");
				System.out.println();
            }

        System.out.println("============================================================================");

        }
        }
    }
} 
