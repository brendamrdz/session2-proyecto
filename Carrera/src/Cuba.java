public class Cuba extends Carrera {
    String nombreCorredor;
    String letras;
    public Cuba(Integer distancia, Integer ronda, Long fecha) {
        super(distancia, ronda, fecha);
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
    
}