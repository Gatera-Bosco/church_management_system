/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Imprementation;

import Dao.RevDao;
import Service.RevInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Rev;

/**
 *
 * @author IT La Paix
 */
public class RevImp extends UnicastRemoteObject implements RevInterface{
    public RevImp() throws RemoteException{
        super();
    }
    RevDao dao=new RevDao();
    @Override
    public String addRev(Rev rev) throws RemoteException {
     return dao.addRev(rev);
    }

    @Override
    public String updateRev(Rev rev) throws RemoteException {
    return dao.updateRev(rev);
    }

    @Override
    public String deleteRev(Rev rev) throws RemoteException {
    return dao.deleteRev(rev);
    }

    @Override
    public List<Rev> revs() throws RemoteException {
    return dao.revs();
    }

    @Override
    public Rev searchById(Rev rev) throws RemoteException {
     return dao.searchById(rev);
    }

    @Override
    public Rev login(Rev rev) throws RemoteException {
     return dao.login(rev);}

   
}
