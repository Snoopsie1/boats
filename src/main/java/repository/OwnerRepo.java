package repository;

import dtos.OwnerDTO;
import entities.Owner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;

public class OwnerRepo {

    private static OwnerRepo instance;
    private static EntityManagerFactory emf;

    private OwnerRepo() {}


    public static OwnerRepo getRepositoryExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new OwnerRepo();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public OwnerDTO getById(int id) throws EntityNotFoundException {
        EntityManager em = emf.createEntityManager();
        Owner owner = em.find(Owner.class, id);
        if (owner == null)
            throw new EntityNotFoundException("The Owner entity with ID: "+id+" was not found");
        return new OwnerDTO(owner);
    }
}
