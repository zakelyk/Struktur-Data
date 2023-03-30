import java.util.ArrayList;

public class hewan {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<String>();
        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");

        hewan.add("Badak");
        hewan.add("Bebek");

        System.out.println(hewan);
        int bebek=0;
        ArrayList<Integer> posisi = new ArrayList<Integer>();
        for(int i=0; i<hewan.size();i++){
            if(hewan.get(i).equals("Bebek")){
                bebek++;
                posisi.add(i+1);
            }
        }
        System.out.println("Bebek = "+bebek);
        System.out.print("Posisi Index : ");
        System.out.println(posisi.toString().replace('[',' ').replace(']',' '));

        hewan.remove("Bebek");
        System.out.println("\n"+hewan);
        System.out.println("Index ke-0 : "+hewan.get(0)+
                "\nIndex ke-2 : "+hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);

        hewan.set(0,"Ular");
        hewan.add(2, "itik");


    }




}
