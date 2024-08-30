/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Imprementation;

import Dao.PastorDao;
import Service.PastorInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Pastor;

/**
 *
 * @author IT La Paix
 */
public class PastorImp extends UnicastRemoteObject implements PastorInterface{
    public PastorImp() throws RemoteException{
        super();
    }
    PastorDao dao=new PastorDao();
    @Override
    public String addPastor(Pastor pastor) throws RemoteException {
     return dao.addPastor(pastor);
    }

    @Override
    public String updatePastor(Pastor pastor) throws RemoteException {
    return dao.updatePastor(pastor);
    }

    @Override
    public String deletePastor(Pastor pastor) throws RemoteException {
    return dao.deletePastor(pastor);
    }

    @Override
    public List<Pastor> pastors() throws RemoteException {
    return dao.pastors();
    }

    @Override
    public Pastor searchById(Pastor pastor) throws RemoteException {
     return dao.searchById(pastor);
    }

    @Override
    public Pastor login(Pastor pastor) throws RemoteException {
     return dao.login(pastor);}

    
}
