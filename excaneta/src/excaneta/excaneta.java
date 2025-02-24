package excaneta;

// Classe principal
public class excaneta {

    
    public static void main(String[] args) {
      Caneta caneta1 = new Caneta();
      caneta1.cor = "Azul";
      caneta1.carga = 100;
      caneta1.rabiscar();
      caneta1.tampada = true;
      
      caneta1.status();
      
      
      
    }
    
}