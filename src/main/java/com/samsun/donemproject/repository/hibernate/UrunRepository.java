

package com.samsun.donemproject.repository.hibernate;

import com.samsun.donemproject.repository.entity.Urun;
import com.samsun.donemproject.utils.VeritabaniIsletimcisi;
import org.hibernate.criterion.Restrictions;

public class UrunRepository extends VeritabaniIsletimcisi<Urun>{

    
      public Urun findByBarkod(String barkod){
        Urun urun=null;
        
        Open();
        cr=ss.createCriteria(Urun.class);
        cr.add(Restrictions.eq(barkod, barkod));
       if(cr.list().size()>0){
           urun=(Urun)cr.list().get(0);
       }
        
        Close();
        
        return urun;
    }
    
}
