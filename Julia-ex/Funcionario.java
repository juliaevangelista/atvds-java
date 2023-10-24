import java.util.Date;

public class Funcionario extends Pessoa {
    public String cargo;
    public double salario;
    public Date dataAdmissao;
    public Funcionario(String nome, String cpf, Date dataNascimento){
        super(nome, cpf, dataNascimento);
    } 
}

