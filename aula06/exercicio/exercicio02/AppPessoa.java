package exercicio.exercicio02;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Nome Pessoa", "11111111");
        Estudante e = new Estudante("Nome estudante", "22222222", "Comutação");
        Professor prof = new Professor("Nome professor", "33333333", 2000);

        System.out.println(p);
        System.out.println(e);
        System.out.println(prof);
    }
    
}
