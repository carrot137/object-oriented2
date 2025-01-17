package sample;

public class MainMedal {
    public static void main(String[] args) {

    Employee[] employees=new Employee[3];
    employees[0].setName("山田");
    employees[0].setSalary(200000);
    employees[1].setName("海田");
    employees[1].setSalary(220000);
    employees[2].setName("川田");
    employees[2].setSalary(240000);


    
    Material[] materials=new Material[4];
    materials[0].setName("金");
    materials[0].setCost(10000);
    materials[1].setName("銀");
    materials[1].setCost(5000);
    materials[2].setName("銅");
    materials[2].setCost(1000);
    materials[3].setName("木");
    materials[3].setCost(500);


    Medal[] medal=new Medal[3];
    medal[0].setName("金メダル");
    medal[1].setName("銀メダル");
    medal[2].setName("銅メダル");
    }


 

}
