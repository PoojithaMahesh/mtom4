package manytoonem4.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytoonem4.dto.Employee;

public class EmployeeDao {
	
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();	
	}
	public void saveEmployee(Employee employee) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
	}
	
	public void updateEMployee(int id,Employee employee) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		
		if(dbEmployee!=null) {
//			that employee is present then i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			employee.setId(id);
			employee.setCompany(dbEmployee.getCompany());
			
			entityManager.merge(employee);
			entityTransaction.commit();
		}else {
//			that employee is not present
			System.out.println("Sorry employeeId is not present");
		}
	}
	
	public void findEMployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		
		if(dbEmployee!=null) {
//			that employee is present then i can fetch the data
			System.out.println(dbEmployee);
		}else {
//			that employee is not present
			System.out.println("Sorry employeeId is not present");
		}
	}
	
	public void deleteEMployee(int id) {
		EntityManager entityManager=getEntityManager();
		Employee dbEmployee=entityManager.find(Employee.class, id);
		
		if(dbEmployee!=null) {
//			that employee is present then i can delete the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbEmployee);
			entityTransaction.commit();
		}else {
//			that employee is not present
			System.out.println("Sorry employeeId is not present");
		}
	}
	
}
