/**
 * 
 */
package com.OSI.CentralDB.common.DS.dragoN.remote.Client;

import java.rmi.Naming;

import com.OSI.CentralDB.common.DS.dragoN.remote.Dpkg;

/**
 * @author anon_alexdos2010m
 *
 */
public class ClientInitRMI {
	public ClientInitRMI() {
		try{  
			Dpkg stub = (Dpkg)Naming.lookup("rmi://localhost:2409/OSI/dragoN");  
			String cmd = "install";
			stub.CallOnDragON(cmd);
			}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
