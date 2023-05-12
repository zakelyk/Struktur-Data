import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        DataPraktikan data = new DataPraktikan();

        for(;;){
            if(data.login()){
                boolean log = true;
                do{
                    switch (menu()){
                        case 1:
                            data.tambahData();
                            break;
                        case 2:
                            data.tampil();
                            break;
                        case 3:
                            data.listNimPraktikan();
                            break;
                        case 4:
                            data.listNamaAsisten();
                            break;
                        case 5:
                            System.out.println(data.totalEmail());
                            break;
                        case 6:
                            data.editData();
                            break;
                        case 7:
                            data.hapusData();
                            break;
                        case 8:
                            log=data.logOut();
                    }
                } while(log);
            }
        }
    }

    static int menu()throws InputMismatchException {
        int pilih;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Tambah Data\n" +
                "2. Tampilkan Data\n" +
                "3. Tampilkan List NIM\n" +
                "4. tampilkan list Asisten\n" +
                "5. Total data\n" +
                "6. Edit Data\n" +
                "7. Hapus Data\n" +
                "8. Logout");
        System.out.print("Pilih Fitur : ");
        try {
            pilih = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Masukan Input berupa angka(1~8)");
            pilih=menu();
        }
        return pilih;
    }
}
