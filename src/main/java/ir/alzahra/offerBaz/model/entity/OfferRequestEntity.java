package ir.alzahra.offerBaz.model.entity;

import ir.alzahra.offerBaz.dto.OfferDTO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
@Entity
@Table(name="OfferRequestEntity")
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

    public String getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(String salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public String getSavedMoney() {
        return savedMoney;
    }

    public void setSavedMoney(String savedMoney) {
        this.savedMoney = savedMoney;
    }

    public Date getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    public List<OfferEntity> getOfferEntityList() {
        return offerEntityList;
    }

    public void setOfferEntityList(List<OfferEntity> offerEntityList) {
        this.offerEntityList = offerEntityList;
    }

    public ProfileEntity getProfileEntity() {
        return profileEntity;
    }

    public void setProfileEntity(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
    }
}
