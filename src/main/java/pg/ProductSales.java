package pg;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="\"ProductSales\"", schema = "PUBLIC")
public class ProductSales implements Serializable
{

    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Price\"", nullable=false) private double price;
    @Column(name = "\"ProductID\"", nullable=false) private int productid;
    @Column(name = "\"Quantity\"", nullable=false) private int quantity;
    @Column(name = "\"CreatedByID\"", nullable=false) private int cbid;
    @Column(name = "\"CreatedAt\"", nullable=false) private String createdat;
    @Column(name = "\"SaleID\"", nullable=false) private int saleid;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public double get_price() {return price;} public void set_price(double price) {this.price=price;}
    public int get_productid() {return productid;} public void set_productid(int productid) {this.productid=productid;}
    public int get_quantity() {return quantity;} public void set_quantity(int quantity) {this.quantity=quantity;}
    public int get_cbid() {return cbid;} public void set_cbid(int cbid) {this.cbid=cbid;}
    public String get_createdat() {return createdat;} public void set_createdat(String createdat) {this.createdat=createdat;}
    public int get_saleid() {return saleid;} public void set_saleid(int saleid) {this.saleid=saleid;}

}
