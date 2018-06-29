package unit6.innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

/**
 * @author zhyee
 * @date 2018/6/29 下午10:09
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        OtherTalkingClock clock = new OtherTalkingClock();
        clock.start(1000,true);

        JOptionPane.showMessageDialog(null,"quit?");
        System.exit(0);
    }
}

/**
 * 使用匿名内部类的方式实现接口
 */
class OtherTalkingClock {
    public void start(int interval, final boolean beep) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("the time is "+ LocalDateTime.now());
                if(beep){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        };

        Timer t  = new Timer(interval,actionListener);
        t.start();
    }
}
