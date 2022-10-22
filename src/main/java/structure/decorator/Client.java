package structure.decorator;

public class Client {

    public static void main(String[] args) {

        TextNode n1 = new SpanNode();

        TextNode n2 = new BoldDecorator(new SpanNode());

        n1.setText("Hello");

        n2.setText("World");

        System.out.println(n1.getText());

        System.out.println(n2.getText());
    }
}
