import java.awt.*;
import java.applet.*;
import java.lang.reflect.*;
/*

*/
public class SetColor extends Applet
{

        public void paint (Graphics g)
        {
			 String color=getParameter("color");
			 Color c=Color.red;
			 try
			 {

			  Field f = Color.class.getField(color);

        		c= (Color) f.get(null);
			}
			catch(Exception e)
			{
			}
           setBackground(c);


        }
}