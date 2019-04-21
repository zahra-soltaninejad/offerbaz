package ir.alzahra.offerBaz.model.entity;

import com.google.gson.annotations.Expose;

import javax.persistence.*;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/21/2019, Sun
 **/

@Entity
@Table(name = "PROFILE_ROLE",
        uniqueConstraints = @UniqueConstraint(
                columnNames = { "ROLE", "PROFILE_ID" }))
public class ProfileRoleEntity  extends BaseEntity{


        private int id;
        private ProfileEntity profileEntity;
        private String role;



    @Id
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROFILE_ID")
    public ProfileEntity getProfileEntity() {
        return profileEntity;
    }

    public void setProfileEntity(ProfileEntity profileEntity) {
        this.profileEntity = profileEntity;
    }
    @Column(name = "ROLE", nullable = false, length = 45)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

