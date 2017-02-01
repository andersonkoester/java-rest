package br.com.wswork.dao;

import br.com.wswork.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserDAO extends CoreDAO {


  @PersistenceContext(unitName = "Labs-PU" )
  EntityManager em;

  public List<User> users(){
    return em.createQuery(" SELECT u FROM User u ").getResultList();
  }

}
