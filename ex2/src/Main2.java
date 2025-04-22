import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cadastro de Morador");
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

        Morador morador = new Morador(nome, cpf, celular, dataNascimento, sexo, bloco, apartamento, codigoAcesso);
        morador.exibirDados();
    }
}
