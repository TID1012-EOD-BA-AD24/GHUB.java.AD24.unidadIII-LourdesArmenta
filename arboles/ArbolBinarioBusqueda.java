package arboles;

public class ArbolBinarioBusqueda extends ArbolBinario {
    public ArbolBinarioBusqueda(){
        super();

    }
    public ArbolBinarioBusqueda(Nodo raiz){
        super(raiz);
    }
    public void insertar(Object valor){
        Comparable dato = (Comparable) valor;
        Nodo nuevo = new Nodo();
        if (raiz == null)
           raiz = nuevo;
        else{
            //anterior: referencia al padre de aux
            Nodo anterior = null
            //aux: es un nodo auxiliar que va recorriendo los nodos,
            //desde la raiz
            Nodo aux = raiz;
            while (aux != null){
                //Aqui me queda
            }
        }




    }


    
}
