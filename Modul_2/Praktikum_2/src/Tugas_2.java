public class Tugas_2 {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.add(8);
        list.add(7);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(3);

        System.out.print("before: ");
        list.printList();

        list.sort();

        System.out.print("after : ");
        list.printList();
    }
}