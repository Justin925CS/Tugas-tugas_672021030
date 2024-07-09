
package controller;

import dao.MatakuliahDAO;
import java.util.List;
import model.Matakuliah;

public class MatakuliahController {
    public MatakuliahDAO dao = new MatakuliahDAO();
    
    public List<Matakuliah> getDataMatakuliah(){
        return dao.getDataMatakuliah();
    }
    public String insertMakul(Matakuliah mk){
        return this.dao.insertMakul(mk);
    }
    public String hapusMakul(Matakuliah mk){
}
