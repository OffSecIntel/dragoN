/**
 * 
 */
package com.OSI.CentralDB.common.DS.dragoN.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.OSI.CentralDB.common.DS.dragoN.pkgM.DragON;

/**
 * @author anon_alexdos2010m
 *
 */
@SuppressWarnings("serial")
public class RMI extends UnicastRemoteObject implements Dpkg, DragON {
	
	// Default constructor to throw RemoteException 
    // from its parent constructor 	
	public RMI() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public void CallOnDragON(String cmd) throws RemoteException {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void CallOnDragON(String cmd) throws RemoteException {
		// TODO Auto-generated method stub
		switch(cmd) {
		case "install":
			System.out.println("Installing...");
			RMI rmi = new RMI();
			rmi.install();
			break;
		case "depends":
			RMI rmi2 = new RMI();
			rmi2.pkg_depends();
			break;
		}
		System.out.println("Inside RMI.java; Successfull CallOnDragON()...;");
			
		}
}