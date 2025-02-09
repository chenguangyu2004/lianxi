package BaizhanTest.BallGame;

import java.awt.*;
import javax.swing.*;

public class Ballgame extends JFrame{

    Image desk = Toolkit.getDefaultToolkit().getImage("Images/台球桌.jpg");
    Image ball = Toolkit.getDefaultToolkit().getImage("Images/台球.jpg");

    double x = 100;
    double y = 150;

    double degree = 3.14 / 3;  //弧度



    //boolean right = true; //控制小球移动的水平方向

    //绘制窗口
    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        x = x + 10*Math.cos(degree) ;
        y = y + 10*Math.sin(degree) ;

        //碰到上下边界
        if(y > 300 - 30 - 40||y < 70 ){
             degree = - degree;
        }
        if(x > 500 - 30 - 40||x < 40){
            degree = 3.14 - degree;
        }

        /*if(right){
            x = x + 2;
        }else{
            x = x - 2;
        }

        if(x > 500 - 30 - 40){
            right = false;
        }
        if(x < 40){
            right = true;
        }*/
    }

    //创建窗口
    void launchFrame(){
        setSize(500,300);
        setLocation(100,100);
        setVisible(true);

        //实现动画，每秒绘制动画20次
        while(true){
            repaint();
            try {
                Thread.sleep(40);   //1s = 1000ms,1秒绘制25次。
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

       public static void main(String[] args) {
           System.out.println("我的小游戏开始了。");
           Ballgame game = new Ballgame();
           game.launchFrame();
    }
}
