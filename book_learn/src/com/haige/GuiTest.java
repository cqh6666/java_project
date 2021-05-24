package book_learn.src.com.haige;

import javax.swing.*;
import java.awt.*;


public class GuiTest{
    //坐标
    int pointX =70, pointY =70;

    public static void main(String[] args) {
        GuiTest gt = new GuiTest();
        gt.go();
    }

    public void go(){
        JFrame frame = new JFrame();

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++){
            pointX++;
            pointY++;

            drawPanel.repaint();

            try {
                Thread.sleep(50);

            }catch (Exception ex){

            }
        }
    }

    class MyDrawPanel extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.green);
            g.fillOval(pointX, pointY, 40, 40);
        }
    }

}
