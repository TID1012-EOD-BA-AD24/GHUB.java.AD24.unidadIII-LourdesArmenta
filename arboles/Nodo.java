package arboles;
public class Nodo {
    //Atributo valor de tipo Object Almacena la referencia al
    //objeto que se guarda en el nodo
    private Object valor;
    //Referencia  nodo derecho e izquierdo enlazado
    Nodo derecho;
    Nodo izquierdo;
    //constructor por defecto
    public Nodo(){
        valor =null;
        derecho=null;
        izquierdo =null;
    }
    
    public Nodo(Object valor) {
        this.valor = valor;
        this.derecho = null;
        this.izquierdo = null;
    }

    //devuelve el valor
    public Object getValor(){
        return valor;
    }

    //modificar el valor
    public void setValor(Object valor){
        this.valor=valor;
    }

    //devolver el atributo derecho
    public Nodo getDerecho(){
        return derecho;
    }

    //modificar el valor de derecho
    public void setDerecho(Nodo derecho){
        this.derecho = derecho;
    }
     //devolver el atributo izquierdo
    public Nodo getIzquierdo() {
        return izquierdo;
    }
    //modificar el valor de izquierdo
    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }
    

}