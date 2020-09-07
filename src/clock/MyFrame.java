package clock;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {


    JFrame frame = new JFrame();
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    MyFrame() {


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("The Clock and Date");
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setSize(350, 200);
        frame.setResizable(false);
        frame.setBackground(Color.BLACK);
        frame.setForeground(new Color(0x00FF00));
//        frame.setOp

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat(("dd MMMM yyyy"));

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        timeLabel.setForeground(new Color(0x00FF00));


        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Arial", Font.PLAIN, 35));
        dayLabel.setForeground(new Color(0x00FF00));

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        dateLabel.setForeground(new Color(0x00FF00));

        frame.add(timeLabel);
        frame.add(dayLabel);
        frame.add(dateLabel);
        frame.setVisible(true);

        setTime();
    }

    public void setTime(){
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
