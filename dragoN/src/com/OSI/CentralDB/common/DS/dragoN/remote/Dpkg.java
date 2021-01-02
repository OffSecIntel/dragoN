/**
 * 
 */
package com.OSI.CentralDB.common.DS.dragoN.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author anon_alexdos2010m
 *
 */
public interface Dpkg extends Remote {
	public void CallOnDragON(String cmd) throws RemoteException;
}
