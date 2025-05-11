import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(
	    name = "User.findByEmail",
	    query = "SELECT u FROM User u WHERE u.email = :email"
	)	
@NamedNativeQuery(name="User.findByStatus",query="select * from user where status=?",resultClass=User.class)
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String status;
	public User() {}
	public User(String name,String email,String status)
	{
		this.name=name;
		this.email=email;
		this.status=status;
	}
	public String getName() {return name;}
	public int getId() {return id;}
	public String getEmail() {return email;}
	public String getStatus() {return status;}
	
	
}
