package lmsproject;

import jakarta.persistence.EntityManager;

public class LibraryService {
	
	//borrowing logic
	public void borrowBook(Long bookid,Long studentid) {
		EntityManager em=JPAUtil.getEntityManager();
	
	    em.getTransaction().begin();
	    //check whether book is present
	    
	    Books b=em.find(Books.class,bookid);
	    
	    if(b.getQuantity() > 0) {
	    	
	    	b.reduceQuantity();
	  
	        StudentMember st=em.find(StudentMember.class, studentid);
	  
	        st.addBook(b);
	  
	        em.getTransaction().commit();
	  
	        em.close();

	    }
	    else {
	    	System.out.println("Book is not available");
	    }

	}

}
