/* A extended version of Jbutton 
 * @author Ruddarm
 */
package MedEaseNavigator.MedEaseComponent;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class MedEaseBtn extends JButton {

    public Color Background, ActiveColor, PaintBrushColor, BorderColor;
    public int Radius;

    /*
     * Public Construtor to Create MedEaseBtn
     * 
     * @param BGColor backgrond Color for Button
     * 
     * @Param Radius Background Color for Button
     * 
     * @Param BorderColor Border Color for Button
     */
    public MedEaseBtn(Color BGColor, Color BorderColor, Color ActiveColor, int Radius) {
        this.Background = this.PaintBrushColor = BGColor;
        this.BorderColor = BorderColor;
        this.ActiveColor = ActiveColor;
        this.Radius = Radius;

    }

    @Override
    protected void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        Graphics2D g2 = (Graphics2D) g;
        // super.paintComponent(g);
        g2.setColor(PaintBrushColor);
        g2.drawRoundRect(getX(), getY(), getWidth(), getHeight(), Radius, Radius);

    }

    @Override
    protected void paintBorder(Graphics g) {
        // TODO Auto-generated method stub
        // super.paintBorder(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(BorderColor);
        g2.drawRoundRect(getX(), getY(), getWidth(), getHeight(), Radius, Radius);

    }
}