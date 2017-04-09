package com.vishal.serveraccess.test;

import com.vishal.serveraccess.ClientThread;

public class Test {

	public static final int MAX_CONNECTIONS = 4;

	public static void main(String[] args) {
		ClientThread.setMaxClients(MAX_CONNECTIONS);
		ClientThread.addClient(1, 8);
		ClientThread.addClient(2, 3);
		ClientThread.addClient(3, 5);
		ClientThread.addClient(4, 8);
		ClientThread.addClient(5, 10);
		ClientThread.addClient(6, 6);

	}

}
