/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Bishop;

/**
 *
 * @author IT La Paix
 */
public interface BishopInterface extends Remote{
    public String addBishop(Bishop bishop) throws RemoteException;

    public String updateBishop(Bishop bishop) throws RemoteException;

    public String deleteBishop(Bishop bishop) throws RemoteException;

    public List<Bishop> bishops() throws RemoteException;

    public Bishop searchById(Bishop bishop) throws RemoteException;

    public Bishop login(Bishop bishop) throws RemoteException; 
}
