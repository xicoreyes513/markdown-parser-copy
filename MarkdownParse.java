//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/
//Hello 

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        Parser parser = Parser.builder().build();
        Node node = parser.parse(markdown);
        GetLinksVisitor visitor = new GetLinksVisitor();
        node.accept(visitor);

        return visitor.links;
    }

    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);


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