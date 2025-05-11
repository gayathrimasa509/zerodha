import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToOne
	private Author author;
	public Book() {}
	public Book(String name,Author author) {
		
		this.name=name;
		this.author=author;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Author getAuthor()
	{
		return author;
	}
}
