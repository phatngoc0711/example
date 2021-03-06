package vn.myclass.web.logic.controller.admin;


import vn.myclass.core.dto.ListenGuidelineDTO;
import vn.myclass.core.service.ListenGuidelineService;
import vn.myclass.core.service.impl.ListenGuidelineServiceImpl;
import vn.myclass.core.web.utils.RequestUtil;
import vn.myclass.web.logic.command.ListenGuidelineCommand;
import vn.myclass.web.logic.common.WebConstant;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/admin-guideline-listen-list.html")
public class ListenGuidelineController extends HttpServlet {
    private ListenGuidelineService guidelineService = new ListenGuidelineServiceImpl();
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        ListenGuidelineCommand command = new ListenGuidelineCommand();
        command.setMaxPageItems(2);
        RequestUtil.initSearchBean(request,command);
        Object[] objects = guidelineService.findListenGuidelineByProperties(null,null,command.getSortExpression(), command.getSortDirection(),command.getFirstItem(),command.getMaxPageItems());
        command.setListResult((List<ListenGuidelineDTO>) objects[1]);
        command.setTotalItems(Integer.parseInt(objects[0].toString()));
        request.setAttribute(WebConstant.LIST_ITEMS, command);

        RequestDispatcher rd = request.getRequestDispatcher("/common/views/admin/listenguideline/list.jsp");
        rd.forward(request, response);

    }
    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
