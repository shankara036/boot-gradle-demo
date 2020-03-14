package com.boot.demo.services;

import com.boot.demo.domains.DomainObject;

import java.util.*;

public abstract class AbstractMapService {

    protected Map<Integer, DomainObject> domainObjectMap;

    public AbstractMapService(){
        domainObjectMap = new HashMap<>();
        loadDomainObjects();
    }

    public List<DomainObject> listAll(){
        return new ArrayList<>(domainObjectMap.values());
    }

    public DomainObject getById(Integer id) {
        return domainObjectMap.get(id);
    }

    public DomainObject saveOrUpdate(DomainObject domainObject) {
        if(domainObjectMap != null) {
            if(domainObject != null && domainObject.getId() == null) {
                domainObject.setId(Collections.max(domainObjectMap.keySet())+1);
            }
            domainObjectMap.put(domainObject.getId(), domainObject);
            return domainObject;
        } else {
            throw new RuntimeException("Object cant be null!!");
        }
    }

    public void delete(Integer id) {
        domainObjectMap.remove(id);
    }

    protected abstract void loadDomainObjects();

}
