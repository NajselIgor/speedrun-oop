import java.util.*;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Zviera> zvery = new ArrayList<>();
//
//        zvery.add(new Pes("bruno"));
//        zvery.add(new Macka("pica"));
//
//        for (Zviera zver: zvery) {
//            System.out.println("pred");
//            try {
//                System.out.println("pred try");
//                kontrola(zver);
//                System.out.println("po try");
//            } catch (NotPesExeption e) {
//                System.out.println("catch");
//                System.out.println(e.getMessage());
//            } catch (NotMackaExeption e) {
//                System.out.println("catch");
//                System.out.println(e.getMessage());
//            } finally {
//                System.out.println("finaly");
//            }
//
//            System.out.println("po");
//            System.out.println("===========");
//        }
        List<Zviera> zvery = new ArrayList<>(List.of(new Pes("bruno"), new Macka("pica"), new Pes("laky"),
                new Macka("kokot")));

        System.out.println(zvery);

        zvery.sort(new ZvieraComparator());
        System.out.println(zvery);

        zvery.sort((o1, o2) -> -o1.nazov.compareTo(o2.nazov));
        System.out.println(zvery);

        zvery.sort(Comparator.comparing(Zviera::getNazov));
        System.out.println(zvery);
    }

    private static void kontrola(Zviera zver) throws NotPesExeption, NotMackaExeption {
        if (zver instanceof Pes) {
            throw new NotMackaExeption("Kokot sak to neni macka");
        } else {
            throw new NotPesExeption("kokot sak to neni pes");
        }
    }
}
