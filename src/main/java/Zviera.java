public abstract class Zviera {
   public String nazov;

    public Zviera(String nazov) {
        this.nazov = nazov;
    }


    public void akcia(){}


    public String toString() {
        return this.nazov;
    }

    public String getNazov() {
        return nazov;
    }
}
