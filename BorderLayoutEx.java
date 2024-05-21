import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame {
    public BorderLayoutEx() {
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 컨텐트판에 BorderLayout 배치 관리자 설정
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
        contentPane.add(new JButton("add"), BorderLayout.NORTH);
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"), BorderLayout.EAST);
        contentPane.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200); // 프레임 크기 300 x200 설정
        setVisible(true); // 화면에 프레임 출력
    }

    public static void main(String[] args) {
        new BorderLayoutEx();
    }
}