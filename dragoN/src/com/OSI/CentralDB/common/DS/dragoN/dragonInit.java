package com.OSI.CentralDB.common.DS.dragoN;

import java.io.IOException;

import com.OSI.CentralDB.common.DS.dragoN.remote.Client.ClientInitRMI;
import com.OSI.CentralDB.common.DS.dragoN.remote.Server.ServerInitRMI;

public class dragonInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello there!!!");
//	    ServerInit server = new ServerInit(2409); 
//	    server.start();
//	    ClientInit client = new ClientInit("127.0.0.1",2409);
//		client.start();
	//	    dragonInit DI = new dragonInit();
	//	    String cmd = "rmic -d ./remote/RMI.java";
	//	    DI.execCommand(cmd);
	//	    cmd = "start rmiregistry";
	//	    DI.execCommand(cmd);
		ServerInitRMI ServInit = new ServerInitRMI();
		ClientInitRMI CliInit = new ClientInitRMI();
		System.out.println("Reached end");
		
	}
	public void execCommand(String new_dir){
	    Runtime rt = Runtime.getRuntime();
	    try {
	        rt.exec(new String[]{"cmd.exe","/c","start"});

	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}

}

