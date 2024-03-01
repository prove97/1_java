package com.kh.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend implements Runnable{
	private Socket socket = null;
	
	public ServerSend(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		try (PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); //true 넣어주면 writer.flush();가 없어도 됨, 바로 버퍼를 비워줌 
			Scanner sc = new Scanner(System.in);){ 
			while(true) {
				String message = sc.nextLine();
				writer.println(message);
				//writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
