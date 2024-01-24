/* Custom Panel for medEase 
 * @author Ruddarm
 */
package MedEaseNavigator.MedEaseComponent;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MedPannel extends JPanel {
    public Color BGColorBase, BorderColor, PaintBrushColor, BGColorActive;
    int Radius;
    // Constructor for MedPannelBtn
    /*
     * @param BGColor for Back ground color
     * 
     * @param BorderColor for Border Color
     * 
     * @param height for Height
     * 
     * @param Widtth for width
     * 
     * @param Radius Rounded corner
     * 
     */
    public MedPannel(Color BGColor, Color BorderColor, Color ActiveColor, int height, int width, int Radius) {
        this.BGColorBase = BGColor;
        this.BorderColor = BorderColor;
        this.BGColorActive = ActiveColor;
        this.setSize(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        // super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(PaintBrushColor);
        g2.drawRoundRect(getX(), getY(), getWidth(), getHeight(), Radius, Radius);
    }

    @Override
    protected void paintBorder(Graphics g) {
        // super.paintBorder(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(BorderColor);
        g2.drawRoundRect(getX(), getY(), getWidth(), getHeight(), Radius, Radius);
    }
}
