import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Generatore generatore = new Generatore();
        //creo l'hashset tramite la funzione
        Set<Integer> hashSetDiInt = generatore.generaHashSet();

        //leggo l'hashset tramite il foreach loop poiché non devo modificarlo
        for (Integer num : hashSetDiInt) {
            System.out.println(num);
        }

        //stampo la grandezza dell'hashset
        System.out.println(hashSetDiInt.size());

    }

}
