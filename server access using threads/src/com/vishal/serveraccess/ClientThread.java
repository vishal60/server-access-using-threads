package com.vishal.serveraccess;

public class ClientThread implements Runnable {

	private static int maxClients;
	private Thread t;
	private int accessTime;
	private static int noOfClients;
	private int clientNo;

	public ClientThread(int accessTime, int clientNo) {
		this.accessTime = accessTime;
		this.clientNo = clientNo;
	}

	public void run() {
		while (true) {
			++noOfClients;
			if (noOfClients <= maxClients) {
				System.out.println("Client - " + clientNo + " is accessing the server");
				try {
					Thread.sleep(accessTime);
				} catch (InterruptedException e) {}
				System.out.println("Client - " + clientNo + " is done accessing the server");
				--noOfClients;
				break;
			} else {
				--noOfClients;
				System.out.println("Server is Busy, client - " + clientNo + " wait for some time");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {}
			}
		}
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
}
