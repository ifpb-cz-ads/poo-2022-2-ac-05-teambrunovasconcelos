public class BMExercicio3 {
    String nomeDoCorrentista;
    double saldo;
    boolean contaEspecial;

    public void abreConta(String nome, float deposito, boolean especial) {
        nomeDoCorrentista = nome;
        saldo = deposito;
        contaEspecial = especial;
    }

    public void abreContaSimples(String nome) {
        nomeDoCorrentista = nome;
        saldo = 0.00;
        contaEspecial = false;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void retira(double valor) {
        if (contaEspecial == false) {
            if (valor <= saldo) {
                saldo = saldo - valor;
            }
        } else {
            saldo = saldo - valor;
        }
    }

    public void motraDados() {
        System.out.println("O nome do correntista é" + nomeDoCorrentista);
        System.out.println("O saldo é " + saldo);
        if (contaEspecial) {
            System.out.println("Essa conta é especial.");
            if (saldo < 0) {
                System.out.println("Sua conta está com saldo negativo");
            }
        } else {
            System.out.println("Essa conta é comum.");
        }
    }
}
