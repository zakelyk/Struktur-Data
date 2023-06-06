import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();

        System.out.print("Masukkan jumlah elemen yang ingin dimasukkan ke dalam Binary Tree: ");
        int n = input.nextInt();

        System.out.println("Masukkan elemen-elemen yang ingin dimasukkan ke dalam Binary Tree: ");
        for (int i = 0; i < n; i++) {
            String data = input.next();
            tree.insert(data);
        }

        System.out.println("\nBinary Tree yang terbentuk:");
        tree.printTree();

        System.out.println("\nPreorder :");
        tree.preOrder(tree.root);

        System.out.println("\nInorder :");
        tree.inOrder(tree.root);

        System.out.println("\nPostorder :");
        tree.postOrder(tree.root);
    }
}
