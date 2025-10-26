import ua.opnu.view.DrawFrame;
import javax.swing.SwingUtilities;


public class Main {
    public static void main(String[] args) {
        // Створюємо та показуємо головне вікно 
        // у безпечному для Swing потоці
        SwingUtilities.invokeLater(() -> new DrawFrame("Draw App"));
    }
}