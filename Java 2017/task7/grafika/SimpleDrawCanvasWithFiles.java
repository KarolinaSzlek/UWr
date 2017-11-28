package grafika;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class SimpleDrawCanvasWithFiles extends Canvas implements MouseMotionListener, MouseListener ,KeyListener {

    private int currentColorIndex;  // Color that is currently being used for drawing new lines,
                                   // given as an index in the ColoredLine.colorList array.
   
    
    private int currentBackgroundIndex;  // Current background color, given as an index in the ColoredLine.colorList array.
                                        
                                   
    private ColoredLine[] lines;    // An array to hold all the lines 
                                 
    private int lineCount;   // The number of lines in the array.

    SimpleDrawCanvasWithFiles() {
         // Construct the canvas, and set it to listen for mouse and key events.
         // Also create an array to hold the lines that are displayed on
      setBackground(Color.white);
      currentColorIndex = 0;
      currentBackgroundIndex = 12;
      lines = new ColoredLine[1000];
      addMouseListener(this);
      addMouseMotionListener(this);
      addKeyListener(this);
    }
   
    public void doClearFst() {
    	if (lineCount > 0) {
    		for(int i = 0; i < lineCount; i++)
    			lines[i] = lines[i+1];
    		lineCount --;
    		repaint();
    	}
    }
	public void doClear() {
		if (lineCount > 0) {
	         lines = new ColoredLine[1000];
	         lineCount = 0;
	         repaint();
	      }
	}

	public void doUndo() {
		if (lineCount > 0) {
	         lineCount--;
	         repaint();
	      }
	}

	public void setColorIndex(int c) {
		if (c >= 0 && c < ColoredLine.colorList.length)
	          currentColorIndex = c;		
	}

	public void setBackgroundIndex(int c) {
		if (c >= 0 && c < ColoredLine.colorList.length) {
	          currentBackgroundIndex = c;
	          setBackground(ColoredLine.colorList[c]);
	          repaint();
	       }
	}
	

	   public void paint(Graphics g) {
	         // Redraw all the lines.
	      for (int i = 0; i < lineCount; i++) {
	         int c = lines[i].colorIndex;
	         g.setColor(ColoredLine.colorList[c]);
	         g.drawLine(lines[i].x1,lines[i].y1,lines[i].x2,lines[i].y2);
	      }
	   }
	   
	   
	   
	   public Dimension getPreferredSize() {
	      return new Dimension(500,400);
	   }

   
	@Override
	public void mousePressed(MouseEvent evt) {
		startX = evt.getX();
	    startY = evt.getY();
	    prevX = startX;
	    prevY = startY;
	    dragging = true;
	    gc = getGraphics();  // Get a graphics context for use while drawing.
	    gc.setColor(Color.LIGHT_GRAY);
	    gc.setXORMode(getBackground());
	    gc.drawLine(startX, startY, prevX, prevY);
	
	}
	
	
	int startX, startY;  // When the user presses the mouse button, the location of the mouse is stored in these variables.
    
	int prevX, prevY;    // The most recent mouse location; a rubber band line has been drawn from (startX, startY) to (prevX, prevY).
        
    
	boolean dragging = false;  // For safety, this variable is set to true while a drag operation is in progress.

	Graphics gc;  // While dragging, gc is a graphics context that can be used to 


	@Override
	public void mouseReleased(MouseEvent evt) {
		if (!dragging)  // Make sure that the drag operation has been properly started.
	         return;
	      gc.drawLine(startX,startY,prevX,prevY);  // Erase the previous line.
	      int endX = evt.getX();  // Where the mouse was released.
	      int endY = evt.getY();
	      //System.out.println(endX + " " + endY );
	      gc.setPaintMode();
	      gc.setColor(ColoredLine.colorList[currentColorIndex]);
	      gc.drawLine(startX, startY, endX, endY);  // Draw the permanent line in regular "paint" mode.
	      gc.dispose();  // Free the graphics context, now that the draw operation is over.
	      if (lineCount < lines.length) {  // Add the line to the array, if there is room.
	         lines[lineCount] = new ColoredLine();
	         lines[lineCount].x1 = startX;
	         lines[lineCount].y1 = startY;
	         lines[lineCount].x2 = endX;
	         lines[lineCount].y2 = endY;
	         lines[lineCount].colorIndex = currentColorIndex;
	         lineCount++;
	      }
	}
	
	@Override
	public void mouseDragged(MouseEvent evt) {
		if (!dragging)  
	         return;
	      gc.drawLine(startX,startY,prevX,prevY);  // Erase the previous line.
	      prevX = evt.getX();
	      prevY = evt.getY();
	      gc.drawLine(startX,startY,prevX,prevY);
	}


	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {}


	@Override
	public void keyTyped(KeyEvent e) {}


	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE ) {doClear();}
		if(e.getKeyCode() == KeyEvent.VK_F ) {doClearFst();}
		if(e.getKeyCode() == KeyEvent.VK_B || e.getKeyCode() == KeyEvent.VK_L  ) { doUndo();}
	}

	@Override
	public void keyReleased(KeyEvent e) {}



}
