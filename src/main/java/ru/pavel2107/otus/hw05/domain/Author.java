package ru.pavel2107.otus.hw05.domain;

import java.time.LocalDate;

public class Author extends AbstractNamedEntity{
    private LocalDate birthDate;
    private String    email;
    private String    phone;
    private String    address;

    public Author(){}

    public Author( Long ID, String Name, LocalDate birthDate, String email, String phone, String address){
        super( ID, Name);
        this.birthDate = birthDate;
        this.email     = email;
        this.phone     = phone;
        this.address   = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + getID() +
                ", name='" + getName() + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
