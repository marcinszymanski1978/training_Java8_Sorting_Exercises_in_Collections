public class Person {

    int wiek;
    Plec plec;

    public Person(int wiek, Plec plec) {
        this.wiek = wiek;
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Person{" +
                "wiek=" + wiek +
                ", plec=" + plec +
                '}';
    }
}
