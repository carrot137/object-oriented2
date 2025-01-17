package sample;

public class Manager extends Employeepra {
    
    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    Manager(){}

    Manager(String department){
        this.department=department;
    }

}
