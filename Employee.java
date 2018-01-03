package corespring;

public class Employee {
  
	private int id;
	private String name;
	
	Employee(){
		System.out.println("Dummy const Emp");
	}
	Employee(int id){
		this.id=id;
	
	}
	Employee(String name){
		this.name=name;
	}
	Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	void show(){
		System.out.println(id+" "+name);
	}
	
}
