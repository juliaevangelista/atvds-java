public class Peixe extends Animal {
    public String caracteristica;
    public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia){
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
    }
    public Peixe(String caracteristica,String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidadeMedia){
        super(nome, comprimento, numPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }
    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public void dadosPeixe(){
        System.out.println("Animal [nome=" + nome + ", comprimento=" + comprimento + ", numPatas=" + numPatas + ", cor=" + cor
                + ", ambiente=" + ambiente + ", velocidadeMedia=" + velocidadeMedia + ", caracteristicas=" + caracteristica + "]");
    }

    

}
