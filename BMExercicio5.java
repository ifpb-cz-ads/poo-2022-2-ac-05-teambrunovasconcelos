public class BMExercicio5 {
    String nomeTime;
    int vitorias;
    int derrotas;
    int empates;
    int resultado;

    public void ganhou() {
        vitorias++;
    }

    public void perdeu() {
        derrotas++;
    }

    public void empatou() {
        empates++;
    }

    public void resultado() {
        resultado = vitorias - derrotas - empates;
        System.out.println(resultado);

    }
}
