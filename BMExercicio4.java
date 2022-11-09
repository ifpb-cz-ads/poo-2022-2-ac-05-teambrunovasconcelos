public class BMExercicio4 {
    String nomeLampada;
    String estado;

    public void acende() {
        estado = "ligada";
    }

    public void apaga() {
        estado = "desligada";
    }

    public void mostraEstado() {
        System.out.println(estado);
    }
}