/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Eleader;

/**
 *
 * @author IT La Paix
 */
public interface EleaderInterface extends Remote{
     public String addEleader(Eleader eleader) throws RemoteException;

    public String updateEleader(Eleader eleader) throws RemoteException;

    public String deleteEleader(Eleader eleader) throws RemoteException;

    public List<Eleader> eleaders() throws RemoteException;

    public Eleader searchById(Eleader eleader) throws RemoteException;

    public Eleader login(Eleader eleader) throws RemoteException;
}
