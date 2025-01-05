import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        
        System.out.println("Olá você tem dinheiro?");
 Scanner scanner = new Scanner(System.in);
        
        // Exibir a pergunta para o usuário
        System.out.println("Olá, você tem dinheiro? (yes/no)");

        // Ler a resposta do usuário
        String resposta = scanner.nextLine().trim().toLowerCase(); // .trim() para remover espaços extras e .toLowerCase() para não diferenciar maiúsculas de minúsculas

        // Verificar a resposta e tomar a ação apropriada
        if (resposta.equals("yes")) {
            System.out.println("Você tem dinheiro!");
        } else if (resposta.equals("no")) {
            System.out.println("Você não tem dinheiro!");
        } else {
            System.out.println("Resposta inválida. Por favor, responda com 'yes' ou 'no'.");
        }

        // Fechar o scanner
        scanner.close();
    }
}
 
