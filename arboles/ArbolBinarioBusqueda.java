package arboles;


public class ArbolBinarioBusqueda extends ArbolBinario {
    public ArbolBinarioBusqueda(){
        super();

    }
    public ArbolBinarioBusqueda(Nodo raiz){
        super(raiz);
    }
    /**
     * 
     * @param valor, a insertar
     */
    public void insertar(Object valor) throws Exception{
        Comparable dato = (Comparable) valor;
        Nodo nuevo = new Nodo();
        if (raiz == null)
           raiz = nuevo;
        else{
            //anterior: referencia al padre de aux
            Nodo anterior = null;
            //aux: es un nodo auxiliar que va recorriendo los nodos,
            //desde la raiz
            Nodo aux = raiz;
            while (aux != null){
                anterior=aux;
                if (dato.esMenor(aux.getValor()))
                   aux = aux.getIzquierdo();
                else if(dato.esMayor(aux.getValor()))
                   aux = aux.getDerecho();
                else
                  throw new Exception("Dato Duplicado");
            }
            if(dato.esMenor(anterior.getValor()))
               anterior.setIzquierdo(nuevo);
            else
                anterior.setDerecho(nuevo);
        }

    }

    //interfaz de la version recursica
    public void insertar2(Object valor) throws Exception{
        Comparable dato = (Comparable)valor;
        raiz = insertarRec(raiz,dato);
    }
    private Nodo insertarRec(Nodo raizSub, Comparable dato) throws Exception{
        if (raizSub == null){
            //caso base, termina le recursividad
            raizSub = new Nodo(dato);
        }else{
            if (dato.esMenor(raizSub.getValor())){
                Nodo iz = insertarRec(raizSub.getIzquierdo(), dato);
            }
            else{
                if (dato.esMayor(raizSub.getValor())){
                    Nodo dr = insertarRec(raizSub.getDerecho(), dato);

                }
                else{
                    throw new Exception("Dato Duplicado");
                }
            }
        }
        return raizSub;
    }

    /**
     * @param valor, el valor buscado
     * @return Nodo o null en caso de no encontrar el valor buscado
     */

    public Nodo buscar(Object valor){
        Comparable dato = (Comparable)valor;
        if (raiz==null)
           return raiz;
        else{
           //aux: auxiliar que va recorriendo los nodos, desde la raiz
           Nodo aux = raiz;
           while (aux !=null){
              if (dato.esIgual(aux.getValor()))
                  return aux;
              if (dato.esMenor(aux.getValor()))
                aux = aux.getIzquierdo();
              else 
                   aux = aux.getDerecho();
              
           }
           return null;
        }
        
    }

    //interface de la llamada recursiva
    public Nodo buscar2(Object buscado){
        Comparable dato = (Comparable)buscado;
        if (raiz==null)
           return null;
        else
           return localizar(raiz,dato);
    }

    //llamada recursiva
    private Nodo localizar(Nodo raizSub, Comparable buscado){
        if(raizSub == null)
           return null;
        else if (buscado.esIgual(raizSub.getValor()))
           return raizSub;
        else if(buscado.esMenor(raizSub.getValor()))
           return localizar(raizSub.getIzquierdo(), buscado);
        else
        return localizar(raizSub.getDerecho(), buscado);

    }

    public boolean eliminar(Object valor){
        Comparable dato = (Comparable) valor;
        //Buscar el nodo a eliminar y su antecesor
        Nodo antecesor = null; //antecesro del nodo a eliminar
        //aux: auxiliar que va recorriendo los nodos, desde la raiz
        Nodo aux = raiz;
        while (aux != null){
           if (dato.esIgual(aux.getValor())){
              break;
           }
           antecesor = aux;
           if(dato.esMenor(aux.getValor()))
              aux = aux.getIzquierdo();
           else
              aux= aux.getDerecho();
        }
        if (aux ==null)
           return false; //dato no se encontro;
        //si llega a este punto, quiere decir que el nodo existe
        //y es aux y su antecesor es antecesor
        //Examinar cada caso
        //1. Si tiene menos de dos hijos, incluso una hoja, 
        //   reajustar los enlaces de su antecesor
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
       Nodo mayor = act;
       Nodo ant = act;
       mayor = act.getIzquierdo();
       //Buscar el mayor de la rama izquierda
       //ant el antecesor de mayor
       while(mayor.getDerecho()!=null)
       {
          ant=mayor;
          mayor = mayor.getDerecho();

       }
       act.setValor(mayor.getValor()); //reemplazo
       if (ant == act)
          ant.setIzquierdo(mayor.getIzquierdo());
       else
          ant.setDerecho(mayor.getIzquierdo());


    }


    
}
