/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Imprementation;

import Dao.EleaderDao;
import Service.EleaderInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Eleader;

/**
 *
 * @author IT La Paix
 */
public class EleaderImp extends UnicastRemoteObject implements EleaderInterface{
  public EleaderImp() throws RemoteException{
        super();
    }
    EleaderDao dao=new EleaderDao();
    @Override
    public String addEleader(Eleader eleader) throws RemoteException {
     return dao.addEleader(eleader);
    }

    @Override
    public String updateEleader(Eleader eleader) throws RemoteException {
    return dao.updateEleader(eleader);
    }

    @Override
    public String deleteEleader(Eleader eleader) throws RemoteException {
    return dao.deleteEleader(eleader);
    }

    @Override
    public List<Eleader> eleaders() throws RemoteException {
    return dao.eleaders();
    }

    @Override
    public Eleader searchById(Eleader eleader) throws RemoteException {
     return dao.searchById(eleader);
    }

    @Override
    public Eleader login(Eleader eleader) throws RemoteException {
     return dao.login(eleader);}  
}
