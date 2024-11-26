package arboles;
import java.lang.Comparable;

public class Persona implements Comparable<Persona>{
    private int codigo;
    private String nombre;
    //constructores
    public Persona(){

    }

    public Persona(int codigo,String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    //getter y setter
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        
        return codigo+ ", "+nombre;
    }

    @Override
    public int compareTo(Persona o) {
        if (this.codigo == o.getCodigo())
            return 0;
        else if (this.codigo>o.getCodigo())
            return 1;
        else 
            return -1;
    }
    
    
    
    
}
