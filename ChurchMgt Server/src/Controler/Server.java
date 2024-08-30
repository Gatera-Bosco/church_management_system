/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Service.Imprementation.BishopImp;
import Service.Imprementation.EleaderImp;
import Service.Imprementation.PastorImp;
import Service.Imprementation.RevImp;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author IT La Paix
 */
public class Server {
     public BishopImp bishopImp;
    public PastorImp pastorImp;
    public RevImp revImp;
    public EleaderImp eleaderImp;

    public Server() throws RemoteException{
       this.bishopImp=new BishopImp();
       this.eleaderImp=new EleaderImp();
       this.pastorImp=new PastorImp();
       this.revImp=new RevImp();
    }
    
    public static void main(String[] args) {
        try {
            //set property
        System.setProperty("java.rmi.server.hostname", "127.0.0.1");
        //create registry
            Registry registry=LocateRegistry.createRegistry(81);
            registry.rebind("bishop",new Server().bishopImp);
            registry.rebind("paster", new Server().pastorImp);           
            registry.rebind("rev",new Server().revImp);
            registry.rebind("eleader",new Server().eleaderImp);
            System.out.println("ChurchMgt Server is Running on port 81");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
