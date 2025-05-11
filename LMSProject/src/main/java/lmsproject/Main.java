package lmsproject;

public class Main {
	public static void main(String args[]) {
		BookDAO bookdao=new BookDAO();
		StudentDAO studentdao=new StudentDAO();
		LibraryService ls=new LibraryService();
		
		Books book=new Books("Harry Potter",10,null);
		bookdao.save(book);
		Books book1=new Books("Harry",20,null);
		bookdao.save(book1);
		
		StudentMember st=new StudentMember("John Doe","CSE");
		studentdao.save(st);
		
		ls.borrowBook (book.getId(),st.getId());
		
		Books rb=bookdao.findById(book.getId());
		
		System.out.println(rb.getQuantity());
		
		//updating the quantity
		book.setQuantity(15);
		
		bookdao.update(book);
		
		System.out.println(book.getQuantity());
		
		//deleting
		bookdao.delete(20);
		
        System.out.println("Book deleted successfully!");

	}
}
