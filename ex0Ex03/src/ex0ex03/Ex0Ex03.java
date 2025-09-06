
package ex0ex03;

public class Ex0Ex03 {

    public static void main(String[] args) {
        Usuarios u1 = new Usuarios();
        u1.adcUsu();
        u1.listarUsu();
        
        
        Publicacoes p1 = new Publicacoes();
        p1.setNomeUsu(u1.getNomeUsu());
        p1.criarPublic();
        p1.listarPublic();
        
        Comentarios c1 = new Comentarios();
        c1.setAutor(u1.getNomeUsu());
        c1.adcComent();
        c1.listarComent();
    }
    
}
