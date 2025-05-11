package lmsproject;

import jakarta.persistence.EntityManager;

public class StudentDAO{
	
	//inserting
	public void save(StudentMember student) {
		
		EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(student);
		
		em.getTransaction().commit();
		
		em.close();
	
	}
	
	//findById
	public StudentMember findById(Long id) {
		
		EntityManager em=JPAUtil.getEntityManager();
		
		StudentMember student=em.find(StudentMember.class,id);
		
		em.close();
		
		return student;
	}
}