import java.awt.*;
import java.applet.*;

public class TraficSignal extends Applet implements Runnable {
    int c=0;
    Thread t;


    public void init()
    {

        t = new Thread(this, "MyThread");
        t.start();
    }
    public void run()
    {

        while (true) {

            repaint();
            try {


                Thread.sleep(5000);
            }
            catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }


    public void paint(Graphics g)
    {
        if(c==0)
        {

			c=1;

			g.drawOval(150,100,50,50);
			g.drawOval(200,100,50,50);
			g.setColor(Color.red);
			g.fillOval(100,100,50,50);
		}
		else if(c==1)
		{

					c=2;
						g.setColor(Color.black);
						g.drawOval(100,100,50,50);
						g.drawOval(200,100,50,50);
						g.setColor(Color.yellow);
						g.fillOval(150,100,50,50);
		}
		else if(c==2 )
		{

			c=0;
			g.setColor(Color.black);
			g.drawOval(150,100,50,50);
			g.drawOval(100,100,50,50);
			g.setColor(Color.green);
			g.fillOval(200,100,50,50);
		}

    }
}