/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekJPA.dao;

import projekJPA.model.Portofolio;

/**
 *
 * @author Agung
 */
public class DaoPortofolio extends DaoSuper{

    public DaoPortofolio(Class<Portofolio> type) {
        super(type);
    }

    @Override
    public void update(long id, Object k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
