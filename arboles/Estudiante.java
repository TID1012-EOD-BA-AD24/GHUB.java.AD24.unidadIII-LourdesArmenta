package arboles;

public class Estudiante implements Comparable{
    private int codigo;
    private String nombre;
    public Estudiante(){

    }
    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
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
        return codigo + " - " + nombre+" ," ;
    }

    @Override
    public boolean esIgual(Object q) {
        Estudiante obj = (Estudiante) q;
        if (this.codigo == obj.getCodigo())
            return true;
        else
           return false;
    }
        
        
    @Override
    public boolean esMayor(Object q) {
        Estudiante obj = (Estudiante)q;
        if (this.codigo > obj.getCodigo())
           return true;
        else
           return false;
    }

    @Override
    public boolean esMenor(Object q) {
       Estudiante obj = (Estudiante)q;
        if (this.codigo < obj.getCodigo())
           return true;
        else
           return false;
    }
    
    
    
    
}
