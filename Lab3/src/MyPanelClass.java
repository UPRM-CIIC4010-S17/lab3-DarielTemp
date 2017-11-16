import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        
               Rectangle r1= new Rectangle();
               g.setColor(Color.WHITE);
               g.fillRect(0, height/5, width+1, (height/5));
              
               Rectangle r2= new Rectangle();
               g.setColor(Color.WHITE);
               g.fillRect(0, 3*(height/5), width+1, (height/5));
               

               Polygon p = new Polygon();
		         p.addPoint(x1 + 0, y1 + 1);
		         p.addPoint(width/2, height/2);
		         p.addPoint(x1 + 0, height);
		         g.setColor(Color.BLUE);
		         g.fillPolygon(p);
               
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 +0+(width/5)-(width/10), y1 + 15 + (height/2)-(height/10));
                        p2.addPoint(x1 + 18+ (width/5) -(width/10), y1 + 15+ (height/2)-(height/10));
                        p2.addPoint(x1 + 24+ (width/5)-(width/10), y1 + 0+ (height/2)-(height/10));
                        p2.addPoint(x1 + 30+ (width/5)-(width/10), y1 + 15+ (height/2)-(height/10));
                        p2.addPoint(x1 + 46+ (width/5)-(width/10), y1 + 15+ (height/2)-(height/10));
                        p2.addPoint(x1 + 33+ (width/5)-(width/10), y1 + 25+ (height/2)-(height/10));
                        p2.addPoint(x1 + 38+ (width/5)-(width/10), y1 + 40+ (height/2)-(height/10));
                        p2.addPoint(x1 + 24+ (width/5)-(width/10), y1 + 30+ (height/2)-(height/10));
                        p2.addPoint(x1 + 11+ (width/5)-(width/10), y1 + 40+ (height/2)-(height/10));
                        p2.addPoint(x1 + 15+ (width/5)-(width/10), y1 + 25+ (height/2)-(height/10));
                        g.setColor(Color.WHITE);
                        
                        g.fillPolygon(p2);


            }
}