
package Laboratorio;
import java.applet.Applet;
import java.awt.*;

public class LaboratorioApplet extends Applet
{
    public final int FIGUREHEIGHT = 280;
    public final int FIGUREWIDTH  = 445;

    /**
     *
     * @param micarro
     */
    @Override
	public void paint(Graphics micarro)
	{
            Color ROJO = new Color(182, 100, 110);
            Color NEGROGRIS = new Color(150, 70, 80);
            Color CELESTE = new Color(35, 206, 255);
            Color ORO = new Color(240, 220, 0);
            
            
            micarro.setColor(Color.white);
            micarro.fillRect(0, 0, FIGUREWIDTH, FIGUREHEIGHT);
            
            //Dibujamos los 2 ovalos para que sean las llantas
            micarro.setColor(Color.black);
            micarro.fillOval(20, 170, 100, 100);
            micarro.setColor(Color.white);
            micarro.fillOval(30, 180, 80, 80);
            micarro.setColor(Color.black);
            micarro.drawOval(40, 190, 60, 60);

            micarro.setColor(Color.black);
            micarro.fillOval(270, 170, 100, 100);
            micarro.setColor(Color.white);
            micarro.fillOval(280, 180, 80, 80);
            micarro.setColor(Color.black);
            micarro.drawOval(290, 190, 60, 60);
            
            //Dibujamos el chasis del vehiculo
            micarro.setColor(NEGROGRIS);
            micarro.fillRect(10, 113, 122, 12);
            micarro.setColor(ROJO);
            micarro.fillRect(10, 123, 122, 82);

            micarro.setColor(ORO);
            micarro.fillOval(10, 105, 10, 10);

            micarro.setColor(CELESTE);
            micarro.fillRect(130, 15, 130, 100);
            
            micarro.setColor(ROJO);
            micarro.fillRect(130, 113, 130, 92);

            micarro.setColor(ROJO);
            micarro.fillRect(258, 15, 122, 190);

            micarro.setColor(ROJO);
            micarro.fillRect(378, 80, 57, 125);

            micarro.setColor(NEGROGRIS);
            micarro.fillRect(118, 205, 154, 10);

            micarro.setColor(Color.black);
            micarro.drawLine(131, 15, 110, 30);
            micarro.drawLine(131, 16, 110, 31);
            micarro.drawLine(131, 17, 110, 32);

            micarro.setColor(Color.black);
            micarro.drawLine(145, 125, 170, 125);
            micarro.drawLine(145, 124, 170, 124);
            micarro.drawLine(145, 123, 170, 123);
	}
}
