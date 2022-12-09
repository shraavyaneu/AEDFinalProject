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
public class DonorCampAdminDirectory {
    
    private ArrayList<DonorCampAdmin> donorcampadminList;

    public ArrayList<DonorCampAdmin> getDonorCampAdminList() {
        return donorcampadminList;
    }
    public DonorCampAdminDirectory() {
        this.donorcampadminList = new ArrayList<DonorCampAdmin>();
    }
    public void setDonorCampAdminList(ArrayList<DonorCampAdmin> donorcampadminList) {
        this.donorcampadminList = donorcampadminList;
    }
    
    public DonorCampAdmin addDonorCampAdmin(DonorCampAdmin donorcampadmin) {
        donorcampadmin.setId(generateID());
        this.donorcampadminList.add(donorcampadmin);
        return donorcampadmin;
    }
    
    public void removeDonorCampAdmin(DonorCampAdmin donorcampadmin) {
        donorcampadminList.remove(donorcampadmin);
        
    }
    
    public DonorCampAdmin getDonorCampAdminByName(String name) {
        for (DonorCampAdmin donorcampadmin : donorcampadminList) {
            if (donorcampadmin.getName().equals(name)) {
                return donorcampadmin;
            }
        }
        return null;
    }
    public DonorCampAdmin getDonorCampAdminByUserName(String uname) {
        for (DonorCampAdmin donorcampadmin : donorcampadminList) {
            if (donorcampadmin.getUserName().equals(uname)) {
                return donorcampadmin;
            }
        }
        return null;
    }
    
    public String generateID() {
        return "camp"+donorcampadminList.size() + 1;
    }

    public DonorCampAdmin findDonorCampByID(String id) {
        for (DonorCampAdmin ca : donorcampadminList) {
            if (ca.getId().equalsIgnoreCase(id)) {
                return ca;
            }
        }
        return null;
    }
    
    
    
}
