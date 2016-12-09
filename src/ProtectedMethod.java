import java.util.*; //import main java package

class Employee { //created class employee
	
	//declaring private variable
	private String eId;               //variable for employee id
	private String eName;			//variable for employee name
	private int eSal;			// var for employee salary
	private String eDOJ;		//for date of joining
	private String eDesg;		//for employee desiganaiton in the organization
	
	
	public void setEId(String neweId){   
		eId = neweId;
	}
	public String getEId(){
		return eId;
	}
	
	
	public void setEName(String neweName){
		eName = neweName;
	}
	public String getEName(){
		return eName;
	}
	public void setESal(int neweSal){
		eSal = neweSal;
	}
	public int getESal(){
		return eSal;
	}
	public void setEDOJ(String neweDOJ){
		eDOJ = neweDOJ;
	}
	public String getEDOJ(){
		return eDOJ;
	}
	public void setEDesg(String neweDesg){
		eDesg = neweDesg;
	}
	public String getEDesg(){
		return eDesg;
	}
}


//new class to take user detail
class Session4_Assignment1{
	public static void main(String args []){
		Employee emp = new Employee();
		String id, name, doj,desg;
		int sal;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter of Employee Details:");     //Just For Heading
		
		System.out.print("\nEnter of Employee Id : ");  //Asking Employee id
		id=sc.nextLine();								//here user input employee id
		System.out.print("Enter of Employee Name : ");  //asking employee name
		name=sc.nextLine();								//here user input employee name
		System.out.print("Enter of Employee Date of Joining(DD-M-YYYY) : ");   	//asking employee date of joining
		doj=sc.nextLine();							//here user input employee date of joining
		System.out.print("Enter of Employee Designation : "); //asking employee designation in organization
		desg=sc.nextLine();											//here user input employee designation
		System.out.print("Enter of Employee Salary : ");  //asking employee salary
		sal=sc.nextInt();									//here user input employee salary
		
		emp.setEId(id);
		emp.setEName(name);
		emp.setESal(sal);
		emp.setEDOJ(doj);
		emp.setEDesg(desg);
		
		//below we printing the output  \n we used here for new line
		System.out.println("\n\nDetails of Employee:\n"
							+"\nEmployee Id : "+emp.getEId()
							+"\nEmployee Name : "+emp.getEName()
							+"\nEmployee Date of Joining : "+emp.getEDOJ()
							+"\nEmployee Designation : "+emp.getEDesg());
	}
}
