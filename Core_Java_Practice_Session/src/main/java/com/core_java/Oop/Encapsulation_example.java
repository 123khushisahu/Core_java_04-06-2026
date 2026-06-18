package com.core_java.Oop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Encapsulation_example {
	
	private static final Logger LOG =LoggerFactory.getLogger(Encapsulation_example.class);
	
	
	
	
	
	
	
   //	LOGGER.trace("Trace Message!");
//    LOGGER.debug("Debug Message!");
//    LOGGER.info("Info Message!");
//    LOGGER.warn("Warn Message!");
//    LOGGER.error("Error Message!");
//    LOGGER.fatal("Fatal Message!");
	
	
	
	protected int empId;
	private String name;
	private String email;
	private String address;
	
/*  | Access Modifier       | Same Class | Same Package | Subclass (Other Package) | Other Package |
	| --------------------- | ---------- | ------------ | ------------------------ | ------------- |
	| private               | Yes        | No           | No                       | No            |
	| default (no modifier) | Yes        | Yes          | No                       | No            |
	| protected             | Yes        | Yes          | Yes                      | No            |
	| public                | Yes        | Yes          | Yes                      | Yes           |

	
	*/
	
	
	 // Getter Methods
    protected int GETKHUSHI() {
    	System.out.println("hii");
        return empId;
    }
    
    
    // Setter Methods
    protected void SETKHUSHIASDFJ(int empId) {
        this.empId = empId;
    }
	
	
	
	
    public double calculateSalary(double basicSalary) {
        LOG.trace("Method Started");

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;

        System.out.println("khushi HRA :"+hra);
        LOG.info("khushi HRA : {}",+ hra);
        LOG.info("KHUSHI DA : {}", +da);

        return basicSalary + hra + da;
    }
	
	public static void main(String[] args) {
		Encapsulation_example obj=new Encapsulation_example();
		obj.GETKHUSHI();
		
		obj.calculateSalary(1000);
		
		
		/*
		 * Definion Binding of data methods corresponing methods in single unit known as
		 * encapsulation.
		 * 
		 * example : Getter and setters methods
		 * 
		 * Encapsulation Definition (Interview Level)

          Encapsulation is the process of binding data (variables) and methods
           (functions) into a single unit (class) and restricting direct access to 
           the data by making variables private and providing public getter/setter methods.

          
           Simple Definition

           Encapsulation means "data hiding" and providing controlled access to data through methods.
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		

	}


	protected int getEmpId() {
		return empId;
	}


	protected void setEmpId(int empId) {
		this.empId = empId;
	}


	private String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	private String getEmail() {
		return email;
	}


	private void setEmail(String email) {
		this.email = email;
	}


	private String getAddress() {
		return address;
	}


	private void setAddress(String address) {
		this.address = address;
	}

}
