public class Nayarit extends Carrera{
    Integer personas;
    
    public Nayarit(Integer distancia, Integer ronda) {
        super(distancia, ronda);
    }
    
    public Integer getPersonas() {
        return personas;
    }
    public void setPersonas(Integer personas) {
        this.personas = personas;
    }
    public double raizCuadrada(){
       double raiz_cuadrada = Math.sqrt(personas);
       return raiz_cuadrada;
    }
}
