import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Morador[] moradores = new Morador[100]; // capacidade para até 100 moradores
        int contador = 0;
        while (true) {
            System.out.println("\nCadastro de Morador " + (contador + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("CPF: ");
            String cpf = sc.nextLine();
            System.out.print("Celular: ");
            String celular = sc.nextLine();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = sc.nextLine();
            System.out.print("Sexo: ");
            String sexo = sc.nextLine();
            System.out.print("Bloco: ");
            String bloco = sc.nextLine();
            System.out.print("Apartamento: ");
            String apartamento = sc.nextLine();
            System.out.print("Código de Acesso: ");
            String codigoAcesso = sc.nextLine();

            moradores[contador] = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
            contador++;

            System.out.print("Deseja cadastrar outro morador? (s/n): ");
            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("\n=== Lista de Moradores Cadastrados ===");
        for (int i = 0; i < contador; i++) {
            moradores[i].exibirDados();
        }
    }
}
