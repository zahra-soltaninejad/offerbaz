package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.OfferDTO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
public class OfferRequestEntity extends BaseEntity{

    private static final long serialVersionUID = -7400819531205311768L;

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SALARY_PER_MONTH")
    private String salaryPerMonth;

    @Column(name = "SAVED_MONEY")
    private String savedMoney;

    @Column(name = "SUBMIT_DATE")
    private Date submitDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "OFFER_REQUEST_ID")
    private List<OfferEntity> offerEntityList;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PROFILE-ENEITY")
    private ProfileEntity profileEntity;
}
