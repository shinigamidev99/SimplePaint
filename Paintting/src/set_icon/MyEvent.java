/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set_icon;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import view.Main;

/**
 *
 * @author DoThanhDat
 */
public class MyEvent {

    public MyEvent() {

    }

    public void setMyEraser(JPanel m) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("icon\\eraser.png");
        Cursor c = toolkit.createCustomCursor(image, new Point(m.getX() + 5, m.getX() + 30), "img");
        m.setCursor(c);
    }

    public void setMyPen(JPanel m) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("icon\\pen1.png");
        Cursor c = toolkit.createCustomCursor(image, new Point(m.getX() + 5, m.getX() + 30), "img");
        m.setCursor(c);
    }

    public void setMyIconTitle(Main m) {
        Image image = Toolkit.getDefaultToolkit().getImage("icon\\title.png");
        m.setIconImage(image);
    }

    public void setIcon(JButton btnEraser, JButton btnPen, JButton btnShape) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage("icon\\eraser.png");
        Image newimg = image.getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT);
        btnEraser.setIcon(new ImageIcon(newimg));

        image = toolkit.getImage("icon\\pen.png");
        newimg = image.getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT);
        btnPen.setIcon(new ImageIcon(newimg));

        image = toolkit.getImage("icon\\shape.png");
        newimg = image.getScaledInstance(15, 15, java.awt.Image.SCALE_DEFAULT);
        btnShape.setIcon(new ImageIcon(newimg));
    }
}
