package ex02;

public class Ex02 {


    public static void main(String[] args) {
       Departamentos d1 = new Departamentos();
       d1.adcDepart();
       d1.listarDepart();
       d1.calcularSalario();
       
       Funcionarios f1 = new Funcionarios("Mateus");
       
       f1.adcFunc();
       f1.listarFunc();
       
       Projetos p1 = new Projetos();
       p1.adcProj();
       p1.listarProj();
       
       
    }
    
}
