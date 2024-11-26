package arboles;
import java.util.Iterator;
import java.util.TreeSet;//se utiliza para implementar un arbol binario de busqueda



public class ClienteMainClaseTree {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        if (t.isEmpty())
            System.out.println("El arbol esta vacio");

        t.add(5);
        t.add(3);
        t.add(9);
        t.add(2);

        System.out.println(t.contains(5));
        System.out.println(t.contains(12));
        System.out.println();
        t.remove(5);
        System.out.println(t.contains(5));
        t.add(1);
        t.add(6);
        t.add(6);
        System.out.println("El arbol t tiene "+t.size()+" elementos");

        for(Iterator<Integer> it = t.iterator(); it.hasNext(); ){
            System.out.println(it.next());
        }

        TreeSet<Persona> t1 = new TreeSet<>();

        t1.add(new Persona(5,"Lourdes"));
        t1.add(new Persona(2,"Juan"));
        t1.add(new Persona(4,"Laura"));

        for(Iterator<Persona> it = t1.iterator(); it.hasNext(); ){
            System.out.println(it.next());
        }


        

        
    }
    
}
