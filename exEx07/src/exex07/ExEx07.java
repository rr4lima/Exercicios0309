package exex07;

public class ExEx07 {
    public static void main(String[] args) {
        Autores autores = new Autores();
        autores.adcAutor();
        autores.listarAutores();

        Livros livros = new Livros();
        livros.adcLivro(autores.getAutores());
        livros.listarLivros();

        Usuarios usuarios = new Usuarios();
        usuarios.adcUsuario();
        usuarios.listarUsuarios();

        Emprestimos emprestimos = new Emprestimos();
        emprestimos.realizarEmprestimo(usuarios.getUsuarios(), livros.getLivros());
        emprestimos.listarEmprestimos();

        emprestimos.devolverLivro();
        emprestimos.calcularMulta(7, 2.5);

        System.out.println("Livros mais populares:");
        for (Livros l : livros.getMaisPopulares()) {
            System.out.println(l.getTitulo() + " | Empréstimos: " + l.getVezesEmprestado());
        }
    }
}
