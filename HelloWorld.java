//First.java  
import java.applet.Applet;  
import java.awt.Graphics; 
import java.util.Date;// used  
public class HelloWorld extends Applet{  
  
public void paint(Graphics g){  
g.drawString("Hello Arjun",50,50);  

Date dt = new Date();
super.showStatus("Today is" + dt);
}  
  
}  