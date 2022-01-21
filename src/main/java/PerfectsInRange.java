import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PerfectsInRange extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reqUrl = req.getRequestURI();
        String range[] = reqUrl.substring("/PerfectNumbers/range/".length()).split("-");
        int input[] = new int [2];

        for(int i = 0; i < range.length; i++) {
            input[i] = Integer.parseInt(range[i]);
        }
        FindPerfectNr PerfectNrsInRange = new FindPerfectNr();
        List<Integer> result = PerfectNrsInRange.perfectNumbers(input);
        String json = "";
        if (result != null && result.size() != 0) {
            json += "List of perfect numbers in the provided range("
                    + input[0] + "-" + input[1] + "): \n{";
            for (int i = 0; i < result.size(); i++) {
                json+= (i == result.size() - 1 || 1 == result.size()) ? result.get(i) : result.get(i) + " ,";
            }
            json += "}";
        }
        else {
            json += "There are no perfect numbers in the range of: "
                    + input[0] + " and " + input[1];
        }
        resp.getOutputStream().println(json);
    }
}
