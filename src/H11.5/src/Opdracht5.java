import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet {

    public void paint(Graphics g) {
        setBackground(Color.pink);
        int teller;
        int x = 40;
        int y = 40;

        for(teller = 0; teller < 5; teller++) {

            y += 20;
            g.drawRect(20, 20, y);

        }

    }



}

