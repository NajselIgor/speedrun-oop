import java.util.*;

public class Main {
    public static void main(String args[]) {
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
        List<Zviera> zvery = new ArrayList<>(List.of(new Pes("bruno"), new Macka("pica")));

        //prida do pola iba raz, ak uz prvok obsahuje ten co chceme pridat, tak ho uz neprida
        Set<String> afta = new HashSet<>();
        afta.add("skoda");
        afta.add("vw");
        afta.add("seat");
        afta.add("skoda");
        afta.add("seat");
        afta.add("bmw");
        afta.add("volvo");

        System.out.println(afta);
        System.out.println(afta.size());

        if (afta.contains("skoda")) {
            afta.remove("skoda");
        }
        List<String> afta2 = new ArrayList<>(List.of("volvo","BMW"));
        System.out.println(afta);

        //vymaze tie prvky, ktore posielam ako pole
        afta.removeAll(afta2);
        System.out.println(afta);

        afta.clear();




    }

    private static void kontrola(Zviera zver) throws NotPesExeption, NotMackaExeption {
        if (zver instanceof Pes) {
            throw new NotMackaExeption("Kokot sak to neni macka");
        } else {
            throw new NotPesExeption("kokot sak to neni pes");
        }
    }
}
