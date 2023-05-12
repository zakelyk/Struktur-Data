import java.util.Scanner;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan input \t: ");
        String text = input.nextLine();
        int top = -1;

        char[] index = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
           index[i] = text.charAt(i);
           top++;
        }

        String reversed="";

        while (top != -1){
            char c = (char) index[top--];
            reversed += c;
        }

        System.out.println("Reversed \t\t: "+reversed);
    }
}
