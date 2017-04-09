package com.vishal.serveraccess.test;

import com.vishal.serveraccess.Server;

public class Test {

	public static final int MAX_CONNECTIONS = 4;

	public static void main(String[] args) {
		Server.setMaxClients(MAX_CONNECTIONS);
		Server.newConnection(1, 8);
		Server.newConnection(2, 3);
		Server.newConnection(3, 5);
		Server.newConnection(4, 8);
		Server.newConnection(5, 10);
		Server.newConnection(6, 6);
		
	}

}
