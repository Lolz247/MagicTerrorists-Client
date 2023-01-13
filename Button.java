import java.awt.*;
public class Button extends Rectangle {
    protected String text;
    protected int fontSize;

    Button(int x, int y, int width, int height, String text, int fontSize) {
        super(x, y, width, height);
        this.text = text;
        this.fontSize = fontSize;
    }
    public void draw(Graphics g) {
        ((Graphics2D)g).setStroke(new BasicStroke(3));
        g.drawRect(this.x, this.y, this.width, this.height);
        g.setFont(FontLoader.getFont(this.fontSize));
    }    
}