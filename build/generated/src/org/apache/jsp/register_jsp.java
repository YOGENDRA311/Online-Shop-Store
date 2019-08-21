package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>REGISTER</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"style1.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style1.css\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"loginbox\">\n");
      out.write("            <img src=\"man.png\" class=\"user\">\n");
      out.write("            <h2> SIGN UP HERE </h2>\n");
      out.write("            <form action=\"regis.jsp\">\n");
      out.write("                <p>Email</p>\n");
      out.write("                <input type=\"text\" name=\"uname\" placeholder=\"Enter Email\">\n");
      out.write("                <p>Password</p>\n");
      out.write("                <input type=\"password\" name=\"pass\" placeholder=\"Enter Password\"> \n");
      out.write("                <p>Mobile_No</p>\n");
      out.write("                <input type=\"text\" name=\"mob\" placeholder=\"Enter mobile number\">\n");
      out.write("                <p>Address</p>\n");
      out.write("                <input type=\"text\" name=\"add\" placeholder=\"Enter Address\">\n");
      out.write("                 <input type=\"submit\" name=\"\" value=\"sign Up\"></form>\n");
      out.write("                 <a href=\"index.jsp\">Already Have An Account?</a>\n");
      out.write("                \n");
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
