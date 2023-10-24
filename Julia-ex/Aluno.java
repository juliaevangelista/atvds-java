import java.util.Date;

public class Aluno extends Pessoa {
    public String matricula;
    public Aluno(String nome, String cpf, Date dataNascimento){
        super(nome, cpf, dataNascimento);
    }
    public double tirarCopias(int qtd){
        return 0.07 * (double) qtd;
    }
    
}
