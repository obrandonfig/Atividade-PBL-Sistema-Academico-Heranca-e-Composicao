public class Pessoa {

    private String nome;
    private String matricula;
    private String email;

    public Pessoa(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;

    }

    public String getNome() {
        return nome;

    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;

    }

    public void exibirDados() {
        System.out.println(" ");
        System.out.println("===============================");
        System.out.println("Nome:" + nome);
        System.out.println("Matrícula:" + matricula);
        System.out.println("Email:" + email);
        System.out.println("===============================");
    }
    
}
