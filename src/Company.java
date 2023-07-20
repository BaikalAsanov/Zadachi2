public class Company {
    private String companyName;
    private Employee[] employees;

    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "{ "+"Company name: "+companyName+", "+
                "First employee:"+employees[0]+", "+
                "Average employee: "+employees[employees.length/2]+", "+
                "Last employee: "+employees[employees.length-1];
    }
}
