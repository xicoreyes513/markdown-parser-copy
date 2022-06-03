import java.util.ArrayList;

import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

 class TryCommonMark {
     public static void main(String[] args) {
         Parser parser = Parser.builder().build();
         Node document = parser.parse("This is *Sparta*");
         HtmlRenderer renderer = HtmlRenderer.builder().build();
         System.out.println(renderer.render(document));  // "<p>This is <em>Sparta</em></p>\n"

        
        Node node = parser.parse("Example\n=======\n\nSome more text");
        WordCountVisitor visitor = new WordCountVisitor();
        node.accept(visitor);
        System.out.println(visitor.wordCount);

        Node node2 = parser.parse("[Link](https://www.youtube.com)");
        GetLinksVisitor visitor2 = new GetLinksVisitor();
        node2.accept(visitor2);
        System.out.println(visitor2.links);
     }
 }

class WordCountVisitor extends AbstractVisitor {
    int wordCount = 0;

    @Override
    public void visit(Text text) {
        // This is called for all Text nodes. Override other visit methods for other node types.

        // Count words (this is just an example, don't actually do it this way for various reasons).
        wordCount += text.getLiteral().split("\\W+").length;

        // Descend into children (could be omitted in this case because Text nodes don't have children).
        visitChildren(text);
    }
}

class GetLinksVisitor extends AbstractVisitor{
    ArrayList<String> links = new ArrayList<>();

    @Override
    public void visit(Link link){
        links.add(link.getDestination());
        visitChildren(link);
    }
}

