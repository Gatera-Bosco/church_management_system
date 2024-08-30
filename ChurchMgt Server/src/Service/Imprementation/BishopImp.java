/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Imprementation;

import Dao.BishopDao;
import Service.BishopInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Bishop;

/**
 *
 * @author IT La Paix
 */
public class BishopImp extends UnicastRemoteObject implements BishopInterface{
    public BishopImp() throws RemoteException{
        super();
    }
    BishopDao dao=new BishopDao();
    public String addBishop(Bishop bishop) throws RemoteException {
     return dao.addBishop(bishop);
    }

    @Override
    public String updateBishop(Bishop bishop) throws RemoteException {
    return dao.updateBishop(bishop);
    }

    @Override
    public String deleteBishop(Bishop bishop) throws RemoteException {
    return dao.deleteBishop(bishop);
    }

    @Override
    public List<Bishop> bishops() throws RemoteException {
    return dao.bishops();
    }

    @Override
    public Bishop searchById(Bishop bishop) throws RemoteException {
     return dao.searchById(bishop);
    }

    @Override
    public Bishop login(Bishop bishop) throws RemoteException {
     return dao.login(bishop);}

   
}
