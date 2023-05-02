import java.util.Scanner;

public class TestInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan string: ");
        String inputString = sc.nextLine();

        myStack stack = new myStack();

        // push setiap karakter dari string ke dalam stack
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            stack.push(c);
        }

        // pop setiap karakter dari stack dan tambahkan ke dalam string yang terbalik
        String reversedString = "";
        while (!stack.empty()) {
            char c = (char) stack.pop();
            reversedString += c;
        }

        System.out.println("String yang terbalik: " + reversedString);
    }
}
