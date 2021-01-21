
package com.samsun.donemproject.utils;

import java.util.List;

// JAVA GENERIC CLASS
// Bu şekilde <T> yazılan interface veya sınıflar dışarıdan T için bir değer almak zorunda
public interface IGenCRUD<T> {
    
    
    void Save(T t);
    
    void Update(T t);
    
    
    void Delete(T t);
   
    List<T> findAll(T t);
    
    T findById(Long id,T t);
    
    List<T> findByClass(T t);
    
}
