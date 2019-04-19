package ir.alzahra.offerBaz.dto;

import ir.alzahra.offerBaz.enums.CustomerType;

/**
 * @Author: hanieh moafi
 * @Date: 4/19/2019
 **/
public class ProfileDto {

    private Long id;
    private String userName;
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
