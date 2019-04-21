package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.BankDTO;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
public class ProductEntity extends BaseEntity{
    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;
    @Column(name = "PRODUCT_NAME")
    private String productName;
    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "OFFER_ID")
    private List<OfferEntity> offerEntityList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "BANK_ID")
    private BankDTO bankDTO;
}
