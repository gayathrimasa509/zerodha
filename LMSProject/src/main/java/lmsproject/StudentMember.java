package lmsproject;

import java.util.ArrayList;
import java.util.List;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
 
 
@Entity
public class StudentMember {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
 
    private String name;
    private String branch;
    
    @ManyToMany
    /*@JoinTable(
        name = "student_books",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "book_id")
    )*/

 
    private List<Books> borrowedBooks = new ArrayList<>();
 
    public StudentMember() {}
 
    
 
      // Getters and Setters
   public StudentMember(String name, String branch) {
		super();
		this.name = name;
		this.branch = branch;
	}



	public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
 
    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
 
    public List<Books> getBorrowedBooks() { return borrowedBooks; }
    public void addBook(Books book) { borrowedBooks.add(book); }
    public void removeBook(Books book) { borrowedBooks.remove(book); }
 
}

