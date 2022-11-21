import java.awt.*;
import javax.swing.JFrame;

public class board extends Canvas {

    public void paint(Graphics g) {
        int x = 0;
        int y = 0;
        final int tile_width = 80;
        final int tile_height = 80;
        for (int rank = 0; rank < 8; rank++) {
            for (int file = 0; file < 8; file++) {
                boolean isLightSquare = (rank + file) % 2 == 0;
                if (isLightSquare) {
                    g.setColor(Color.white);
                } else
                    g.setColor(Color.black);
                g.fillRect(x, y, tile_width, tile_height);
                x += 80;
            }
            x = 0;
            y += 80;
        }
    }

    public static void main(String[] args) {
        board m = new board();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(700, 800);
        // f.setLayout(null);
        f.setVisible(true);
    }
}
