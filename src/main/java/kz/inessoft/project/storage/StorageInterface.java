package kz.inessoft.project.storage;

/**
 *  this CRUD operations used to be implemented in Storage
 *  @author Artyom reviov
 */
public interface StorageInterface<T> {

    void create(T entity);

    T read(int id);

    void update(T entity);

    void delete(String name);

}
