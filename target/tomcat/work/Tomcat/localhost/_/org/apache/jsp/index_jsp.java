/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-01-12 13:30:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Retail Application Demo</title>\r\n");
      out.write("<script type=\"text/javascript\">  \r\n");
      out.write("function login(thisform)  {\r\n");
      out.write("\tvar name = thisform.username.value;\r\n");
      out.write("\tvar pwd = thisform.password.value;\r\n");
      out.write("\tvar flag = false;\r\n");
      out.write("\t\r\n");
      out.write("\tif(name == \"Demo\")\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(pwd == \"password=1\")\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tflag = true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(!flag)\r\n");
      out.write("\t\talert (\"Please enter valid username/password... Demo user: Demo/password=1\");\r\n");
      out.write("\t\r\n");
      out.write("\treturn flag;\r\n");
      out.write("   \r\n");
      out.write("}  \r\n");
      out.write("      </script> \r\n");
      out.write("      \r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".diralign\r\n");
      out.write("{\r\n");
      out.write("\twidth:400px;\r\n");
      out.write("\theight:150px;\r\n");
      out.write("\tborder:2px solid blue;\r\n");
      out.write("\tbackground-color:#AABBEA;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tright:200px;\r\n");
      out.write("\tleft:480px;\r\n");
      out.write("\ttop:80px;\r\n");
      out.write("\tbottom:500px;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("}\r\n");
      out.write(".dirlogo\r\n");
      out.write("{\r\n");
      out.write("\twidth:100px;\r\n");
      out.write("\theight:100px;\r\n");
      out.write("\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tright:10px;\r\n");
      out.write("\tleft:900px;\r\n");
      out.write("\ttop:200px;\r\n");
      out.write("\tbottom:50px;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("}\r\n");
      out.write(".dirlogo1\r\n");
      out.write("{\r\n");
      out.write("\twidth:100px;\r\n");
      out.write("\theight:300px;\r\n");
      out.write("\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("\tright:10px;\r\n");
      out.write("\tleft:60px;\r\n");
      out.write("\ttop:10px;\r\n");
      out.write("\tbottom:1400px;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#121212\">\r\n");
      out.write("<form name=\"main\" action=\"search.jsp\" method=\"POST\" onsubmit=\"return login(this);\">\r\n");
      out.write("<font face=\"book antiqua\">\r\n");
      out.write("\r\n");
      out.write("<div style=\"width:1400px;height:120px;border:2px solid blue;background-color:#459DEA;position:relative;\">\r\n");
      out.write("<table><tr>\r\n");
      out.write("<td>\r\n");
      out.write("</td><td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("<h1 align=\"center\"> &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("ABC RETAIL STORE\r\n");
      out.write("&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("</h1>\r\n");
      out.write("</td><td>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\r\n");
      out.write("<img src=\"acoe.png\" style=\"width:200px;height:50px\">\r\n");
      out.write("</td>\r\n");
      out.write("</tr></table>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"diralign\">\r\n");
      out.write("<br>\r\n");
      out.write("<table align=\"center\">\r\n");
      out.write("<tr><td></td><td>\r\n");
      out.write("<label>New User!!! - </label><a href=\"index.jsp\">Register</a></td></tr>\r\n");
      out.write("\r\n");
      out.write("<tr><td>\r\n");
      out.write("<label>Username</label></td><td>\r\n");
      out.write("<input type=\"text\" size=\"15\" name=\"username\"></input></td></tr>\r\n");
      out.write("<tr><td>\r\n");
      out.write("<label>Password</label></td><td>\r\n");
      out.write("<input type=\"password\" size=\"15\" name=\"password\"></input></td></tr>\r\n");
      out.write("<tr><td></td><td>\r\n");
      out.write("<input type=\"submit\" value=\"Login\"></input></td></tr>\r\n");
      out.write("</table></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</font></form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
