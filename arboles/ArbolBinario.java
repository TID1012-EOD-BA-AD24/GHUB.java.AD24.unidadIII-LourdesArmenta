package arboles;
public class ArbolBinario{
    protected Nodo raiz;

    public ArbolBinario(){
        this.raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    //recorrido en preorden (RID)

    public void preorden(){
        preorden(raiz);
    }

    private void preorden(Nodo aux){
        if (aux != null){
            visitar(aux);
            preorden(aux.getIzquierdo());
            preorden(aux.getDerecho());
        }

    }

    //Recorrido inorden (IRD)
    public void inorden(){
        inorden(raiz);
    }

    private void inorden(Nodo aux){
        if (aux != null){
            inorden(aux.getIzquierdo());
            visitar(aux);
            inorden(aux.getDerecho());
        }

    }

    //Recorrido postorden (IDR)
    public void postorden(){
        postorden(raiz);
    }

    private void postorden(Nodo aux){
        if (aux !=null){
            postorden(aux.getIzquierdo());
            postorden(aux.getDerecho());
            visitar(aux);
        }
    }

    private void visitar(Nodo aux){
        System.out.print(aux.getValor()+" ");
    }
    /**
     * Recorrido por niveles
     */
    public void recorridoPorNiveles(){
        cola.Cola<Nodo> cola = new cola.Cola<>();
        cola.encolar(raiz);
        while (!cola.esVacia()){
            Nodo aux = cola.frente();
            visitar(aux);
            if (aux.getIzquierdo() != null){
                cola.encolar(aux.getIzquierdo());
                }
            if (aux.getDerecho() !=null)
                cola.encolar(aux.getDerecho());
            cola.desencolar();

        }

    }

    /**
     * Recorrido preorden version iterativa, utilizando una pila
     */
    public void preordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<>();
        pila.apilar(raiz);
        while (!pila.esVacia()){
            Nodo aux = pila.cima();
            visitar(aux);
            pila.retirar();
            if (aux.getDerecho()!=null)
               pila.apilar(aux.getDerecho());
            if(aux.getIzquierdo()!=null)
               pila.apilar(aux.getIzquierdo());
        }
    }

    /**
     * Recorrido inorden version iterativa, utiliza una pila
     */
    public void inordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<>();
        pila.apilar(raiz);
        Nodo aux = raiz.getIzquierdo();
        while (!pila.esVacia() || aux != null ){
            if(aux != null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }else{
                aux= pila.cima();
                pila.retirar();
                visitar(aux);
                aux = aux.getDerecho();
            }
        }


    }

    /**
    * Recorrido en postOrden Iteratico
    */
    public void postordenIterativo(){
        pila.Pila<Nodo> pila = new pila.Pila<>();
        Nodo aux = raiz;
        Nodo q = raiz;
        while (aux != null){
            //avanza por izquierda y apila los nodos
            while (aux.getIzquierdo() !=null){
                pila.apilar(aux);
                aux = aux.getIzquierdo();
            }
            while (aux !=null && (aux.getDerecho()==null || aux.getDerecho()==q)){
               visitar(aux);
               q = aux;
               if(pila.esVacia())
                  return;
               aux = pila.cima();
               pila.retirar();

            }
            pila.apilar(aux);
            aux = aux.getDerecho();
        }
    }
    


}