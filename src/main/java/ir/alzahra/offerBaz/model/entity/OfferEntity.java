package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.ProductDTO;

import javax.persistence.*;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
@Entity
@Table(name="OfferEntity")
public class OfferEntity extends BaseEntity{

    private static final long serialVersionUID = 9073510205176823830L;

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "OFFER_NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OFFER_ID")
    private ProductEntity productEntity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OFFER_REQUEST_ID")
    private OfferRequestEntity offerRequestEntity;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductEntity getProductEntity() {
        return productEntity;
    }

    public void setProductEntity(ProductEntity productEntity) {
        this.productEntity = productEntity;
    }

    public OfferRequestEntity getOfferRequestEntity() {
        return offerRequestEntity;
    }

    public void setOfferRequestEntity(OfferRequestEntity offerRequestEntity) {
        this.offerRequestEntity = offerRequestEntity;
    }
}
