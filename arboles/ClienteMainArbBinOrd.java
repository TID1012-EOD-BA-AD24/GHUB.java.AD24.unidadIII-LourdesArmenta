package arboles;

public class ClienteMainArbBinOrd {
    public static void main(String[] args) {
        ArbolBinarioOrdenado ab = new ArbolBinarioOrdenado();
        Estudiante e1 = new Estudiante(123,"Juan Perez");
        Estudiante e2 = new Estudiante(101,"Margarita ruiz");
        Estudiante e3 = new Estudiante(100,"Pedro Sanchez");
        Estudiante e4 = new Estudiante(200,"Ana Beltran");
        try{
             ab.insertar(e1);
             ab.insertar(e2);
             ab.insertar(e3);
             ab.insertar(e4);
             System.out.println("\nRecorrido PreOrden");
             ab.preorden();
             System.out.println("\nRecorrido InOrden");
             ab.inorden();
             System.out.println("\nRecorrido PostOrden");
             ab.postorden();
             System.out.println();
             System.out.println("Arbol Jerarquico");
             BTreePrinter.printNode(ab.getRaiz());

        }catch(Exception ex){
            System.out.println("Error: ocurrio una excepcion"+ex.getMessage());
        }

    }
    
}
