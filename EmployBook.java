public class EmployBook {

    private static final Employe[] employes = new Employe[10];

    public static void main(String[] args) {
        employes[0] = new Employe("Dima", "Andreev", salary 100_000, departmentId 1);
        System.out.println(calculateTotalSalary());
    }

    public static void printEmployes() {
        for (Employe employe : employes) {
            if (employe != null) {
                System.out.println(employe);
            }
        }
    }

    public static double calculateTotalSalary() {
        double result = 0;

        for (Employe employe : employes) {
            if (employe != null) {
                result += employe.getSalary();
            }
        }

        return result;
    }

    public static Employe findEmployeWithMinSalary() {
        Employe result = null;

        for (Employe employe : employes) {
            if (employe != null) {
                if (result == null || employe.getSalary() < result.getSalary()) {
                    result = employe;
                }
            }
        }

        return result;
    }

    public static Employe findEmployeWithMaxSalary() {
        Employe result = null;

        for (Employe employe : employes) {
            if (employe != null) {
                if (result == null || employe.getSalary() > result.getSalary()) {
                    result = employe;
                }
            }
        }

        return result;
    }

    public static double calculateAvgSalary() {
        int count = 0;

        for (Employe employee : employes) {
            if (employee != null) {
                count++;
            }
        }

        return calculateTotalSalary() / count;
    }

    public static void printNames() {
        for (Employe employe : employes) {
            if (employe != null) {
                System.out.println(employe.getFullName());
            }
        }
    }
}