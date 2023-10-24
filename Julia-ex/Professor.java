import java.util.Date;

public class Professor extends Pessoa {
    public String disciplina;
    public double salario;
    public Professor(String nome, String cpf, Date dataNascimento){
        super(nome, cpf, dataNascimento);
    }
}
