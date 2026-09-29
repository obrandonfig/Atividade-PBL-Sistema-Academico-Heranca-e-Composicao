public class Aluno extends Pessoa {

    private String curso;

    public Aluno(String nome, String matricula, String email, String curso) {
        super(nome, matricula, email);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;

    }

    public void solicitarMatricula() {
        System.out.println(" ");
        System.out.println("Matrícula solicitada com sucesso!");
        
    }

    
}
