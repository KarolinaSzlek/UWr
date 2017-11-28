package grafika;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


/**
 * @author radoslaw
 *
 */
public class SimpleDrawProgram extends Frame implements ActionListener {
	
	

	SimpleDrawCanvasWithFiles canvas;  // This is where the drawing is actually done.
                            			// This frame displays this canvas along with a menu bar.
	@SuppressWarnings("deprecation")
	public SimpleDrawProgram() {
        // Constructor.  Create the menus and the canvas, and add them to the
        // frame.  Set the frames' size and location, and show it on the screen.

     super("Simple Draw");

     Menu fileMenu = new Menu("File",true);  
     fileMenu.add("");
     fileMenu.add("Clear First Line");
     fileMenu.add("Clear");
     fileMenu.add("Undo");   
     fileMenu.addSeparator();   
     fileMenu.add("Quit");
     fileMenu.addActionListener(this);

     Menu colorMenu = new Menu("Line Color",true);
     colorMenu.add("Black");
     colorMenu.add("Gray");
     colorMenu.add("Red");
     colorMenu.add("Green");
     colorMenu.add("Blue");
     colorMenu.add("Dark Red");
     colorMenu.add("Dark Green");
     colorMenu.add("Dark Blue");
     colorMenu.add("Cyan");
     colorMenu.add("Magenta");
     colorMenu.add("Yellow");
     colorMenu.add("Brown");
     colorMenu.add("White");
     colorMenu.addActionListener(this);
     
     Menu backgroundMenu = new Menu("Background Color",true);
     backgroundMenu.add("Background Black");
     backgroundMenu.add("Background Gray");
     backgroundMenu.add("Background Red");
     backgroundMenu.add("Background Green");
     backgroundMenu.add("Background Blue");
     backgroundMenu.add("Background Dark Red");
     backgroundMenu.add("Background Dark Green");
     backgroundMenu.add("Background Dark Blue");
     backgroundMenu.add("Background Cyan");
     backgroundMenu.add("Background Magenta");
     backgroundMenu.add("Background Yellow");
     backgroundMenu.add("Background Brown");
     backgroundMenu.add("Background White");
     backgroundMenu.addActionListener(this);
     
     MenuBar mb = new MenuBar();
     mb.add(fileMenu);
     mb.add(colorMenu);
     mb.add(backgroundMenu);
     
     setMenuBar(mb);
     
     canvas = new SimpleDrawCanvasWithFiles();
     add("Center",canvas);
     
     addWindowListener(
           new WindowAdapter() {  // Window listener object closes the window and ends the
                                  //   program when the user clicks the window's close box.
              public void windowClosing(WindowEvent evt) {
                 dispose();
                 System.exit(0);
              }
           }
       );
     
     pack();
     show();

  } 
  
  public void actionPerformed(ActionEvent evt) { //actionhandler

     String command = evt.getActionCommand();

     if (command.equals("Quit")) {
         dispose();  // Close the window, then end the program.
         System.exit(0);
     }
     else if (command.equals("Clear First Line"))
    	 canvas.doClearFst();
     else if (command.equals("Clear"))
         canvas.doClear();
     else if (command.equals("Undo"))
         canvas.doUndo();
         
     else if (command.equals("Black"))   // Drawing colors.
         canvas.setColorIndex(0);
     else if (command.equals("Gray"))
         canvas.setColorIndex(1);
     else if (command.equals("Red"))
         canvas.setColorIndex(2);
     else if (command.equals("Green"))
         canvas.setColorIndex(3);
     else if (command.equals("Blue"))
         canvas.setColorIndex(4);
     else if (command.equals("Dark Red"))
         canvas.setColorIndex(5);
     else if (command.equals("Dark Green"))
         canvas.setColorIndex(6);
     else if (command.equals("Dark Blue"))
         canvas.setColorIndex(7);
     else if (command.equals("Cyan"))
         canvas.setColorIndex(8);
     else if (command.equals("Magenta"))
         canvas.setColorIndex(9);
     else if (command.equals("Yellow"))
         canvas.setColorIndex(10);
     else if (command.equals("Brown"))
         canvas.setColorIndex(11);
     else if (command.equals("White"))
         canvas.setColorIndex(12);
         
     else if (command.equals("Background Black"))  // Background colors.
         canvas.setBackgroundIndex(0);
     else if (command.equals("Background Gray"))
         canvas.setBackgroundIndex(1);
     else if (command.equals("Background Red"))
         canvas.setBackgroundIndex(2);
     else if (command.equals("Background Green"))
         canvas.setBackgroundIndex(3);
     else if (command.equals("Background Blue"))
         canvas.setBackgroundIndex(4);
     else if (command.equals("Background Dark Red"))
         canvas.setBackgroundIndex(5);
     else if (command.equals("Background Dark Green"))
         canvas.setBackgroundIndex(6);
     else if (command.equals("Background Dark Blue"))
         canvas.setBackgroundIndex(7);
     else if (command.equals("Background Cyan"))
         canvas.setBackgroundIndex(8);
     else if (command.equals("Background Magenta"))
         canvas.setBackgroundIndex(9);
     else if (command.equals("Background Yellow"))
         canvas.setBackgroundIndex(10);
     else if (command.equals("Background Brown"))
         canvas.setBackgroundIndex(11);
     else if (command.equals("Background White"))
         canvas.setBackgroundIndex(12);

  } 
  

} 
	

