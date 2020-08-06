package builder.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlBuilder extends Builder {
    private String _filename;
    private PrintWriter _writer;

    @Override
    public String result() {
        return _filename;
    }


    @Override
    protected void buildTitle(String title) {
        _filename = title + ".html";
        try {
            _writer = new PrintWriter(new FileWriter(_filename));
        }catch (IOException e) {
            e.printStackTrace();
        }
        _writer.println("<html>");
        _writer.println("<head><title>" + title + "</title></head>");
        _writer.println("<body>");
        _writer.println("<h1>" + title + "</h1>");
    }


    @Override
    protected void buildString(String str) {
        _writer.println("<p>" + str + "</p>");
    }


    @Override
    protected void buildItems(String[] items) {
        _writer.println("<ul>");
        for(String item: items) {
            _writer.println("<li>" + item + "</li>");
        }
        _writer.println("</ul>");
    }


    @Override
    protected void buildDone() {
        _writer.println("</body></html>");
        _writer.close();
    }

}
