
package controller;

import dao.MatakuliahDAO;
import java.util.List;
import model.Matakuliah;


public class MatakuliahController {
    public MatakuliahDAO dao = new MatakuliahDAO();

    public List<Matakuliah> getAll() {
        return dao.getAll();
    }

    public List<Matakuliah> getKodeKuliah(String kode) {
        return dao.getKodeKuliah(kode);
    }

    public List<Matakuliah> getNamaKuliah(String kode) {
        return dao.getNamaKuliah(kode);
    }

    public List<Matakuliah> getSks(int kode) {
        return dao.getSks(kode);
    }

    public List<Matakuliah> getHari(String kode) {
        return dao.getHari(kode);
    }

    public List<Matakuliah> getNamaDosen(String kode) {
        return dao.getNamaDosen(kode);
    }

    public List<Matakuliah> getJam(String kode) {
        return dao.getJam(kode);
    }

    public List<Matakuliah> getRuang(String kode) {
        return dao.getRuang(kode);
    }

    public String tambahMakul(Matakuliah mk) {
        return this.dao.insertMakul(mk);
    }

    public String hapusMatakuliah(String kode) {
        return this.dao.hapusMakul(kode);
    }

    public String editMakul(String kode, Matakuliah makul) {
        return this.dao.updateMakul(kode, makul);
    }
    public boolean cekkode(String kode) {
        return this.dao.cekkode(kode);
    }
}
