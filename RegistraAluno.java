public class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String temp) {
        nome = temp;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String temp) {
        endereco = temp;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int temp) {
        idade = temp;
    }

    public void setNotaMatematica(double temp) {
        notaMatematica = temp;
    }

    public void setNotaPortugues(double temp) {
        notaPortugues = temp;
    }

    public void setNotaGeografia(double temp) {
        notaGeografia = temp;
    }

    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica + notaGeografia + notaPortugues) / 3;
        return resultado;
    }

    public static int getQuantidadeAluno() {
        return contadorAluno;
    }

}