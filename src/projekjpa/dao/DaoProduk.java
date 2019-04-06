/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekJPA.dao;

import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;
import projekJPA.model.Produk;

/**
 *
 * @author Agung
 */
public class DaoProduk extends DaoSuper<Produk> {

    public DaoProduk(Class<Produk> type) {
        super(type);
    }


    @Override
    public void update(long id, Produk t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<Produk> findType(String tipe){
        startTransaction(PERSISTANCE_META);
        
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Produk> cq = cb.createQuery(type);
        Root<Produk> rootEntry = cq.from(type);
        ParameterExpression<Produk> p = cb.parameter(Produk.class);
        cq.where(cb.equal(rootEntry.get("tipe"), tipe));
        TypedQuery<Produk> allQuery = entityManager.createQuery(cq);
        List<Produk> result = allQuery.getResultList();
        
        endTransaction();
        
        return result;
    }
    
}
