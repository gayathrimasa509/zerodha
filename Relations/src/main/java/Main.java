import jakarta.persistence.EntityManager;
                          
import java.util.List;
public class Main {
    public static void main(String args[])
    {
//        EntityManager em=JPAUtil.getEntityManager();
//        em.getTransaction().begin();
//        
//        Author a1=new Author("Navaneeth");
//        Author a2=new Author("Chandra");
//        Author a3=new Author("Damu");
//        em.persist(a1);
//        em.persist(a2);
//
//        em.persist(a3);
//        Book b1=new Book("DSA",a1);
//        Book b2=new Book("C",a2);
//        Book b3=new Book("cpp",a2);
//        em.persist(b1);
//        em.persist(b2);
//        em.persist(b3);
//        
//        Book fetchedBook = em.find(Book.class,b2.getId());
//        System.out.println("Book: " + fetchedBook.getName());
//        System.out.println("Accessing Author...");
//        System.out.println(fetchedBook.getAuthor().getName());
//        em.getTransaction().commit();
//        em.close();
//        JPAUtil.close();
    	
    	EntityManager em=JPAUtil.getEntityManager();
    	em.getTransaction().begin();
    	
    	em.persist(new User("Navaneeth","navi@gmail.com","verified"));
    	em.persist(new User("Chandra","chandra@gmail.com","unverified"));
    	em.persist(new User("Damu","damu@gmail.com","verified"));
    	
    	em.getTransaction().commit();
    	
    	
//    	List<User> users=em.createQuery("select u from User u where name=:name",User.class).setParameter("name","Navaneeth").getResultList();
//    	
//    	for(User u:users)
//    	{
//    		System.out.println("Name: "+u.getName()+"\n Email: "+u.getEmail()+"\n Status: "+u.getStatus());
//    	}
    	
//    	List<User> users1=em.createNamedQuery("User.findByEmail",User.class).setParameter("email", "chandra@gmail.com").getResultList();
//
//    	for(User u:users1)
//    	{
//    		System.out.println(u.getEmail());
//    	}
    	
    	List<User> users=em.createNamedQuery("User.findByStatus",User.class).setParameter(1,"verified").getResultList();
    	for(User u:users)
    	{
    		System.out.println(u.getName());
    	}
    	
    	em.close();
    	JPAUtil.close();
       
    }
}
