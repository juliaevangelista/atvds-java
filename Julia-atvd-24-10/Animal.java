

public class Animal{
    public String nome;
    public double comprimento;
    public int numPatas;
    public String cor;
    public String ambiente;
    public double velocidadeMedia;
    public Animal(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numPatas = numPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getComprimento() {
        return comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public int getNumPatas() {
        return numPatas;
    }
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAmbiente() {
        return ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }
    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
    public void dados(){
        System.out.println("Animal [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" + numPatas + ", cor=" + cor
                + ", ambiente=" + ambiente + ", velocidadeMedia=" + velocidadeMedia + "]");
    }
    
}