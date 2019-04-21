package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.ProductDTO;

import javax.persistence.*;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
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
}
