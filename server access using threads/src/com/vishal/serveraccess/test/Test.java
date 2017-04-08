package com.vishal.serveraccess.test;

import com.vishal.serveraccess.ClientThread;

public class Test {

	public static void main(String[] args) {
		ClientThread.setMaxClients(3);
		ClientThread c1 = new ClientThread(8000, 1);
		ClientThread c2 = new ClientThread(3000, 2);
		ClientThread c3 = new ClientThread(5000, 3);
		ClientThread c4 = new ClientThread(8000, 4);
		ClientThread c5 = new ClientThread(2000, 5);
		ClientThread c6 = new ClientThread(1000, 6);

		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();

	}

}
