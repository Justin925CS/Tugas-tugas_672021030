package dao;

import db.MyConnection;
import java.sql.Connection;
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

    public List<Matakuliah> getAll() {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul");
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

    public List<Matakuliah> getKodeKuliah(String kode) {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul where kodeMakul =? ");
            stm.setString(1, kode);
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

    public List<Matakuliah> getNamaKuliah(String kode) {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul where namaMakul  LIKE ? ");
            stm.setString(1, "%" + kode + "%");
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

    public List<Matakuliah> getSks(int kode) {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul where sks =?");
            stm.setInt(1, kode);
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

    public List<Matakuliah> getNamaDosen(String kode) {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul where namaDosen LIKE ?");
            stm.setString(1, "%" + kode + "%");
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

    public List<Matakuliah> getHari(String kode) {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul where hari=?");
            stm.setString(1, kode);
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

    public List<Matakuliah> getJam(String kode) {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul where jam=?");
            stm.setString(1, kode);
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

    public List<Matakuliah> getRuang(String kode) {
        List<Matakuliah> makul = new ArrayList<Matakuliah>();
        try {
            PreparedStatement stm = con.prepareStatement("SELECT * FROM tbmakul where ruang LIKE ?");
            stm.setString(1, "%" + kode + "%");
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

    public String insertMakul(Matakuliah makul) {
        String status = "Gagal";
        try {
            PreparedStatement ps = con.prepareStatement(""
                    + "INSERT INTO tbmakul VALUE(?,?,?,?,?,?,?)");
            ps.setString(1, makul.getKodeMakul());
            ps.setString(2, makul.getNamaMakul());
            ps.setInt(3, makul.getSks());
            ps.setString(4, makul.getNamaDosen());
            ps.setString(5, makul.getHari());
            ps.setString(6, makul.getJam());

            ps.setString(7, makul.getRuang());

            ps.executeUpdate();
            status = "Data berhasil disimpan";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public String hapusMakul(String kode) {
        String status = "Gagal";
        try {
            PreparedStatement ps = con.prepareStatement(""
                    + "DELETE FROM tbmakul WHERE kodeMakul=?");
            ps.setString(1, kode);
            ps.executeUpdate();
            status = "Data Berhasil Dihapus";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public String updateMakul(String kode, Matakuliah mk) {
        String status = "Gagal";
        try {
            PreparedStatement ps = con.prepareStatement(""
                    + "UPDATE tbmakul set namaMakul=?,"
                    + "sks=?, namaDosen=?, hari=?, jam=?,"
                    + "ruang=? WHERE kodeMakul=?");
            ps.setString(1, mk.getNamaMakul());
            ps.setInt(2, mk.getSks());
            ps.setString(3, mk.getNamaDosen());
            ps.setString(4, mk.getHari());
            ps.setString(5, mk.getJam());
            ps.setString(6, mk.getRuang());
            ps.setString(7, kode);
            ps.executeUpdate();
            status = "Data Berhasil Diupdate";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    public boolean cekkode(String kode) {
        boolean cek = false;
        String hasil = "";
        try {
            PreparedStatement stm = con.prepareStatement("SELECT namaMakul FROM tbmakul WHERE kodeMakul =?");
            stm.setString(1, kode);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                hasil = rs.getString("namaMakul");
            }
            if (!hasil.equals("")) {
                cek = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return cek;
    }

}
