package com.LeaveManagement.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idE;
    private String firstNameFr;
    private String firstNameAr;
    private String lastNameFr;
    private String lastNameAr;
    private String email;
    private String password;
    private String phone;
    private String ppr;
    private String cin;
    private String addressFr;
    private String addressAr;
    private LocalDate hireDate;
    private String workLocation;
    private String image;
    private int remainingLeaveDays; // Added field to track remaining leave days

    @ManyToOne
    @JoinColumn(name = "managerId")
    private Employee manager;

    @ManyToOne
    @JoinColumn(name = "IdProfile")
    private Profilee profile;

    @ManyToOne
    @JoinColumn(name = "IdGrade")
    private Grades grade;

    @ManyToOne
    @JoinColumn(name = "IdPost")
    private Posts post;

    //@OneToMany(mappedBy = "employee")
    //private Set<LeaveRequest> leaveRequests;


    public Long getIdE() {
        return idE;
    }

    public void setIdE(Long idE) {
        this.idE = idE;
    }

    public String getFirstNameFr() {
        return firstNameFr;
    }

    public void setFirstNameFr(String firstNameFr) {
        this.firstNameFr = firstNameFr;
    }

    public String getFirstNameAr() {
        return firstNameAr;
    }

    public void setFirstNameAr(String firstNameAr) {
        this.firstNameAr = firstNameAr;
    }

    public String getLastNameFr() {
        return lastNameFr;
    }

    public void setLastNameFr(String lastNameFr) {
        this.lastNameFr = lastNameFr;
    }

    public String getLastNameAr() {
        return lastNameAr;
    }

    public void setLastNameAr(String lastNameAr) {
        this.lastNameAr = lastNameAr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPpr() {
        return ppr;
    }

    public void setPpr(String ppr) {
        this.ppr = ppr;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAddressFr() {
        return addressFr;
    }

    public void setAddressFr(String addressFr) {
        this.addressFr = addressFr;
    }

    public String getAddressAr() {
        return addressAr;
    }

    public void setAddressAr(String addressAr) {
        this.addressAr = addressAr;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRemainingLeaveDays() {
        return remainingLeaveDays;
    }

    public void setRemainingLeaveDays(int remainingLeaveDays) {
        this.remainingLeaveDays = remainingLeaveDays;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Profilee getProfile() {
        return profile;
    }

    public void setProfile(Profilee profile) {
        this.profile = profile;
    }

    public Grades getGrade() {
        return grade;
    }

    public void setGrade(Grades grade) {
        this.grade = grade;
    }

    public Posts getPost() {
        return post;
    }

    public void setPost(Posts post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idE=" + idE +
                ", firstNameFr='" + firstNameFr + '\'' +
                ", firstNameAr='" + firstNameAr + '\'' +
                ", lastNameFr='" + lastNameFr + '\'' +
                ", lastNameAr='" + lastNameAr + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", ppr='" + ppr + '\'' +
                ", cin='" + cin + '\'' +
                ", addressFr='" + addressFr + '\'' +
                ", addressAr='" + addressAr + '\'' +
                ", hireDate=" + hireDate +
                ", workLocation='" + workLocation + '\'' +
                ", image='" + image + '\'' +
                ", remainingLeaveDays=" + remainingLeaveDays +
                ", manager=" + manager +
                ", profile=" + profile +
                ", grade=" + grade +
                ", post=" + post +
                '}';
    }
}
