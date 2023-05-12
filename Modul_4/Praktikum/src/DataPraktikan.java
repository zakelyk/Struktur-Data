import java.util.HashMap;
import java.util.Scanner;

public class DataPraktikan {
    Scanner input = new Scanner(System.in);
    private HashMap<String, String> tableData;

    //Kegiatan 2---------------------------------------------------------------
    private HashMap<String, String> tabelSesiLogin;
    boolean login(){
        System.out.print("Masukan Email\t\t: ");
        String mail=input.nextLine();
        System.out.print("Masukan Password\t: ");
        String passwd=input.nextLine();
        if(!tabelSesiLogin.containsKey(mail)){
            System.out.println("Email Tak Terdaftar");
            return false;
        } else if(!mail.endsWith("@umm.ac.id")){
            System.out.println("Email bukan dari email UMM(@umm.ac.id)");
            return false;
        } else if(!tabelSesiLogin.get(mail).contains(passwd)){
            System.out.println("Password Salah");
            return false;
        } else {
            return true;
        }
    }
    boolean logOut(){
        return false;
    }
    //Kegiatan 2---------------------------------------------------------------

    public DataPraktikan(){
        tableData = new HashMap<>();
        tableData.put("IF202110370311278", "Syahrul Pangestu");
        tableData.put("IF202110370311277", "Riyan Firjatul");
        tableData.put("IF202110370311279", "Nur Evina");

        //Kegiatan 2
        tabelSesiLogin = new HashMap<>();
        tabelSesiLogin.put("syahrul@umm.ac.id", "Passwd123");
        tabelSesiLogin.put("Riyan@umm.ac.id", "Passwd123");
        tabelSesiLogin.put("evina@umm.ac.id", "Passwd123");
        //Kegiatan 2
    }

    boolean tambahData(){
        System.out.print("---Tambah Data Baru---\n" +
                "Masukan Nim\t : ");
        String nimPraktikan=input.nextLine();
        if(!nimPraktikan.startsWith("IF")){
            System.out.println("Awalan Nim haruslah \"IF\"");
            return false;
        } else if(tableData.containsKey(nimPraktikan)){
            System.out.println("Nim Praktikan Sudah ada");
            return false;
        } else {
            System.out.print("Masukan namaAsisten\t : ");
            String namaAsisten=input.nextLine();
            tableData.put(nimPraktikan, namaAsisten);
            return true;
        }
    }

    void tampil(){
        tableData.forEach((nim, assisten) -> System.out.println("Nim : "+nim+"\t Nama Assisten : "+assisten));
    }

    void listNimPraktikan(){
        for(String nim : tableData.keySet()){
            System.out.println(nim);
        }
    }

    void listNamaAsisten() {
        for (String asisten : tableData.values())
            System.out.println(asisten);
    }

    int totalEmail(){
        return tableData.size();
    }

    boolean hapusData(){
        System.out.print("Hapus data praktikan dengan Nim : ");
        String nim = input.nextLine();
        if(tableData.containsKey(nim)){
            tableData.remove(nim);
            return true;
        } else {
            System.out.println("Nim tersebut belum terdaftar!!");
            return false;
        }
    }
    void editData(){
        System.out.print("Edit data dari Nim : ");
        String nim = input.nextLine();
        if(tableData.containsKey(nim)){
            System.out.println("Ubah Asisten : ");
            String asist = input.nextLine();
            tableData.put(nim, asist);
        } else {
            System.out.println("Nim tersebut belum terdaftar!!");
        }
    }

    void search(){
        System.out.println("Fitur Belum Tersedia");
    }

}
