public class Mamifero extends Animal {
    public String alimento;
    public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia){
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
    }
    public Mamifero(String alimento,String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia){
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }
    public String getalimento() {
        return alimento;
    }
    public void setalimento(String alimento) {
        this.alimento = alimento;
    }
    public void dadosMamifero(){
        System.out.println("Animal [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" + numPatas + ", cor=" + cor
                + ", ambiente=" + ambiente + ", velocidadeMedia=" + velocidadeMedia + ", alimentos=" + alimento + "]");
    }
    
}
