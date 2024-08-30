/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Rev;

/**
 *
 * @author IT La Paix
 */
public interface RevInterface extends Remote{
     public String addRev(Rev rev) throws RemoteException;

    public String updateRev(Rev rev) throws RemoteException;

    public String deleteRev(Rev rev) throws RemoteException;

    public List<Rev> revs() throws RemoteException;

    public Rev searchById(Rev rev) throws RemoteException;

    public Rev login(Rev rev) throws RemoteException;
}
