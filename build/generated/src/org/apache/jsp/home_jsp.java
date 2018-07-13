package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import tres.domain.Users;
import tres.dao.impl.UserImpl;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<title>Tress</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"templete/css/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"templete/css/fontMin.css\">\n");
      out.write("<link rel='stylesheet' href='templete/css/google.css'>\n");
      out.write("<link rel=\"stylesheet\" href=\"templete/css/cssTheme.css\">\n");
      out.write("    <link rel=\"shortcut icon\" HREF=\"images/favicon.icon\" />\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"dataTables/js/jQuery.js\"></script>   \n");
      out.write("        <link rel=\"stylesheet\" href=\"Bootstrap-v1/datepicker/css/bootstrap.min_1.css\" type=\"text/css\"/>\n");
      out.write("        <script src=\"Bootstrap-v1/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("html,body,h1,h2,h3,h4,h5 {font-family: \"Open Sans\", sans-serif}\n");
      out.write("</style>\n");
      out.write("<body class=\"w3-theme-l5\">\n");
      out.write("\n");
      out.write("<!-- Navbar -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write(" <div class=\"w3-bar w3-theme-d3 w3-left-align w3-large\">\n");
      out.write("  <a class=\"w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-theme-d2\" href=\"javascript:void(0);\" onclick=\"openNav()\"><i class=\"\"></i></a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large w3-theme-d4\"><i class=\"glyphicon glyphicon-home fa fa-home w3-margin-right\"></i></a>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <a href=\"patientRegistrationForm\" class=\"w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white\" title=\"Hese some title\"><i class=\"glyphicon glyphicon-pencil\"></i></a>\n");
      out.write(" \n");
      out.write("  <a href=\"javascript:void(0)\"  data-toggle=\"modal\" data-target=\".bs-example-modal-lg\" class=\"w3-bar-item w3-button w3-hide-small w3-right w3-padding-large w3-hover-white\" title=\"Login if you have account\">\n");
      out.write("   Login\n");
      out.write("  </a>\n");
      out.write(" </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Navbar on small screens -->\n");
      out.write("<div id=\"navDemo\" class=\"w3-bar-block w3-theme-d2 w3-hide w3-hide-large w3-hide-medium w3-large\">\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 1</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 2</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">Link 3</a>\n");
      out.write("  <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-large\">My Profile</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Page Container -->\n");
      out.write("<div class=\"w3-container w3-content\" style=\"max-width:1400px;margin-top:80px\"> \n");
      out.write("    \n");
      out.write("        <!-- Middle Column -->\n");
      out.write("    <div class=\"w3-col m6\">\n");
      out.write("    \n");
      out.write("      <div class=\"w3-row-padding\">\n");
      out.write("        <div class=\"w3-col m12\">\n");
      out.write("          <div class=\"w3-card w3-round w3-white\">\n");
      out.write("            <div class=\"w3-container w3-padding\">\n");
      out.write("             <img style=\"border-radius:5px;\" class=\"img-responsive\" width=\"400\" src=\"UploadImage/herat.jpg\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("     \n");
      out.write("    <!-- End Middle Column -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col m6\">\n");
      out.write("           ");

             
             UserImpl userImpl = new UserImpl();
           Users us = new Users();
           userImpl.createTable();
                String message = "";
                message = request.getParameter("msg");
                if (message == null) {

                    message = "";
                }
                String message2 = "";
                
                message2 = request.getParameter("msg2");
                if (message2 == null) {

                    message2 = "";
                }
            
      out.write("\n");
      out.write("            <span class=\"text-danger\" id=\"uname error\">");
      out.print(message);
      out.write("</span>\n");
      out.write("            <span class=\"text-success\" id=\"sucussesmsg\">");
      out.print(message2);
      out.write("</span>\n");
      out.write("      <div class=\"w3-row-padding\">\n");
      out.write("        <div class=\"w3-col m12\">\n");
      out.write("          <div class=\"w3-card w3-round w3-white\">\n");
      out.write("              <div class=\"w3-container w3-padding\" style=\"height: 412px\">\n");
      out.write("            <div class=\"col-md-5\">\n");
      out.write("                                   <h3>How we are </h3>\n");
      out.write("                                   <img src=\"UploadImage/doctors_icons.jpg\">\n");
      out.write("                               </div>\n");
      out.write("                  <br>\n");
      out.write("                               <div class=\"col-md-5\">\n");
      out.write("                                          <p>Some Text Some TextSome TextSome TextSome TextSome TextSome TextSome TextSome Text\n");
      out.write("                                          Some TextSome TextSome TextSome TextSome TextSome TextSome TextSome TextSome TextSome Text\n");
      out.write("                                          Some TextSome TextSome TextSome TextSome TextSome TextSome TextSome TextSome TextSome Text</p>\n");
      out.write("                                          <a href=\"welcome\" class=\"btn btn-primary btn-xlg btn-block glyphicon glyphicon-pencil \">Apply Service <b><span style=\"background-color: red;color: white\" class=\"badge\"></span></b></a>\n");
      out.write("                               </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("     \n");
      out.write("    <!-- End Middle Column -->\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<div class=\"modal fade bs-example-modal-lg\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"mySmallModalLabel\">\n");
      out.write("                <div class=\"modal-dialog modal-lg\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"panel panel-info\" >\n");
      out.write("                            <!-- Default panel contents -->\n");
      out.write("                            <div class=\"panel-heading\"><center><span class=\"glyphicon glyphicon-lock\"></span>Provide your Account Credentials to Login</center></div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write(" <form method=\"post\" action=\"LoginController\">\n");
      out.write("                                    <div style=\"display:none\"> <input id=\"lat\" name=\"lat\" type=\"text\" />\n");
      out.write("                                        <input id=\"long\" name=\"long\"  type=\"text\" /></div>\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label for=\"todate\" class=\"col-md-2 col-sm-2 col-xs-6 control-label\" style=\"color: black\">User Name</label>\n");
      out.write("                                        <div class=\"col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("                                            <input value=\"\"   id=\"userName\" name=\"userName\" autocomplete=\"off\" type=\"text\"  class=\"form-control\"  style=\"color: black\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <span class=\"text-danger\" id=\"err\"></span>\n");
      out.write("                                    </div>    \n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label for=\"todate\" class=\"col-md-2 col-sm-2 col-xs-6 control-label\" style=\"color: black\">Password</label>\n");
      out.write("                                        <div class=\"col-md-4 col-sm-4 col-xs-4\">\n");
      out.write("                                            <input  id=\"password\" name=\"password\" type=\"password\"  class=\"form-control\"  style=\"color: black\" required/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <span class=\"text-danger\" id=\"err\"></span>\n");
      out.write("                                    </div> \n");
      out.write("\n");
      out.write("                                    <div class=\"form-group row\">\n");
      out.write("                                        <label for=\"todate\" class=\"col-md-2 col-sm-2 col-xs-6  control-label\"></label>\n");
      out.write("                                        <div class=\"col-sm-4\">\n");
      out.write("                                            <input type=\"submit\"  value=\"Log In\" class=\"btn btn-info btn-xlg btn-block\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <span class=\"text-danger\" id=\"customeordererror\"></span>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("       \n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("               \n");
      out.write("          \n");
      out.write("                 \n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("<!-- End Page Container -->\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"w3-container w3-theme-d5\">\n");
      out.write("    <center><p style=\"font-size: 20pt\">Tress Templet<a href=\"#\">@Tress 2018</a></p></center>\n");
      out.write("</footer>\n");
      out.write(" \n");
      out.write("<script>\n");
      out.write("// Accordion\n");
      out.write("function myFunction(id) {\n");
      out.write("    var x = document.getElementById(id);\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("        x.previousElementSibling.className += \" w3-theme-d1\";\n");
      out.write("    } else { \n");
      out.write("        x.className = x.className.replace(\"w3-show\", \"\");\n");
      out.write("        x.previousElementSibling.className = \n");
      out.write("        x.previousElementSibling.className.replace(\" w3-theme-d1\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Used to toggle the menu on smaller screens when clicking on the menu button\n");
      out.write("function openNav() {\n");
      out.write("    var x = document.getElementById(\"navDemo\");\n");
      out.write("    if (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("        x.className += \" w3-show\";\n");
      out.write("    } else { \n");
      out.write("        x.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html> \n");
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
