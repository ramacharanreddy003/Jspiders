class Employee{
    private int empid;
    private String empName;
    private double salary;

    public int getEmpid(){
        return empid;
    }
    public void setEmpid(int empid){
        this.empid=empid;
    }

    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }

    public double  getSalary(){
        return salary;
    }
    public void setSalary(double  salary){
        this.salary=salary;
    }
    
}
@SuppressWarnings("unused")
class EmployeeDet{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpid(101);
        emp.setEmpName("Charan");
        emp.setSalary(45000.0);
        System.out.println("Employee ID: "+emp.getEmpid());
        System.out.println("Employee Name: "+emp.getEmpName());
        System.out.println("Salary : "+emp.getSalary());
        System.out.println("------------------------");
        emp.setEmpid(102);
        emp.setEmpName("Ram");
        emp.setSalary(30000);
        System.out.println("Employee ID: "+emp.getEmpid());
        System.out.println("Employee Name: "+emp.getEmpName());
        System.out.println("Employee Salary: "+emp.getSalary());
         System.out.println("------------------------");
        emp.setEmpid(103);
        emp.setEmpName("Shyam");
        emp.setSalary(20000);
        System.out.println("Employee ID: "+emp.getEmpid());
        System.out.println("Employee Name: "+emp.getEmpName());
        System.out.println("Employee Salary: "+emp.getSalary());

    }
}