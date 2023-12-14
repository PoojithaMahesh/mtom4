package manytoonem4.controller;

import manytoonem4.dao.CompanyDao;
import manytoonem4.dao.EmployeeDao;
import manytoonem4.dto.Company;
import manytoonem4.dto.Employee;

public class CompanyEmployeeCont {
public static void main(String[] args) {
	Company company=new Company();
	company.setName("TestYantra");
	company.setGst("tyss@!@#");
//	
	Employee employee1=new Employee();
	employee1.setName("aani");
	employee1.setAddress("Delhi");
//	
//	
//	Employee employee2=new Employee();
//	employee2.setId(2);
//	employee2.setName("govardan");
//	employee2.setAddress("Chennai");
//	employee2.setCompany(company);
//
//	
	CompanyDao  companyDao=new CompanyDao();
//	companyDao.saveCompany(company);
//	
//	
	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.saveEmployee(employee1);
//	employeeDao.saveEmployee(employee2);
	
	
	
//	companyDao.updateCompany(1, company);
//	employeeDao.updateEMployee(1, employee1);
	
	
//	companyDao.findCompany(1);
//	employeeDao.findEMployee(1);
	
	
//	companyDao.deleteCompany(1);
//	
	employeeDao.deleteEMployee(1);
	
	
	
	
}
}
