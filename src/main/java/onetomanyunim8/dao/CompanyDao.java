package onetomanyunim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanyunim8.dto.Company;

public class CompanyDao {

	public void saveCompany(Company company) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityTransaction.commit();
	}
	
	public void updateCompany(int id,Company company) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Company dbCompany=entityManager.find(Company.class, id);
		if(dbCompany!=null) {
//			id is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			company.setId(id);
//			id,name,gst
			company.setEmployees(dbCompany.getEmployees());
			entityManager.merge(company);
			entityTransaction.commit();
		}else {
			System.out.println("Id is not present");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
