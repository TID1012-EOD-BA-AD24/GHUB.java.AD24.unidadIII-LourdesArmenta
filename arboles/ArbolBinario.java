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
    
    



}