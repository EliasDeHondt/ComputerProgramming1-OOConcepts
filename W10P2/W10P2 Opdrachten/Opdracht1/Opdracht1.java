import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Van Elias De Hondt
 * 5/12/2022
 */
public class Opdracht1 {
    // Attributen
    // Constructors
    // Methode
    public class Opdracht1_ArrayList {
        /*
        ● Maak een ArrayList namen en voeg er 5 voornamen
        aan toe: Albert, Hendrik, Jozefien, Annabel,
        Adelbert
        ● Druk de eerste en de laatste naam af.
        ● Druk de namen af met een for-each lus.
        ● Gebruik contains om te controleren of "Joske"
        aanwezig is.
        ● Verwijder alle namen die met een 'A' beginnen;
        gebruik geen for-each, wel een Iterator!
        Waarom?
        ● Druk alle namen af met behulp van een gewone
        for lus. Gebruik ook eens de toString-methode
        van ArrayList.
        */
        public static void main(String[] args) {
            List<String> myList = new ArrayList<>();
            myList.add("Albert");
            myList.add("Hendrik");
            myList.add("Jozefien");
            myList.add("Annabel");
            myList.add("Adelbert");

            System.out.println("eerste naam: " + myList.get(0));
            System.out.println("laatste naam: " + myList.get(myList.size()-1));

            System.out.println("druk alle elementen met een for-each lus: ");
            for (String element : myList) {
                System.out.println(element);
            }

            System.out.println("controleren of \"Joske\" in de list is: " + myList.contains("Joske"));

            System.out.println("verwijder alle namen die met een 'A' beginnen:");
//        for (int i = 0; i < myList.size();i++) {
//            if(myList.get(i).startsWith("A")){ //if(myList.get(i).charAt(0) == 'A'){
//                myList.remove(i);
//
//            } //else i++; //opl ipv in de for i++ te doen
//        }
            System.out.println(myList);

            for (Iterator<String> it = myList.iterator(); it.hasNext();) {
                if(it.next().startsWith("A")){
                    it.remove();
                }
            }

            for (int i = 0; i < myList.size(); i++) {
                System.out.println(myList.get(i));
            }

//        for lussen met een arrayList:
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
//        for (String element : myList) {
//            System.out.println(element);
//        }
//        for (Iterator<String> it = myList.iterator();
//             it.hasNext();) {
//            System.out.println(it.next());
//        }


            //van array naar arraylist: (2 manieren: manueel en functie)
            String[] myArray = {"Alfa", "Bravo",
                    "Charlie", "Delta"};
            List<String> list = new ArrayList<>();
            for (String name : myArray) {
                list.add(name);
            }
            System.out.println(list);

            List<String> list2 = Arrays.asList(myArray); //enkel read-only
            System.out.println(list2);

            //van arrayList naar array:
            String[] myArray2 = list.toArray(new String[0]);
            for (String woord : myArray) {
                System.out.print(woord + " ");
            }
        }
    }
}
