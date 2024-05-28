import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
    public InnerClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener()); // Action 이벤트 리스너 달기
        c.add(btn);

        setSize(200, 120);
        setVisible(true);
    }

    // 내부 클래스로 이벤트 리스너 작성
    private class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource(); // 이벤트 소스 버튼 알아내기
            if(b.getText().equals("Action")) // 버튼의 문자열이 Action인지 비교
               b.setText("액션"); // 버튼의 문자열을 액션으로 변경
            else 
                b.setText("Action");

            // InnerClassListener의 멤버나 JFrame의 멤버 호출
            setTitle(b.getText());
        }
    }

    public static void main(String [] args) {
        new InnerClassListener();
    }
}