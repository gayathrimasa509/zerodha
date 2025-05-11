import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToMany(mappedBy="author")
	private List<Book> books=new ArrayList<>();
	public Author(){}
	public Author(String name) {
		
		this.name = name;
		
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
}
