import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PerfectNrServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reqUrl = req.getRequestURI();
        String number = reqUrl.substring("/PerfectNumbers/number/".length());

        FindPerfectNr isNrPerfect = new FindPerfectNr();
        boolean result = isNrPerfect.isPerfect(Integer.parseInt(number));
        String json = "{\n";
        json += "\"number\": " + number + "\n";
        json += "\"perfect\": ";
        if(result) {
            json += "true";
        } else {
            json += "false";
        }
        json += "\n" + "}";
        resp.getOutputStream().println(json);
    }
}
