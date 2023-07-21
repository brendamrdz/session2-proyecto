import java.util.Date;
import java.util.Calendar;

public class Carrera {
    
    Integer distancia;
    Integer ronda;
    Integer month1;
    public static void main(String[] args) throws Exception {
        Carrera carrera1 = new Carrera(2,30);
        System.out.println("La distancia es:"+carrera1.calcular_distancia()+" y el valor es de tipo "+((Object)carrera1.calcular_distancia()).getClass().getSimpleName());
        
        Date date = new Date();
        System.out.println("La fecha actual es: "+ date);
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int mesActual = cal.get(Calendar.MONTH)+1;
        System.out.println(mesActual);
        		
        Nayarit nayarit1 = new Nayarit(carrera1.distancia, carrera1.ronda);
        nayarit1.setPersonas(16);
        System.out.println( "\nRaíz cuadrada de participantes: " + nayarit1.raizCuadrada());
        
        Cuba cuba1 = new Cuba(carrera1.distancia, carrera1.ronda);
        cuba1.setNombreCorredor("Nombre");
        System.out.println( "\nPrimer Letra del nombre: " + cuba1.primerLetra());
        System.out.println( "\nTercera Letra del nombre: " + cuba1.tercerLetra());
        System.out.println( "\nTercera Letra del nombre: " + cuba1.mayuscula("Brenda"));
    }

    public Carrera(Integer distancia, Integer ronda) {
        this.distancia = distancia;
        this.ronda = ronda;
    }

    public Integer getDistancia() {
        return distancia;
    }
    public void setDistancia(Integer distancia) {
        this.distancia = distancia;
    }

    public Integer getRonda() {
        return ronda;
    }
    public void setRonda(Integer ronda) {
        this.ronda = ronda;
    }
    
    public String calcular_distancia(){
        Integer dist = getDistancia() * getRonda();
        String num_cadena = Integer.toString(dist);
        return num_cadena;
    }
}
