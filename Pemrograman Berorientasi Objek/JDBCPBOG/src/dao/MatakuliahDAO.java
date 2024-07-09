
package dao;

import java.sql.Connection;
import db.MyConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Matakuliah;

public class MatakuliahDAO {
    private Connection con = null;

    public MatakuliahDAO() {
        this.con = new MyConnection().getConnection();
    }
    
    public List<Matakuliah> getDataMatakuliah(){
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM matakuliah ORDER BY kodeMakul ASC");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Matakuliah mk = new Matakuliah();
                mk.setKodeMakul(rs.getString("kodeMakul"));
                mk.setNamaMakul(rs.getString("namaMakul"));
                mk.setSks(rs.getInt("sks"));
                mk.setNamaDosen(rs.getString("namaDosen"));
                mk.setHari(rs.getString("hari"));
                mk.setJam(rs.getString("jam"));
                mk.setRuang(rs.getString("ruang"));
                makul.add(mk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return makul;
    }
    public String insertMatkul(Matakuliah makul){
        String status = "Gagal Inert Data";
        String query = "INSERT INTO matakuliah VALUE(?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, makul.getKodeMakul());
            ps.setString(2, makul.getNamaMakul());
            ps.setInt(3, makul.getSks());
            ps.setString(4, makul.getNamaDosen());
            ps.setString(5, makul.getHari());
            ps.setString(6, makul.getJam());
            ps.setString(7, makul.getRuang());
            ps.executeUpdate();
            status = "Data Berhasil Disimpan";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
