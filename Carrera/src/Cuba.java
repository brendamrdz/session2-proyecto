public class Cuba extends Carrera {
    String nombreCorredor;
    String letras;
    public Cuba(Integer distancia, Integer ronda) {
        super(distancia, ronda);
    }
    
    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
    this.nombreCorredor = nombreCorredor;
    }

    public String primerLetra(){
        String primerLetra = nombreCorredor.substring(0,1);
        return primerLetra;
     }
     public String tercerLetra(){
        String tercerLetra = nombreCorredor.substring(2,3);
        return tercerLetra;
     }
     public String mayuscula(String letras) {
    	 String mayusculas = letras.toUpperCase();
    	 char primerLetra = mayusculas.charAt(0);
    	 String tercerLetra = mayusculas.substring(2,4);
    	 return primerLetra + tercerLetra;
     }
    
}