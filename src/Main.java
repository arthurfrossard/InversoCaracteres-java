import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite uma string para inverter:");
            String input = scanner.nextLine();

            String invertedString = inverterString(input);
            System.out.println("String invertida: " + invertedString);

            System.out.println("Deseja inserir outra string? (S / N)");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("N")) {
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }
        }

        scanner.close();
    }

    public static String inverterString(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i - 1] = temp;
        }

        return new String(chars);
    }
}