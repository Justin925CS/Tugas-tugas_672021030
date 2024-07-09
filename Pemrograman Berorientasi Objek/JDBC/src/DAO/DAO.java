/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JDBC;


import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

/**
 *
 * @author Lenovo
 */
public class DAO {
    private Connection con = null;
    
    public DAO() {
        this.con = (Connection) new MyConnection().getConnection();
    }
    
    public List<MataKuliah> getDataMatakuliah(){
        List<MataKuliah> matkul = new ArrayList<MataKuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM matakuliah ORDER BY kodematkul ASC");
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                MataKuliah mk = new MataKuliah();
                mk.setKodematkul(rs.getString("kodematkul"));
                mk.setNamamatkul(rs.getString("namamatkul"));
                mk.setSks(rs.getInt("sks"));
                mk.setNamadosen(rs.getString("namadosen"));
                mk.setHari(rs.getString("hari"));
                mk.setJam(rs.getString("jam"));
                mk.setRuang(rs.getString("ruang"));
                matkul.add(mk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return matkul;
    }
    
}
