/**
 * 
 */
package com.OSI.CentralDB.common.DS.MutualExclusion;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author anon_alexdos2010m
 *
 */
public class MessageSender extends Thread{
	DataOutputStream dos;
	int id;
	CriticalSectionRequests csrequests;
	String msg;
	public MessageSender(String m) {
		this.msg = m;
	}
	
	public MessageSender(){
		
	}
	public void createOutputStream(Socket socket,int id,Message m){
		this.id = id;
		try {
			dos= new DataOutputStream(socket.getOutputStream());
//			Timestamp ts = new Timestamp(new Date().getTime());
			RicartAgrawala.setMyTimeStamp(TimeStamp.getInstance());
//			dos.writeUTF("Let me try to enter critical section, id : "+id);
//			m=REQUEST,ts=timestamp i.e System time
			dos.writeUTF(m.toString()+","+TimeStamp.getInstance().toString()+","+id);
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void sendMessage(Socket socket,int id,Message msg){
		try {
			dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(msg.toString()+","+id);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
