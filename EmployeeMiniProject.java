package MiniProject;
import java.util.*;

public class Employee {
	private int emp_id[] = {1001,1002,1003,1004,1005,1005,1007}; 
	private String emp_name[] = {"Ashish", "Sushma", "Rahul","Chahat","Ranjan","Suman","Thanmay" }; 
	private String joining_date[] = { "01/04/2009", "23/08/2012", "12/11/2008","29/01/2013","16/07/2005","1/1/2000","12,06,2006"}; 
	private char desig_code[] = { 'e', 'c', 'k','r','m'}; 
	private String dept[] = { "R&D", "PM", "Acct","Front Desk","Engg","Manufacturing","PM" }; 
	private int basic[] = { 20000, 30000, 10000,12000,50000,23000,29000}; 
	private int hra[] = { 8000, 12000, 8000,6000,20000,9000,12000}; 
	private int it[] = { 3000, 9000, 1000,2000,20000,4400,10000}; 
	public int calcDA(int id) {
		int index = getIndex(id);
		int da=0;
		switch (index) {
		case(0) :
			da=20000;
		    break;
		case(1) :
			da=32000;
		    break;
		case(2) :
			da=12000;
		    break;
		case(3) :
			da=15000;
		    break;
		case(4) :
			da=40000;
		    break;
		
		}
		return da;
  
    }
	public int getIndex(int id) {
		int index=0;
		for(int i=0;i<emp_id.length;i++) {
			if(id==emp_id[i]) {
				index = i;
				
			}
			return index;
			
		}
		return -1;
	}
	
	public int getSalary(int id) {
		
		int index = getIndex(id);
		return basic[index]+hra[index]+calcDA(id)-it[index];
	}
	public int getDesigCode(int id) {
		int index = getIndex(id);
		return desig_code[index];	
		
	}
	public String getName(int id) {
		return emp_name[getIndex(id)]; 
	}
	public String getDept(int id) {
		return dept[getIndex(id)];
	}
	public String getDesignation(int id) {
		 String x="";
		 int index=getIndex(id);
		 switch(index){
		 case 0:
			 x= "Engineer";
		     break;
	     case 1:
		   x="consultant";
		   break;
	     case 2:
			 x="clerk";
			 break;
		 case 3:
			 x="Receptionist";
			 break;
		 case 4:
			 x="Manager";
             break;
	   }
		 return x;
		 
         
	}
  
}
public class EmployeeMiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		Employee emp=new Employee();
		
		if(id>=1001 || id<=1007) {
			System.out.println("Emp No. "+id);
			System.out.println("Emp Name: "+emp.getName(id));
			System.out.println("Department: "+emp.getDept(id));
			System.out.println("Designation: "+emp.getDesignation(id));
			System.out.println("Salary: "+emp.getSalary(id));
			
			
		}
		else {
			System.out.println("No employee with given emp_id");
		}
		

	}

}


