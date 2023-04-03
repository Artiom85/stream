import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Emploee>emploees = new ArrayList<>();
        emploees.add(new Emploee("Andrei",23,"Cleaner",false));
        emploees.add(new Emploee("Eugen",22,"Manager",true));
        emploees.add(new Emploee("Ana",29,"Manager",true));
        //emploees.add(new Emploee("Victor",33,"Softwar",true));
        emploees.add(new Emploee("Hana",23,"Manager",false));
        emploees.add(new Emploee("Victoria",43,"Softwar",false));
        emploees.add(new Emploee("Vova",43,"Manager",false));
        emploees.add(new Emploee("Anton",33,"Manager",false));

        emploees.add(new Emploee("Eugenia",32,"Manager",false));
        emploees.add(new Emploee("Eugen",32,"Manager",true));
        emploees.add(new Emploee("Victor",34,"Softwar",true));
        emploees.add(new Emploee("Eugen",22,"Manager",true));

      // List<Emploee> xemploee = emploees.stream().map((Emploee s) ->).collect();

//        List<Emploee> emp = emploees.stream()
//                .filter(e -> e.isPayedPerHours ())
//                .filter(e -> e.getAge()>25)
//                .filter(e -> e.getDepartment().equals("Manager"))
//                .distinct()
//                .limit(5)
//                .collect(Collectors.toList());

             //   emp.forEach(System.out::println);

//                List<String> empt = emploees.stream()
//                        .filter(s -> s.getAge()>30)
//                        .filter(s -> !s.isPayedPerHours())
//                        .map(Emploee::getName )
//                        .sorted()
//                        .collect(Collectors.toList());
//
//        System.out.println( "nume dupa ordinea alfabetica: "+empt);
//
//
       Optional<Emploee> optEmp = emploees.stream()
                .filter(x -> x.getDepartment().equals("Softwar"))
                .filter(Emploee::conduceInterviuri)
                .filter(Emploee::conduceTrainig)
                .findFirst();



        System.out.println(optEmp);



        //System.out.println(emploees);
    }

}