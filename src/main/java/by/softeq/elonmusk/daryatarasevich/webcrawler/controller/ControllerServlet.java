package by.softeq.elonmusk.daryatarasevich.webcrawler.controller;

import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.BasicCrawler;
import by.softeq.elonmusk.daryatarasevich.webcrawler.logic.WebCrawler;
import by.softeq.elonmusk.daryatarasevich.webcrawler.entity.ResultString;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Controller class.
 *
 * @autor Darya Tarasevich
 */
@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
    /**
     * Method allows the client to read request data,
     * depending on the action command to perform some actions and
     * to write the response data to the Web server.
     *
     * @param request
     * @param response
     * @throws ServletException,IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        int depth = Integer.parseInt(request.getParameter("depth"));
        int pages = Integer.parseInt(request.getParameter("pages"));
        switch (action) {
            case "check": {
                BasicCrawler crawler = new WebCrawler();
                List<ResultString> results = crawler.crawl(request.getParameter("givenurl"), depth, pages);
                request.setAttribute("RESULTS", results);
                request.getRequestDispatcher("/checkedlist").forward(request, response);
            }
            default:
                response.sendRedirect("/index");

        }
    }
}
