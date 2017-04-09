package com.vishal.serveraccess;

import java.util.ArrayList;

public class Server implements Runnable {

	private static int maxClients;
	private Thread t;
	private int accessTime;
	private static int noOfClients;
	private int clientNo;
	private static ArrayList<Server> al = new ArrayList<Server>();

	private Server(int clientNo, int accessTime) {
		this.accessTime = 1000 * accessTime;
		this.clientNo = clientNo;
		al.add(this);
		this.start();
	}

	public void run() {
		while (true) {
			++noOfClients;
			if (noOfClients <= maxClients) {
				System.out.println("Client - " + clientNo + " is accessing the server");
				try {
					Thread.sleep(accessTime+1000);
				} catch (InterruptedException e) {}
				System.out.println("Client - " + clientNo + " is done accessing the server");
				--noOfClients;
				break;
			} else {
				--noOfClients;
				System.out.println("client - " + clientNo + " wait for some time, Server is Busy");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
			}
		}
		al.remove(this);
	}

	public static void setMaxClients(int mc) {
		maxClients = mc;
	}

	public void start() {
		if (t == null) {
			t = new Thread(this);
			t.start();
		}
	
	}

	public static void newConnection(int clientNo, int accessTime) {
		new Server(clientNo, accessTime);		
	}
	
}
