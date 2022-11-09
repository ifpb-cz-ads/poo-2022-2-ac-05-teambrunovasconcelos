public class BMExercicio2 {
    String nome = "Flamengo";
    int vitorias = 13;
    int derrotas = 5;
    int empates = 3;
    int resultado = 0;

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
