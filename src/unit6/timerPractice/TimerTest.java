package unit6.timerPractice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author zhyee
 * @date 2018/6/27 下午10:06
 */
public class TimerTest {

    public static void main(String[] args) {
        ActionListener timerPrinter = new TimerPrinter();
        Timer t = new Timer(1000,timerPrinter);

        t.start();
        JOptionPane.showMessageDialog(null,"quit?");
        System.exit(0);

    }

}

/**
 * 实现ActionListener类，定义任务
 */
class TimerPrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("the time is "+LocalDateTime.now());
        Toolkit.getDefaultToolkit().beep();
    }
}
