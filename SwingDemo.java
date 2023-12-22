import javax.swing.*;
class SwingDemo {
    SwingDemo() {
        JFrame jframe = new JFrame("Swing application");
        jframe.setSize(275,100);
        JLabel jlabel = new JLabel(" Hello World ");
        jframe.add(jlabel);
        jframe.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new SwingDemo();
            }
        });
    }
}