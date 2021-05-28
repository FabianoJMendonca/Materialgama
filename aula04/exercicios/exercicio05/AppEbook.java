package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro1 = new Ebook("Narnia", "C.S.L.", 300);

        livro1.exibirCapa();
        livro1.avancarPagina();
        System.out.println("Página atual: " + livro1.exibirPagina());
        livro1.avancarPagina();
        livro1.avancarPagina();
        livro1.avancarPagina();
        System.out.println("Página atual: " + livro1.exibirPagina());
        livro1.irParaPagina(170);
        System.out.println("Página atual: " + livro1.exibirPagina());

    }
    
}
