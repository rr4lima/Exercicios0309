package exex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Livros {
    private String titulo;
    private Autores autor;
    private boolean emprestado;
    private int vezesEmprestado;

    private List<Livros> livros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcLivro(List<Autores> autores) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Deseja cadastrar um novo livro? 1 - Sim | 2 - Não");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o título do livro: ");
                String tituloLivro = scanner.nextLine();

                if (autores.isEmpty()) {
                    System.out.println("Nenhum autor cadastrado! Cadastre primeiro.");
                    return;
                }
                System.out.println("Escolha o autor:");
                for (int i = 0; i < autores.size(); i++) {
                    System.out.println((i + 1) + " - " + autores.get(i).getNome());
                }
                int escolhaAutor = Integer.parseInt(scanner.nextLine()) - 1;
                Autores autorSelecionado = autores.get(escolhaAutor);

                livros.add(new Livros(tituloLivro, autorSelecionado));
                System.out.println("Livro cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro de livros encerrado.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            System.out.println("Livros cadastrados:");
            for (Livros l : livros) {
                System.out.println("Título: " + l.getTitulo() + 
                                   " | Autor: " + l.getAutor().getNome() + 
                                   " | Emprestado: " + (l.isEmprestado() ? "Sim" : "Não"));
            }
        }
    }

    public List<Livros> getMaisPopulares() {
        livros.sort((l1, l2) -> Integer.compare(l2.getVezesEmprestado(), l1.getVezesEmprestado()));
        return livros;
    }

    public Livros() {}
    public Livros(String titulo, Autores autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
        this.vezesEmprestado = 0;
    }

    public String getTitulo() { return titulo; }
    public Autores getAutor() { return autor; }
    public boolean isEmprestado() { return emprestado; }
    public void setEmprestado(boolean emprestado) { this.emprestado = emprestado; }
    public int getVezesEmprestado() { return vezesEmprestado; }
    public void incrementarEmprestimos() { this.vezesEmprestado++; }
    public List<Livros> getLivros() { return livros; }

    @Override
    public String toString() {
        return "Livros{" + "titulo=" + titulo + ", autor=" + autor + ", emprestado=" + emprestado + ", vezesEmprestado=" + vezesEmprestado + ", livros=" + livros + ", scanner=" + scanner + '}';
    }
    
    
    
}



