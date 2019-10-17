import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)  {

        Employee pracownik1 = new Employee(40,Plec.M,"GBC");
        Employee pracownik2 = new Employee(38,Plec.K,"FED");
        Employee pracownik3 = new Employee(27,Plec.K,"DAB");
        Employee pracownik4 = new Employee(55,Plec.M,"Google");
        Employee pracownik5 = new Employee(46,Plec.K,"IBM");

        List<Employee> lista =Arrays.asList(pracownik1,pracownik2,pracownik3,pracownik4,pracownik5);

        System.out.println(lista+"\n");
//        Collections.sort(lista);
//        System.out.println(lista);
        System.out.println("Wiek: ");
        lista.stream().sorted(Comparator.comparing(Person::getWiek)).forEach(f-> System.out.println(f));
        System.out.println("\nPlec:");
        lista.stream().sorted(Comparator.comparing(Person::getPlec)).forEach(System.out::println);
        System.out.println("\nFirma: ");
        lista.stream().sorted(Comparator.comparing(Employee::getFirma)).forEach(System.out::println);
        System.out.println("\nFirma ");
        lista.stream().sorted().map(Employee::getFirma).forEachOrdered(System.out::println);



        TreeMap<Integer,Employee> mapa = new TreeMap<>();

        lista.stream().forEachOrdered(f-> mapa.put((lista.indexOf(f)),f));
        System.out.println("\nMapTree: \n"+mapa);
        System.out.println();
        mapa.entrySet().forEach(f->{
            System.out.println(f.getValue().getFirma());});

       List nowa_lista = mapa.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getFirma))).collect(Collectors.toList());
        Map <Integer,Employee> nowa_mapa = mapa.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getFirma))).collect(Collectors.toMap(Map.Entry::getKey
        , Map.Entry::getValue, (e1,e2)-> e1,LinkedHashMap::new));
        System.out.println("\nLista.sorted z Mapy:\n"+nowa_lista);
        System.out.println("\nMapa.sorted z Mapy:\n"+nowa_mapa);



        Collections.sort(lista);
        System.out.println("\nCollection.sort.list:\n"+lista);






    }



}
