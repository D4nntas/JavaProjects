package entities;

public class Employee {
    public String nome;
    public Double grossSalary;
    public double Tax;

    public double netSalary(){
        return grossSalary - Tax;
    };

    public void increaseSalary(Double percentage){
        percentage =  ((percentage/100)*grossSalary);
        grossSalary += percentage; 

    }

    public String toString() {
        return 
                "Employee "
                + nome
                + ", $ "
                + String.format("%.2f", netSalary());

    }
}
