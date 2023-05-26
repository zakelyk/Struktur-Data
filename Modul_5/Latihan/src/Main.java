public class Main {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();

        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\nPreOrder : ");
        pohon.preOrder(pohon.root);
        System.out.println("\ninOrder : ");
        pohon.inOrder(pohon.root);
        System.out.println("\nPostOrder : ");
        pohon.postOrder(pohon.root);
    }
}
