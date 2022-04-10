import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        Map<String, String> hlavneMesta = new HashMap<>();

        hlavneMesta.put("Slovensko", "Bratislava");
        hlavneMesta.put("Cesko", "Praha");
        hlavneMesta.put("Polsko", "Varsava");
        hlavneMesta.put("Madarsko", "Budapest");

        System.out.println(hlavneMesta.size());
        if(hlavneMesta.containsKey("Slovensko")){
            System.out.println(hlavneMesta.get("Slovensko"));
            hlavneMesta.remove("Slovensko");
        }

        for(String kluc : hlavneMesta.keySet()) {
            System.out.println(kluc);
            System.out.println(hlavneMesta.get(kluc));
        }
        System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUU");
        for(String hodnota : hlavneMesta.values()) {
            System.out.println(hodnota);
        }

        System.out.println(hlavneMesta.get("Slovensko"));

        hlavneMesta.clear();
        System.out.println(hlavneMesta);
    }

    private static void kontrola(Zviera zver) throws NotPesExeption, NotMackaExeption {
        if (zver instanceof Pes) {
            throw new NotMackaExeption("Kokot sak to neni macka");
        } else {
            throw new NotPesExeption("kokot sak to neni pes");
        }
    }
}
