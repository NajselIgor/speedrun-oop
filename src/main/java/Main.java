import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Zviera> zvery = new ArrayList<>();

        zvery.add(new Pes("bruno"));
        zvery.add(new Macka("pica"));

        for (Zviera zver: zvery) {
            System.out.println("pred");
            try {
                System.out.println("pred try");
                kontrola(zver);
                System.out.println("po try");
            } catch (NotPesExeption e) {
                System.out.println("catch");
                System.out.println(e.getMessage());
            } catch (NotMackaExeption e) {
                System.out.println("catch");
                System.out.println(e.getMessage());
            } finally {
                System.out.println("finaly");
            }

            System.out.println("po");
            System.out.println("===========");
        }
    }

    private static void kontrola(Zviera zver) throws NotPesExeption, NotMackaExeption {
        if (zver instanceof Pes) {
            throw new NotMackaExeption("Kokot sak to neni macka");
        } else {
            throw new NotPesExeption("kokot sak to neni pes");
        }
    }
}
