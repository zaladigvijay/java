// Run this program first followed by Client.java

import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener,Runnable{
	static JTextField tr,ts;
	static JButton send;
	static ServerSocket server;
	static Socket client ;
	static DataInputStream fromclient ;
	static PrintWriter toclient ;
	Thread t1;
	public Server()
	{
		try		{
			t1=new Thread(this,"send");

			tr=new JTextField();
						ts=new JTextField();
						send=new JButton("send");
						send.addActionListener(this);
						setLayout(null);
						setSize(500,500);
						JLabel lr=new JLabel("received Message");
						lr.setBounds(10,10,120,20);
						add(lr);
						JLabel ls=new JLabel("send Message");
						ls.setBounds(10,40,100,20);
						add(ls);
						tr.setBounds(130,10,200,20);
						add(tr);
						ts.setBounds(130,40,200,20);
						add(ts);
						send.setBounds(130,60,200,30);
						add(send);

						setVisible(true);

			server= new ServerSocket(9999);
			client = server.accept();
			fromclient = new DataInputStream(client.getInputStream());
			toclient = new PrintWriter(client.getOutputStream(),true);
			t1.start();

		}
		catch(IOException e){
					System.out.println(e);
		}


	}
	public void run()
	{Scanner sc ;String rec;
		while(true)
					{
							sc= new Scanner(fromclient);
							rec = sc.next();
						tr.setText(tr.getText() +rec);
						try
						{
							Thread.sleep(5000);
					}
					catch(Exception e)
					{
							System.out.println(e);
					}
			}
	}
	public void actionPerformed(ActionEvent e)
	{
		toclient.println(ts.getText());

	}

	public static void main(String ar[])	{
		Server s=new Server();
	}
}