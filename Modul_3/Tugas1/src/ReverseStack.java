import java.util.Scanner;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan input : ");
        String text = input.nextLine();

        char[] index = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
           index[i] = text.charAt(i);
        }

        int top = text.length()-1;
        String reversed="";

        while (top != -1){
            char c = (char) index[top--];
            reversed += c;
        }

        System.out.println(reversed);
    }
}
