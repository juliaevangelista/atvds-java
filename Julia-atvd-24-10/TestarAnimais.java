public class TestarAnimais {
    public static void main(String[] args) {
        Peixe baiacu = new Peixe("ele solta veneno","baiacu", 5, 0, "vermelho", "agua", 2);
        baiacu.dadosPeixe();

        Mamifero gatim = new Mamifero("mouse", "gato", 20, 4, "preto e branco", "minha casa", 50);
        gatim.dadosMamifero();

    }
}
