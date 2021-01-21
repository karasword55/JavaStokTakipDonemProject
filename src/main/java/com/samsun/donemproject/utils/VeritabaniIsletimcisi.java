
package com.samsun.donemproject.utils;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.samsun.donemproject.repository.hibernate.HibernateUtil;
import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JOptionPane;


public class VeritabaniIsletimcisi<T> implements IGenCRUD<T> {
    
    public Session ss;
    public Transaction tt;
    public Criteria cr;
    
    public void Open(){
        ss=HibernateUtil.getSessionFactory().openSession();
        tt=ss.beginTransaction();
        
    }
    public void Close(){
         tt.commit();
        ss.close();
    }

    @Override
    public void Save(T t) {
        Open();
        ss.save(t);
        Close();
    }

    @Override
    public void Update(T t) {
        Open();
        ss.update(t);
        Close();
    }

    @Override
    public void Delete(T t) {
         Open();
        ss.delete(t);
        Close();
    }

    @Override
    public List<T> findAll(T t) {
        
        // kriter oluşturucu bizden sınıf nesnesi ister.
        Open();
        cr=ss.createCriteria(t.getClass());
        List<T> result=cr.list();
        Close();
        return result;
      
    }

    @Override
    public T findById(Long id, T t) {
        
          Open();
        cr=ss.createCriteria(t.getClass());
        // sql select sorgusunda where id= id
        cr.add(Restrictions.eq("id",id));
        
        // bulduğun değer bir liste halinde geldi ancak ben sadece 1.değeri istiyorum.
        T result=(T)cr.list().get(0);
        return result;
        
    }

    @Override
    public List<T> findByClass(T t) {
        
         // REFLECTIONS
        
        List<T> result;
        Open();
        cr=ss.createCriteria(t.getClass());
        try{
        //  sınıfı okumak için aldım.
        Class parameters=t.getClass();
        
        // bu alanları okumam gerekli
        Field[] mparams=parameters.getDeclaredFields();
        
        for(int i=0;i<mparams.length;i++){
            // burada okuduğum alanın erişebilirliğini true yapıyoruz.Bunu yapmazsak hata alırız.
            mparams[i].setAccessible(true);
            if(mparams[i].get(t) != null){
                
                cr.add(Restrictions.like(mparams[i].getName() , "%"+mparams[i].get(t)+"%"));
            }
                
              
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"beklenmeyen hata" );
        }
        result=cr.list();
        Close();
        return result;
    }
    

}
