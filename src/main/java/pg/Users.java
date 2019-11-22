package pg;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"Users\"", schema = "PUBLIC")
public class Users implements Serializable
{
    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"FirstName\"", nullable=false) private String fname;
    @Column(name = "\"MiddleName\"", nullable=false) private String mname;
    @Column(name = "\"LastName\"", nullable=false) private String lname;
    @Column(name = "\"Username\"", nullable=false)  private String username;
    @Column(name = "\"Password\"", nullable=false)  private String password;
    @Column(name = "\"RoleID\"", nullable=false) private int roleid;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public String get_fname() {return fname;} public void set_fname(String fname) {this.fname=fname;}
    public String get_mname() {return mname;} public void set_mname(String mname) {this.mname=mname;}
    public String get_lname() {return lname;} public void set_lname(String lname) {this.lname=lname;}
    public String get_username() {return username;} public void set_username(String username) {this.username=username;}
    public String get_password() {return password;} public void set_password(String password) {this.password=password;}
    public int get_roleid() {return roleid;} public void set_roleid(int roleid) {this.roleid=roleid;}

}

