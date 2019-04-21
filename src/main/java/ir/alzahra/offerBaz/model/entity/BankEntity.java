package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.ProductDTO;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
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
}
