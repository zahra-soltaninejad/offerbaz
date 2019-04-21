package ir.alzahra.offerBaz.model.entity;

import com.google.gson.annotations.Expose;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/
public class ProfileEntity extends BaseEntity{

    private String userName;
    private String password;
    private boolean enabled;
    private Set<ProfileRoleEntity> profileRoleEntity = new HashSet<ProfileRoleEntity>(0);

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "PROFILE-ENEITY")
    private List<OfferRequestEntity> offerRequestEntities;

    public ProfileEntity() {
    }

    public ProfileEntity(String username, String password, boolean enabled) {
        this.userName = username;
        this.password = password;
        this.enabled = enabled;
    }

    public ProfileEntity(String username, String password,
                         boolean enabled, Set<ProfileRoleEntity> userRole) {
        this.userName = username;
        this.password = password;
        this.enabled = enabled;
        this.profileRoleEntity = userRole;
    }

    @Id
    @Column(name = "USERNAME", unique = true,nullable = false, length = 45)
    public String getUsername() {
        return this.userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    @Column(name = "PASSWORD",nullable = false, length = 60)
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "ENABLE", nullable = false)
    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "PROFILE_ID", cascade = CascadeType.ALL)
    public Set<ProfileRoleEntity> getUserRole() {
        return this.profileRoleEntity;
    }

    public void setProfileRoleEntity(Set<ProfileRoleEntity> profileRoleEntity) {
        this.profileRoleEntity = profileRoleEntity;
    }


    public List<OfferRequestEntity> getOfferRequestEntities() {
        return offerRequestEntities;
    }

    public void setOfferRequestEntities(List<OfferRequestEntity> offerRequestEntities) {
        this.offerRequestEntities = offerRequestEntities;
    }
}
