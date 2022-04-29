import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition(){
        assertEquals(2, 1 + 1);
    }
    @Test
    public void testfile1() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        Path fileName = Path.of(
            "test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(expected, links);
    }

    @Test
    public void testfile2() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
        Path fileName = Path.of(
            "test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        assertEquals(expected, links);
    }

    @Test
    public void testfile3() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile4() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile5() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile6() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile7() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    @Test
    public void testfile8() throws IOException{
        ArrayList<String> expected =  new ArrayList<String>();
        Path fileName = Path.of(
            "test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }

    // @Test
    // public void testfile9() throws IOException{
    //     ArrayList<String> expected =  new ArrayList<String>();
    //     expected.add("https://something.com");
    //     Path fileName = Path.of(
    //         "/Users/xicoreyes/Documents/GitHub/markdown-parser-copy/test-file9.md");
    //     String content = Files.readString(fileName);
    //     ArrayList<String> links = MarkdownParse.getLinks(content);
    //     assertEquals(expected, links);
    // }
}  