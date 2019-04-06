/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekJPA.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.function.Consumer;
import projekJPA.model.Nasabah;

/**
 *
 * @author Agung
 */
public class DaoNasabah extends DaoSuper<Nasabah>{
    
    public DaoNasabah(Class<Nasabah> type) {
        super(type);
    }


    public Nasabah findByEmail(String email){
        List list = findAll();
        Nasabah nasabah, t = null;
        for(int i = 0; i<list.size(); i++){
            nasabah = (Nasabah) list.get(i);
            if(nasabah.getEmail().equalsIgnoreCase(email)){
                t = nasabah;
            }
        }
        startTransaction(PERSISTANCE_META);
        endTransaction();
        return t;
    }

    @Override
    public void update(long id, Nasabah t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
