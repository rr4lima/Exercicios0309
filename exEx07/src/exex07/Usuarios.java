package exex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Usuarios {
    private String nome;
    private List<Usuarios> usuarios = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void adcUsuario() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Deseja cadastrar um novo usuário? 1 - Sim | 2 - Não");
            String resposta = scanner.nextLine();

            if (resposta.equals("1")) {
                System.out.print("Digite o nome do usuário: ");
                String nomeUsuario = scanner.nextLine();
                usuarios.add(new Usuarios(nomeUsuario));
                System.out.println("Usuário cadastrado com sucesso!");
            } else if (resposta.equals("2")) {
                System.out.println("Cadastro encerrado.");
                continuar = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Usuários cadastrados:");
            for (Usuarios u : usuarios) {
                System.out.println("Nome: " + u.getNome());
            }
        }
    }

    public Usuarios() {}
    public Usuarios(String nome) { this.nome = nome; }

    public String getNome() { return nome; }
    public List<Usuarios> getUsuarios() { return usuarios; }

    @Override
    public String toString() {
        return "Usuarios{" + "nome=" + nome + ", usuarios=" + usuarios + ", scanner=" + scanner + '}';
    }
    
    
}
