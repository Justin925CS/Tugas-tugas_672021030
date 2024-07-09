/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class MataKuliahController {
    public DAO dao = new DAO();
    
    public List<MataKuliah> getDataMatakuliah(){
        return dao.getDataMatakuliah(); 
    }
}    
