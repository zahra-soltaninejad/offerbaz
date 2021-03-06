package ir.alzahra.offerBaz.dto;

import ir.alzahra.offerBaz.enums.CustomerType;
import ir.alzahra.offerBaz.enums.Gender;

import java.util.List;

/**
 * @Author: zahra soltaninejad
 * @Date: 4/18/2019, Thu
 **/
public class UserDTO {

    private Long id;
    private String name;
    private String family;
    private String age;
    private Gender gender;
    private ProfileDto profileDto;
    private String email;
    private String phoneNumber;
    private CustomerType customerType;
    private List<OfferRequestDTO> requestDTOS;

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

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ProfileDto getProfileDto() {
        return profileDto;
    }

    public void setProfileDto(ProfileDto profileDto) {
        this.profileDto = profileDto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public List<OfferRequestDTO> getRequestDTOS() {
        return requestDTOS;
    }

    public void setRequestDTOS(List<OfferRequestDTO> requestDTOS) {
        this.requestDTOS = requestDTOS;
    }
}
