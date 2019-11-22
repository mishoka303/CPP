package pg;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="\"CashDesks\"", schema = "PUBLIC")

public class CashDesks implements Serializable
{

    @Column(name = "\"ID\"", unique=true) @Id private int id; @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Cash\"", nullable=false) private double cash;
    @Column(name = "\"Type\"", nullable=false) private String type;
    @Column(name = "\"Date\"", nullable=false, columnDefinition = "DATE") private Date date;
    @Column(name = "\"CreatedByID\"", nullable=false) private int cbid;
    @Column(name = "\"SaleID\"", nullable=false) private int saleid;
    @Column(name = "\"DeliveryID\"", nullable=false) private int deliveryid;

    public int get_id() {return id;} public void set_id(int id) {this.id=id;}
    public double get_cash() {return cash;} public void set_cash(double cash) {this.cash=cash;}
    public String get_type() {return type;} public void set_type(String type) {this.type=type;}
    public Date get_date() {return date;} public void set_date(Date date) {this.date=date;}
    public int get_cbid() {return cbid;} public void set_cbid(int cbid) {this.cbid=cbid;}
    public int get_saleid() {return saleid;} public void set_saleid(int saleid) {this.saleid=saleid;}
    public int get_deliveryid() {return deliveryid;} public void set_deliveryid(int deliveryid) {this.deliveryid=deliveryid;}

}
