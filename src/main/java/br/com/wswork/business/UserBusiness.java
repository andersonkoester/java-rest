package br.com.wswork.business;

import br.com.wswork.dao.UserDAO;
import br.com.wswork.entity.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UserBusiness extends CoreBusiness {

  @EJB
  private UserDAO userDAO;

  public List<User> getUsers(){
    return userDAO.users();
  }

}
