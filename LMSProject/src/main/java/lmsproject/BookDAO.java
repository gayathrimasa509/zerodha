package lmsproject;

import jakarta.persistence.EntityManager;

public class BookDAO{
	
	//inserting
	public void save(Books book) {
		
		EntityManager em=JPAUtil.getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(book);
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	//findById
		public Books findById(Long id) {
			
			EntityManager em=JPAUtil.getEntityManager();
			
			Books book=em.find(Books.class,id);
			
			em.close();
			
			return book;
		}
		
		
		 // Updating
	    public void update(Books book) {
	        
	    	EntityManager em = JPAUtil.getEntityManager();
	        
	    	em.getTransaction().begin();
	        
	    	em.merge(book); // Merging changes into the persistence context
	        
	    	em.getTransaction().commit();
	        
	    	em.close();
	    }
	    
	    
	    //deleting
	    public void delete(int quantity) {
	       
	    	EntityManager em = JPAUtil.getEntityManager();
	        
	    	em.getTransaction().begin();
	        
	    	Books book = em.find(Books.class, quantity);
	        
	    	if (book != null) {
	        
	    		em.remove(book);
	        }
	    	
	        em.getTransaction().commit();
	        
	        em.close();
	    }
}