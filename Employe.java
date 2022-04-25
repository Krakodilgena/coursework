public class Employe {
    private final int id;
    private final String firstName;
    private final String lastName;
    private double salary;
    private int departmentId;

    private static int nextId;

    public Employe(String firstName, String lastName, double salary, int departmentId) {
        this.id = ++nextId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentId = departmentId;

    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Employe employe = (Employe) object;
        return id == employe.id && java.lang.Double.compare(employe.salary, salary) == 0
                && departmentId == employe.departmentId
                && java.util.Objects.equals(firstName, employe.firstName)
                && java.util.Objects.equals(lastName, employe.lastName);
    }

    public int hashCode() {
        return Objects.hash(id, firstName, lastName, salary, departmentId);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employe{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", departmentId=" + departmentId +
                '}';
    }
}
