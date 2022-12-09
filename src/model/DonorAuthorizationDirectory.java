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
public class DonorAuthorizationDirectory {
    
    ArrayList<DonorAuthorizationAdmin> donorAuthorizationDirectory;
    public DonorAuthorizationDirectory() {
    donorAuthorizationDirectory=new ArrayList<DonorAuthorizationAdmin>();
    }
    
     public ArrayList<DonorAuthorizationAdmin> getDonorAuthorizationDirectory() {
        return donorAuthorizationDirectory;
    }
     
    public void setDonorAuthorizationDirectory(ArrayList<DonorAuthorizationAdmin> donorAuthorizationDirectory) {
        this.donorAuthorizationDirectory = donorAuthorizationDirectory;
    } 
    
    private void add(DonorAuthorizationAdmin newadmin){
        this.donorAuthorizationDirectory.add(newadmin);
    }
    
    public int generateId(){
        return this.donorAuthorizationDirectory.size()+1;
    }
    
    public DonorAuthorizationAdmin getUserByUserName(String uname){
        DonorAuthorizationAdmin selectedAdmin=new DonorAuthorizationAdmin();
        for(DonorAuthorizationAdmin da : this.donorAuthorizationDirectory){
            if(da.getUserName().equalsIgnoreCase(uname)){
                selectedAdmin=da;
                break;
            }
        }
        return selectedAdmin;
    }
    
}
