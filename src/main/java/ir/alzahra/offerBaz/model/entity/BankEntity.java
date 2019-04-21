package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.ProductDTO;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
@Entity
@Table(name="BankEntity")
public class BankEntity extends BaseEntity{

    private static final long serialVersionUID = -8570263691305690317L;

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "BANK_ID")
    private List<ProductEntity> productEntities;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }
}
