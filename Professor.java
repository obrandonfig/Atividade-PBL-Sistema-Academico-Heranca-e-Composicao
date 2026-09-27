public class Professor extends Pessoa {

    private String area;

    public Professor(String nome, String matricula, String email, String area) {
        super(nome, matricula, email);
        this.area = area;
    }
    
    public String getArea() {
        return area;
    }

    public void registrarNota() {
        System.out.println(" ");
        System.out.println("Nota registrada com sucesso!");
    }

}
