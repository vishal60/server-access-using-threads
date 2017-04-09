package com.vishal.serveraccess.test;

import com.vishal.serveraccess.ClientThread;

public class Test {

	public static final int MAX_CONNECTIONS = 4;

	public static void main(String[] args) {
		ClientThread.setMaxClients(MAX_CONNECTIONS);
		new ClientThread(1, 8);
		new ClientThread(2, 3);
		new ClientThread(3, 5);
		new ClientThread(4, 8);
		new ClientThread(5, 10);
		new ClientThread(6, 6);

	}

}
