/**
 * 
 */
package com.OSI.CentralDB.common.DS.dragoN.remote.Server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import com.OSI.CentralDB.common.DS.dragoN.remote.Dpkg;
import com.OSI.CentralDB.common.DS.dragoN.remote.RMI;

/**
 * @author anon_alexdos2010m
 *
 */
public class ServerInitRMI {
	public ServerInitRMI() {
		try {
			// Create an object of the interface
			// implementation class
			Dpkg obj = new RMI();

			// rmiregistry within the server JVM with
			// port number 2409
			LocateRegistry.createRegistry(2409);

			// Binds the remote object by the name
			// geeksforgeeks
			Naming.rebind("rmi://localhost:2409" + "/OSI/dragoN", obj);
		} catch (Exception ae) {
			System.out.println(ae);
		}
	}

	public static void main() {
		System.out.println("Intialising Server...");
		new ServerInitRMI();
	}
}
