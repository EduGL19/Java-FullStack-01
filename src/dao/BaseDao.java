package dao;

import java.util.List;
import java.util.Optional;

public interface BaseDao <T,K>{

    void insert(T entity);

    void update(T entity);

    Optional<T> findById(K id);

    void delete(K id);

    List<T> listDetail();

    String evaluation(K id);

}
