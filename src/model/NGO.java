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
public class NGO {
    
    private String name;
    private String adminName;
    private String userName;
    private String street;
    private String city;
    private String zipCode;
    private String emailId;
    private String phoneNumber;
    private ArrayList<DonorCampAdmin> donorcampadminlist;
    //private ArrayList<PrivateDriver> pdriverist;
    private int id;
    
    public NGO() {
        this.donorcampadminlist = new ArrayList<DonorCampAdmin>();
       // this.pdriverist = new ArrayList<PrivateDriver>();
    }
    
     public NGO(String name, String adminName, String userName, String street, String city, String zipCode, String emailId, String phoneNumber) {
        this.name = name;
        this.adminName = adminName;
        this.userName = userName;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.donorcampadminlist = new ArrayList<DonorCampAdmin>();
    }
     
      public void addDonorCampAdmin(DonorCampAdmin donorcampAdmin) {
        donorcampadminlist.add(donorcampAdmin);
    }

    public void removeCampAdmin(DonorCampAdmin donorcampAdmin) {
        donorcampadminlist.remove(donorcampAdmin);
    }
    // public void addPrivateDriver(PrivateDriver pd) {
      //  pdriverist.add(pd);
    //}

    //public void removePrivateDriver(PrivateDriver pd) {
      //  pdriverist.remove(pd);
    //}

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

    public ArrayList<DonorCampAdmin> getDonorcampadminlist() {
        return donorcampadminlist;
    }

    public void setDonorcampadminlist(ArrayList<DonorCampAdmin> donorcampadminlist) {
        this.donorcampadminlist = donorcampadminlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   // public ArrayList<PrivateDriver> getPdriverist() {
     //   return pdriverist;
    //}

   // public void setPdriverist(ArrayList<PrivateDriver> pdriverist) {
     //   this.pdriverist = pdriverist;
    
    
}
