class Lampada {
  boolean acesa;
  void acender(){
    acesa = true;
  }
  void apagar(){
    acesa = false;
  }
  void mostrarEstado(){
    if (acesa == true){
      System.out.println("Acesa");
    } else{
      System.out.println("Apagada");  
    }
  }
}