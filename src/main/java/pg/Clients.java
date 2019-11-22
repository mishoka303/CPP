package pg;
import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;

@Entity
@Table(name="\"Clients\"", schema = "PUBLIC")

public class Clients implements Serializable
{
    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"FirstName\"", nullable=false) private String fname;
    @Column(name = "\"MiddleName\"", nullable=false) private String mname;
    @Column(name = "\"LastName\"", nullable=false) private String lname;
    @Column(name = "\"CompanyName\"", nullable=false) private String cname;
    @Column(name = "\"VatNumber\"", nullable=false) private int vatnumber;
    @Column(name = "\"IsActive\"", nullable=false) private String isactive;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public String get_fname() {return fname;} public void set_fname(String fname) {this.fname=fname;}
    public String get_mname() {return mname;} public void set_mname(String mname) {this.mname=mname;}
    public String get_lname() {return lname;} public void set_lname(String lname) {this.lname=lname;}
    public String get_cname() {return cname;} public void set_cname(String cname) {this.cname=cname;}
    public int get_vatnumber() {return vatnumber;} public void set_vatnumber(int vatnumber) {this.vatnumber=vatnumber;}
    public String get_isactive() {return isactive;} public void set_isactive(String isactive) {this.isactive=isactive;}

}
