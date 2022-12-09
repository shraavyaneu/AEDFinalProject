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
public class NGODirectory {
    
    private ArrayList<NGO> ngoList;
    
    public ArrayList<NGO> getNGOList() {
        return ngoList;
    }
    
    public NGODirectory() {
        this.ngoList = new ArrayList<NGO>();
    }
    
    public NGO addNGO(NGO ngo) {
        ngo.setId(generateID());
        this.ngoList.add(ngo);
        return ngo;
    }
    
    public void removeNGO(NGO ngo) {
        ngoList.remove(ngo);
    }
    
    public NGO getNGOByName(String name) {
        for (NGO ngo : ngoList) {
            if (ngo.getName().equals(name)) {
                return ngo;
            }
        }
        return null;
    }
    
    public NGO getNGOByUserName(String uname) {
        for (NGO ngo : ngoList) {
            if (ngo.getUserName().equals(uname)) {
                return ngo;
            }
        }
        return null;
    }
    
    public int generateID() {
        return ngoList.size() + 1;
    }
    
    public NGO findNGOByID(int id) {
        for (NGO ngo : ngoList) {
            if (ngo.getId() == id) {
                return ngo;
            }
        }
        return null;
    }
}
