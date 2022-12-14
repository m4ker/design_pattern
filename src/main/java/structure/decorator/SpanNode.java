package structure.decorator;

import org.w3c.dom.Text;

public class SpanNode implements TextNode {

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return "<span>" + text + "</span>";
    }
}
