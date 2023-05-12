import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Order masuk");
            System.out.println("2. Buang Order Terlama");
            System.out.println("3. Tampilkan Order Terlama");
            System.out.println("4. Apakah Terdapat Order?");
            System.out.println("5. Jumlah Order saat ini");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    input.nextLine();
                    System.out.print("Masukkan Order Atas Nama : ");
                    String order = input.nextLine();
                    System.out.println("Order milik "+q.enqueue(order)+" telah di tambahkan");
                    break;
                case 2:
                    if(q.isEmpty()){
                        System.out.println("Tidak terdapat data");
                    } else {
                        System.out.println("order terlama "+q.dequeue()+" telah dibuang");
                    }
                    break;
                case 3:
                    if(q.isEmpty()){
                        System.out.println("Tidak terddapat orderan saat ini");
                    }else{
                        System.out.println("Orderan Terlama : "+q.peek());
                    }

                    break;
                case 4:
                    if(!q.isEmpty()){
                        System.out.println("Terdapat Orderan Masuk!!");
                    }else{
                        System.out.println("Tidak ada orderan yang terdata");
                    }
                    break;
                case 5:
                    if(q.isEmpty()){
                        System.out.println("Tidak terddapat orderan saat ini");
                    } else {
                        System.out.println("Jumlah Orderan saat ini : "+q.size());
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);
    }
}