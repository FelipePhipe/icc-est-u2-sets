import java.util.Set;

import controllers.ContactoController;
import controllers.Sets;

public class App {
    public static void main(String[] args) throws Exception {
        Sets sets = new Sets();

        System.out.println("Felipe Parra");
       /* runHashSet(sets);
        System.out.println();
        runLinkedHashSet(sets);
        System.out.println();
        runTreeSet(sets);
        System.out.println();
        runTreeSetConComparador(sets);
        System.out.println();
        runTreeSetConComparador2(sets);*/

        ContactoController c = new ContactoController();
        

    }
    public static void runHashSet(Sets sets){
        Set <String> palabras= sets.construirHashSet();
        System.out.println("---HashSet---");

        for (String p: palabras){
            System.out.println(p);
        }
        
    }

    public static void runLinkedHashSet(Sets sets){
        Set <String> palabras= sets.construirLinkedHashSet();
        System.out.println("---LinkedHashSet---");

        for(String p: palabras){
            System.out.println(p);
        }

    }

    public static void runTreeSet(Sets sets){
        Set<String> palabras= sets.construirTreeSet();
        System.out.println("---TreeSet---");

        for(String p: palabras){
            System.out.println(p);
        }
    }

    public static void runTreeSetConComparador(Sets sets){
        Set<String> palabras= sets.construirTreeSetConComparador();
        System.out.println("---TreeSetComparator---");

        for(String p: palabras){
            System.out.println(p);
        }
    }
    public static void runTreeSetConComparador2(Sets sets){
        Set<String> palabras= sets.construirTreeSetConComparador2();
        System.out.println("---TreeSetComparator2---");

        for(String p: palabras){
            System.out.println(p);
        }
    }
    
}
