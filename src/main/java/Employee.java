public class Employee extends Person implements Comparable<Employee>{
    String firma;

    public Employee(int wiek, Plec plec, String firma) {
        super(wiek, plec);
        this.firma = firma;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firma='" + firma + '\'' +
                ", wiek=" + wiek +
                ", plec=" + plec +
                '}';
    }


    @Override
    public int compareTo(Employee employee) {
        return this.firma.compareTo(employee.firma);
    }
}
