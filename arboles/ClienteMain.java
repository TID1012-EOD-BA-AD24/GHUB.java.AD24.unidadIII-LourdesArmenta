package arboles;

public class ClienteMain {
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        Nodo nodoA = new Nodo("A");
        Nodo nodoB = new Nodo("B");
        Nodo nodoC = new Nodo("C");
        Nodo nodoD = new Nodo("D");
        Nodo nodoE = new Nodo("E");
        Nodo nodoF = new Nodo("F");
        Nodo nodoG = new Nodo("G");
        ab.setRaiz(nodoA);
        ab.getRaiz().setIzquierdo(nodoB);
        ab.getRaiz().setDerecho(nodoC);
        nodoB.setIzquierdo(nodoD);
        nodoB.setDerecho(nodoE);
        nodoC.setIzquierdo(nodoF);
        nodoC.setDerecho(nodoG);
        //imprime los recorridos
        System.out.println("Preorden Recursivo");
        ab.preorden();
        System.out.println("\n Inorden Recursivo");
        ab.inorden();
        System.out.println("\n Postorden Recursivo");
        ab.postorden();
        System.out.println();


            
    }
  



}
