public class CBBAtividadePratica4 {
    public static void main(String[] args) {
        RegistraAluno bruno = new RegistraAluno();
        RegistraAluno brenda = new RegistraAluno();

        bruno.setNome("Bruno");
        brenda.setNome("Brenda");

        bruno.setIdade(17);
        bruno.setEndereco("Rua São Francisco, Centro");

        System.out.println(bruno.getNome());
        System.out.println(bruno.getIdade());
        System.out.println(bruno.getEndereco());
        System.out.println("Contador: " + RegistraAluno.getQuantidadeAluno());
    }
}
