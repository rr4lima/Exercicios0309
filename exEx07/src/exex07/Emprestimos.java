 package exex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Emprestimos {
    private Usuarios usuario;
    private Livros livro;
    private int diasEmprestado;
    private boolean devolvido;

    private List<Emprestimos> emprestimos = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void realizarEmprestimo(List<Usuarios> usuarios, List<Livros> livros) {
        if (usuarios.isEmpty() || livros.isEmpty()) {
            System.out.println("Não é possível emprestar. Cadastre usuários e livros primeiro.");
            return;
        }

        System.out.println("Escolha o usuário:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + " - " + usuarios.get(i).getNome());
        }
        int escolhaUsu = Integer.parseInt(scanner.nextLine()) - 1;
        Usuarios usuarioSelecionado = usuarios.get(escolhaUsu);

        System.out.println("Escolha o livro:");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println((i + 1) + " - " + livros.get(i).getTitulo());
        }
        int escolhaLivro = Integer.parseInt(scanner.nextLine()) - 1;
        Livros livroSelecionado = livros.get(escolhaLivro);

        if (livroSelecionado.isEmprestado()) {
            System.out.println("Livro já está emprestado.");
            return;
        }

        System.out.print("Digite o número de dias do empréstimo: ");
        int dias = Integer.parseInt(scanner.nextLine());

        livroSelecionado.setEmprestado(true);
        livroSelecionado.incrementarEmprestimos();
        emprestimos.add(new Emprestimos(usuarioSelecionado, livroSelecionado, dias));
        System.out.println("Empréstimo realizado com sucesso!");
    }

    public void devolverLivro() {
        System.out.print("Digite o título do livro a devolver: ");
        String titulo = scanner.nextLine();
        for (Emprestimos e : emprestimos) {
            if (e.getLivro().getTitulo().equalsIgnoreCase(titulo) && !e.isDevolvido()) {
                e.setDevolvido(true);
                e.getLivro().setEmprestado(false);
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado ou já devolvido.");
    }

    public void calcularMulta(int diasPermitidos, double valorMulta) {
        for (Emprestimos e : emprestimos) {
            if (!e.isDevolvido() && e.getDiasEmprestado() > diasPermitidos) {
                int atraso = e.getDiasEmprestado() - diasPermitidos;
                System.out.println("Usuário " + e.getUsuario().getNome() +
                        " deve multa de R$ " + (atraso * valorMulta) +
                        " pelo livro " + e.getLivro().getTitulo());
            }
        }
    }

    public void listarEmprestimos() {
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum empréstimo realizado.");
        } else {
            for (Emprestimos e : emprestimos) {
                System.out.println("Usuário: " + e.getUsuario().getNome() +
                                   " | Livro: " + e.getLivro().getTitulo() +
                                   " | Dias: " + e.getDiasEmprestado() +
                                   " | Devolvido: " + (e.isDevolvido() ? "Sim" : "Não"));
            }
        }
    }

    public Emprestimos() {}
    public Emprestimos(Usuarios usuario, Livros livro, int diasEmprestado) {
        this.usuario = usuario;
        this.livro = livro;
        this.diasEmprestado = diasEmprestado;
        this.devolvido = false;
    }

    public Usuarios getUsuario() { return usuario; }
    public Livros getLivro() { return livro; }
    public int getDiasEmprestado() { return diasEmprestado; }
    public boolean isDevolvido() { return devolvido; }
    public void setDevolvido(boolean devolvido) { this.devolvido = devolvido; }
    public List<Emprestimos> getEmprestimos() { return emprestimos; }

    @Override
    public String toString() {
        return "Emprestimos{" + "usuario=" + usuario + ", livro=" + livro + ", diasEmprestado=" + diasEmprestado + ", devolvido=" + devolvido + ", emprestimos=" + emprestimos + ", scanner=" + scanner + '}';
    }
    
    
}
