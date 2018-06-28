package unit6.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author zhyee
 * @date 2018/6/28 上午10:53
 */
public class innerClassTest {

    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(10000,true);
        talkingClock.start();
        JOptionPane.showMessageDialog(null,"quit?");
        System.exit(0);
    }
}

class TalkingClock{

    private int interval;

    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener actionListener = new TimerPrinter();
        Timer timer = new Timer(interval,actionListener);
        timer.start();

    }


    /**
     * 内部类可以去访问外部的域
     */
    public class TimerPrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("the time is " + LocalDateTime.now());
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }

}



