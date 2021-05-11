import java.awt.*;

import java.awt.event.*;

import java.applet.*;

public class MEAppletAnonymous extends Applet implements MouseListener

{

public void init()

{

add MouseListener(new MouseAdapter()
{
 public void mouseclicked(MouseEvent me);

{

setBackground(colour.yellow);

repaint();

}
}

}

public void mouseclicked(MouseEvent me)

{

setBackground(colour.yellow);

repaint();

}

public void mouseEntered(MouseEvent me)

{

setBackground(colour.red);

repaint();

}

public void mouseexcited(MouseEvent me)

{

setBackground(colour.green);

repaint();

}

public void mousePressed(MouseEvent me)

{

}

public void mouseReleased(MouseEvent me)

{

}

}