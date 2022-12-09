/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Sakshi Shetty
 */
public class DonorCampAdmin {
    
    private String name;
    private String adminName;
    private String userName;
    private String street;
    private String city;
    private String zipCode;
    private String emailId;
    private String phoneNumber;
    private NGO ngo;
    //private ArrayList<Donor> donorlist;
    private String id;
    private boolean isCampAvailable = true;
    
    public DonorCampAdmin() {
        //this.donorlist = new ArrayList<Donor>();
        this.ngo= new NGO();
    }
    
    public DonorCampAdmin(String name, String adminName, String userName, String street, String city, String zipCode, String emailId, String phoneNumber) {
        this.name = name;
        this.adminName = adminName;
        this.userName = userName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
     //   this.donorlist = new ArrayList<Donor>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public NGO getNgo() {
        return ngo;
    }

    public void setNgo(NGO ngo) {
        this.ngo = ngo;
    }

 //   public ArrayList<Donor> getDonorlist() {
 //       return donorlist;
 //   }

  //  public void setDonorlist(ArrayList<Donor> donorlist) {
  //      this.donorlist = donorlist;
  //  }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsCampAvailable() {
        return isCampAvailable;
    }

    public void setIsCampAvailable(boolean isCampAvailable) {
        this.isCampAvailable = isCampAvailable;
    }
    
    

    
}
