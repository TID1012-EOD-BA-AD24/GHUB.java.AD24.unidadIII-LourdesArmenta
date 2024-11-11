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
    
    



}