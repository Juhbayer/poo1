
package excaneta;

public class Caneta {

// Atributos
    String marca, cor;
    boolean tampada;
    double ponta;
    int carga;

//    Métodos
    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

    void rabiscar () {
        if (this.tampada == true) {
            System.out.println("Erro! Não é possível rabiscar");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }
    
    void status() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Esta caneta está tampada? " + tampada);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
    }

}