import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PerfectNrServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reqUrl = req.getRequestURI();
        String number = reqUrl.substring("/PerfectNumbers/number/".length());

        FindPerfectNr isNrPerfect = new FindPerfectNr(Float.parseFloat(number));
        //isNrPerfect.setNumber(Float.parseFloat(number));
        boolean result = isNrPerfect.isPerfect();
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
