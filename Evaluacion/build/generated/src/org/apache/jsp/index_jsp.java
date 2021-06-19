package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("        <title>Index JSP</title>\n");
      out.write("        <link href=\"index.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"paginaDestino.jsp\" method=\"post\">\n");
      out.write("            <p><label for=\"nombre\" >Nombre <br> </label>\n");
      out.write("                <input  type=\"text\" name=\"nombre\" id=\"name\" placeholder=\"Introduce tu nombre\" maxlength=\"45\" required/></p>\n");
      out.write("            <p>\n");
      out.write("                <label>Monto <br> </label>\n");
      out.write("                <input type=\"number\" name=\"monto\" id=\"monto\" placeholder=\"Introduce el monto\" min=\"1\" pattern=\"^[0-9]+\" /> UF</p>            <p>\n");
      out.write("                <label for=\"referencias\">Cuotas (Años) <br></label>\n");
      out.write("                <select name=\"cuotas\" id=\"cuota\">\n");
      out.write("                    <option value=\"null\">Selecciona una</option>\n");
      out.write("                    <option value=\"1\" selected>1</option>\n");
      out.write("                    <option value=\"2\">2</option>\n");
      out.write("                    <option value=\"3\">3</option>\n");
      out.write("                    <option value=\"4\">4</option>\n");
      out.write("                    <option value=\"5\">5</option>\n");
      out.write("                    <option value=\"6\">6</option>\n");
      out.write("                    <option value=\"7\">7</option>\n");
      out.write("                    <option value=\"8\">8</option>\n");
      out.write("                    <option value=\"9\">9</option>\n");
      out.write("                    <option value=\"10\">10</option>\n");
      out.write("                    <option value=\"11\">11</option>\n");
      out.write("                    <option value=\"12\">12</option>\n");
      out.write("                    <option value=\"13\">13</option>\n");
      out.write("                    <option value=\"14\">14</option>\n");
      out.write("                    <option value=\"15\">15</option>\n");
      out.write("                    <option value=\"16\">16</option>\n");
      out.write("                    <option value=\"17\">17</option>\n");
      out.write("                    <option value=\"18\">18</option>\n");
      out.write("                    <option value=\"19\">19</option>\n");
      out.write("                    <option value=\"20\">20</option>\n");
      out.write("                    <option value=\"21\">21</option>\n");
      out.write("                    <option value=\"22\">22</option>\n");
      out.write("                    <option value=\"23\">23</option>\n");
      out.write("                    <option value=\"24\">24</option>\n");
      out.write("                    <option value=\"25\">25</option>\n");
      out.write("                    <option value=\"26\">26</option>\n");
      out.write("                    <option value=\"27\">27</option>\n");
      out.write("                    <option value=\"28\">28</option>\n");
      out.write("                    <option value=\"29\">29</option>\n");
      out.write("                    <option value=\"30\">30</option>\n");
      out.write("                </select>\n");
      out.write("            </p>\n");
      out.write("            <p> Seguro Desgravamen</p>\n");
      out.write("            <input type=\"radio\" name=\"seguro1\" value=\"Degravamen\"checked> \n");
      out.write("            Si\n");
      out.write("            <input type=\"radio\" name=\"seguro1\" value=\"\"> No\n");
      out.write("            <p> Seguro Contra Incendio</p>\n");
      out.write("            <input type=\"radio\" name=\"seguro2\" value=\"Contra Incendio\"checked> \n");
      out.write("            Si\n");
      out.write("            <input type=\"radio\" name=\"seguro2\" value=\"\"> No\n");
      out.write("\n");
      out.write("            <p>\n");
      out.write("                <input type=\"submit\" value=\"Aceptar\" />\n");
      out.write("            </p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
