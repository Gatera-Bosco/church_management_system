/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Pastor;

/**
 *
 * @author IT La Paix
 */
public interface PastorInterface extends Remote{
    public String addPastor(Pastor pastor) throws RemoteException;

    public String updatePastor(Pastor pastor) throws RemoteException;

    public String deletePastor(Pastor pastor) throws RemoteException;

    public List<Pastor> pastors() throws RemoteException;

    public Pastor searchById(Pastor pastor) throws RemoteException;

    public Pastor login(Pastor pastor) throws RemoteException; 
}
