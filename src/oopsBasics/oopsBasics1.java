package oopsBasics;
class employeeData{
    int id;
    String name;
    int salary;
	 employeeData(){
	     System.out.println("new employeeData obj is created");
	 }
    void storeData(int id,int salary,String name){
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    void showDetails(){
        System.out.println("id: \t"+id);
        System.out.println("name: \t"+name);
        System.out.println("salary: \t"+salary);
    }
}
class RDemployee extends employeeData{
	String typeOfJob;
	String accountNum;
	void storeData(int id,int salary,String name,String typeOfJob,String accountNum){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.typeOfJob = typeOfJob;
        this.accountNum = accountNum;
    }
	void showDetails(){
        System.out.println("id: \t"+id);
        System.out.println("name: \t"+name);
        System.out.println("salary: \t"+salary);
        System.out.println("type of job: \t"+typeOfJob);
        System.out.println("account number: \t"+accountNum);
    }
}
public class oopsBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employeeData emp1 = new employeeData();
		emp1.storeData(1001, 25000, "aniket");
		emp1.showDetails();
		RDemployee emp2 = new RDemployee();
		//emp2.storeData(id, salary, name);
		emp2.storeData(1002, 35000, "pulak", "Netflix and Chill", "001234006767");
		emp2.showDetails();

	}

}
