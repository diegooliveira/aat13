
package edu.dao;


public interface PagedResult<T> extends Iterable<T>, AutoCloseable {
    
    public T next();
    
    public void close();
    
}
