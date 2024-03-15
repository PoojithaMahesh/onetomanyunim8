package onetomanyunim8.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanyunim8.dto.Company;
import onetomanyunim8.dto.Employee;

public class EmployeeDao {
public void saveEmployee(int companyId,Employee employee) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Company dbCompany=entityManager.find(Company.class, companyId);
	if(dbCompany!=null) {
//		that company id present
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
//		update the company details
		List<Employee> employees=dbCompany.getEmployees();
		employees.add(employee);
		dbCompany.setEmployees(employees);
		
		entityTransaction.commit();
	}else {
//		company is not present
		System.out.println("Sorry CompanyId is not present");
	}
}

public void updateEmployee(int id,Employee  employee) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Employee dbEmployee=entityManager.find(Employee.class, id);
	if(dbEmployee!=null) {
//		id is present so i can update the data
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		employee.setId(id);
		entityManager.merge(employee);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry iD is not present");
	}
}














}
