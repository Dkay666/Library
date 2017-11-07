package kz.inessoft.project.storage.impl;

import kz.inessoft.project.entity.Publication;
import kz.inessoft.project.storage.StorageInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements CRUD operations and used to store, create and delete values of Library
 * @author Artyom Revinov
 */
public enum Storage implements StorageInterface<Publication> {

    INSTANCE; //Singleton

    private static List<Publication> publicationList = new ArrayList<>();
    

    @Override
    public void create(Publication publication) {

        publicationList.add(publication);
    }

    @Override
    public Publication read(int id) throws IndexOutOfBoundsException{

        return publicationList.get(id);
    }

    public List<Publication> readAll(){

        return new ArrayList<>(publicationList);
    }

    @Override
    public void update(Publication publication) {

        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(String name) {

        publicationList.remove(name);
    }
}
