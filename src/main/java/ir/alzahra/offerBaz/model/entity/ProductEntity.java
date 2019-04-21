package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.BankDTO;

import javax.persistence.*;
import java.util.List;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
@Entity
@Table(name="ProductEntity")
public class ProductEntity extends BaseEntity{

    private static final long serialVersionUID = -7140560430822563744L;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<OfferEntity> getOfferEntityList() {
        return offerEntityList;
    }

    public void setOfferEntityList(List<OfferEntity> offerEntityList) {
        this.offerEntityList = offerEntityList;
    }

    public BankDTO getBankDTO() {
        return bankDTO;
    }

    public void setBankDTO(BankDTO bankDTO) {
        this.bankDTO = bankDTO;
    }
}
