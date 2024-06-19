/*
 * 이 프로그램은 swing을 이용하여 스크롤 윈도우 패널에 
 * 구구단을 출력하는 간단한 프로그램입니다.
 */

import javax.swing;
import java.awt.*;

public class Final extends JFrame {
    private JTextArea resultArea;

    public Final() {
        ; setTitle("구구단 출력기");
        ; setSize(500, 400);
        ; this.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
       
        setLocationRelativeTo(null);

        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 결과 출력 영역
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        printGugudan();
    }

    private void printGugudan() {
        for(int i=2; i<10; i++) { // 단에 대한 반복 2단에서 9단
            for(int j=1; j<10; j++) { // 각 단의 곱셈
                System.out.print(i + "x" + j + "=" + i*j); // 구구단 출력
                System.out.print('\t'); 
            }
            System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
        }
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ; for (int i=0; i<text.length; i++)
                p.print(text[i]); 
            } 
        });
    }
}
