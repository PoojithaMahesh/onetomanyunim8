package onetomanyunim8.controller;

import onetomanyunim8.dao.CompanyDao;
import onetomanyunim8.dao.EmployeeDao;
import onetomanyunim8.dto.Company;
import onetomanyunim8.dto.Employee;

public class CompEmpController {
public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(1);
//	company.setName("TYSS");
//	company.setGst("TYSS@!@#");
//	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.saveCompany(company);
	
//	Employee employee=new Employee();
//	employee.setId(1);
//	employee.setName("Kazi");
//	employee.setAddress("Pune");
//	
//	
//	EmployeeDao dao=new EmployeeDao();
//	dao.saveEmployee(1, employee);
	
//	UPDATE
//	Employee employee=new Employee();
//	employee.setName("KaziR");
//	employee.setAddress("Bangalore");
//	
//	EmployeeDao dao=new EmployeeDao();
//	dao.updateEmployee(1, employee);
//	
	
	Company company=new Company();
	company.setName("TYSS");
	company.setGst("TYSS@!@#");
  
	
	CompanyDao companyDao=new CompanyDao();
	companyDao.updateCompany(1, company);
	
	
	
	
	
}
}
