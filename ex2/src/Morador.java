public class Morador {
    private String nome;
    private String cpf;
    private String celular;
    private String dataNascimento;
    private String sexo;
    private String bloco;
    private String apartamento;
    private String codigoAcesso;

    public Morador(String nome, String cpf, String celular, String dataNascimento, String sexo, String bloco, String apartamento, String codigoAcesso) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.bloco = bloco;
        this.apartamento = apartamento;
        this.codigoAcesso = codigoAcesso;
    }

    public void exibirDados() {
        System.out.println("=== Dados do Morador ===\n");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Celular: " + celular);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Sexo: " + sexo);
        System.out.println("Bloco: " + bloco);
        System.out.println("Apartamento: " + apartamento);
        System.out.println("Código de Acesso: " + codigoAcesso);
        System.out.println();
    }
}

