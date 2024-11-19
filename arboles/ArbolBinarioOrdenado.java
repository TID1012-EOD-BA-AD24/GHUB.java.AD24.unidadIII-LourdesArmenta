package arboles;
public class ArbolBinarioOrdenado extends ArbolBinario{
   
    public ArbolBinarioOrdenado(){
        super();
        
    }
    public ArbolBinarioOrdenado(Nodo raiz){
        super(raiz);
    }


    //insertar un nodo en el árbol versión iterativa
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);

        if (raiz==null)
           raiz = nuevo;
        else{
            //anterior es una referencia al padre de aux
            Nodo anterior = null;
            //aux es un auxiliar que va recorriendo los nodos, desde la raiz
            Nodo aux = raiz;
            while (aux != null){
                anterior = aux;
                if (dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                else if (dato.esMayor(aux.getValor()))
                   aux = aux.getDerecho();
                else 
                   throw new Exception("Dato duplicado");

            }
            if (dato.esMenor(anterior.getValor()))
               anterior.setIzquierdo(nuevo);
            else 
               anterior.setDerecho(nuevo);
        }

    }
    
    //Insertar, versión recursiva
    public void insertar2(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        raiz = insertarRec(raiz,dato);
    }

    private Nodo insertarRec(Nodo raizSub, Comparable dato) throws Exception{
        if (raizSub == null){
            //caso base, termina la recursividad
            raizSub = new Nodo(dato);
        }
        else{
            if (dato.esMenor(raizSub.getValor())){
                Nodo iz = insertarRec(raizSub.getIzquierdo(),dato);
                raizSub.setIzquierdo(iz);   
            }
            else{
                if (dato.esMayor(raizSub.getValor())){
                    Nodo dr = insertarRec(raizSub.getDerecho(),dato);
                    raizSub.setDerecho(dr);   
                }
                else{
                    //dato duplicado
                    throw new Exception("Nodo Duplicado");
                }
            }
        }
        return raizSub;

    }

    //Busca un dato en el árbol comenzando desde la raiz, versión iterativa
    /*
     * Si lo encuentra, retorna un Nodo en caso contrario regresa null
     */
    public Nodo buscar(Object valor){
        Comparable dato = (Comparable) valor;
        if (raiz==null)
          return raiz;
        else{
            //aux, es un auxiliar que va recorriendo los nodos, desde la raiz
            Nodo aux = raiz;
            while( aux !=null){
                if (dato.esIgual(aux.getValor()))
                   return aux;
                if(dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                else  
                   aux = aux.getDerecho();

            }
            return null;
        }

    }
    //Version Recursiva
    public Nodo buscar2(Object buscado){
        Comparable dato = (Comparable) buscado;
        if (raiz ==null)
           return null;
        else 
           return localizar(raiz,dato);
    }

    public Nodo localizar(Nodo raizSub, Comparable buscado){
        if (raizSub == null)
           return null;
        else if(buscado.esIgual(raizSub.getValor()))
           return raizSub;
        else if(buscado.esMenor(raizSub.getValor()))
           return localizar(raizSub.getIzquierdo(),buscado);
        else
           return localizar(raizSub.getDerecho(),buscado);
           
    }
    //Implementacion iterativa de eliminar
    public boolean eliminar(Object valor){
        Comparable dato = (Comparable)valor;
        //Busco el nodo a eliminar y su antecesor
        //antecesor: es el padre del nodo a eliminar
        Nodo antecesor = null;
        //aux: auxiliar que va recorriendo los nodoso
        Nodo aux = raiz;
        while(aux !=null){
            if (dato.esIgual(aux.getValor())){
                break;
            }
            antecesor = aux;
            if(dato.esMenor(aux.getValor()))
               aux = aux.getIzquierdo();
            else
               aux = aux.getDerecho();
        }
        if (aux ==null)
           return false;//dato no encontrado
        //si llega a este punto, el nodo a eliminar existe y esta en aux y el
        // su padre esta en antecesor
        //Examinar cada caso
        if(aux.getIzquierdo() ==null){
           
          if(((Comparable) aux.getValor()).esMenor(antecesor.getValor()))
             antecesor.setIzquierdo(aux.getDerecho());
          else
             antecesor.setDerecho(aux.getDerecho());
        }
        else if(aux.getDerecho()==null){
                if(((Comparable)aux.getValor()).esMenor(antecesor.getValor()))
                   antecesor.setIzquierdo(aux.getIzquierdo());
                else
                   antecesor.setDerecho(aux.getIzquierdo());
        }
        else  
           //El nodo a eliminar tiene rama izquierda y rama derecha
           reemplazarPorMayorIzquierdo(aux);
        aux = null;
        return true;


    }
    private void reemplazarPorMayorIzquierdo(Nodo act){
        Nodo mayor=act;
        Nodo ant = act;
        mayor = act.getIzquierdo();
        //Buscar el mayor de la rama izquiersda
        //ant el antecesor de mayor
        while(mayor.getDerecho() != null){
            ant= mayor;
            mayor = mayor.getDerecho();
        }
        act.setValor(mayor.getValor()); //reenplazo //reajuste
        if(ant ==act)
           ant.setIzquierdo(mayor.getIzquierdo());
        else
           ant.setDerecho(mayor.getIzquierdo());


    }

}
