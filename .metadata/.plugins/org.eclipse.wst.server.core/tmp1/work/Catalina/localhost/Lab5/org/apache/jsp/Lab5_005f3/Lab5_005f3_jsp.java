/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-10-25 02:35:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Lab5_005f3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Lab5_005f3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Lab5_3.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\">\r\n");
      out.write("<title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"page\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<div class=\"form\" id=\"form\">\r\n");
      out.write("				<div class=\"form__container\" id=\"container-1\">\r\n");
      out.write("					<h2 class=\"form__title\">Account</h2>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form__container__input\">\r\n");
      out.write("						<div class=\"form__group\" style=\"margin-top: 0;\">\r\n");
      out.write("							<i class=\"fa-solid fa-user\" style=\"color: #b9b9b9;\"></i> <input\r\n");
      out.write("								type=\"text\" id=\"fullname\" placeholder=\"Full Name\">\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"form__group\" style=\"margin: 12px 0;\">\r\n");
      out.write("							<i class=\"fa-solid fa-envelope\" style=\"color: #b9b9b9;\"></i> <input\r\n");
      out.write("								type=\"email\" id=\"email\" placeholder=\"Email Address\">\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"form__group\">\r\n");
      out.write("							<i class=\"fa-solid fa-key fa-rotate-270\" style=\"color: #b9b9b9;\"></i>\r\n");
      out.write("							<input type=\"password\" id=\"password\" placeholder=\"Password\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"form__container\" id=\"container-2\">\r\n");
      out.write("					<div class=\"form__container__2--left\">\r\n");
      out.write("						<h2 class=\"form__title\">Date of Birth</h2>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"form__container__input\">\r\n");
      out.write("							<div class=\"form__group\">\r\n");
      out.write("								<input type=\"number\" placeholder=\"DD\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form__group\">\r\n");
      out.write("								<input type=\"text\" min=\"01\" max=\"12\" placeholder=\"MM\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form__group\">\r\n");
      out.write("								<input type=\"text\" placeholder=\"YYYY\">\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form__container__2--right\">\r\n");
      out.write("						<h2 class=\"form__title\">Gender</h2>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"form__container__input\">\r\n");
      out.write("							<div class=\"form__group\">\r\n");
      out.write("								<span>Male</span>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form__group\">\r\n");
      out.write("								<span>Female</span>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"form__container\" id=\"container-3\">\r\n");
      out.write("					<h2 class=\"form__title\">Payment Details</h2>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form__container__input\">\r\n");
      out.write("						<div class=\"method__payment\">\r\n");
      out.write("							<div class=\"form__group\">\r\n");
      out.write("								<i class=\"fa-brands fa-cc-visa\"></i> <span>Credit Card</span>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form__group\">\r\n");
      out.write("								<i class=\"fa-brands fa-cc-paypal\"></i> <span>Paypal</span>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"form__group\" style=\"margin: 12px 0;\">\r\n");
      out.write("							<i class=\"fa-regular fa-credit-card\" style=\"color: #b9b9b9;\"></i>\r\n");
      out.write("							<input type=\"number\" placeholder=\"Card Number\">\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						<div class=\"cvc__number\">\r\n");
      out.write("							<div class=\"form__group\" style=\"margin-right: 5px;\">\r\n");
      out.write("								<i class=\"fa-solid fa-user\" style=\"color: #b9b9b9;\"></i> <input\r\n");
      out.write("									type=\"number\" placeholder=\"Card CVC\">\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<div class=\"form__group\"\r\n");
      out.write("								style=\"margin-left: 5px; display: flex; justify-content: left;\">\r\n");
      out.write("								<div class=\"cvc__date\">\r\n");
      out.write("									<input type=\"date\" name=\"\" id=\"\" style=\"height: 29px;\">\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"form__footer\">\r\n");
      out.write("					<h2 class=\"form__title\">Terms and Conditions</h2>\r\n");
      out.write("					<div>\r\n");
      out.write("						<input type=\"checkbox\">\r\n");
      out.write("						<p>I accept the terms and conditions for signing up to this\r\n");
      out.write("							service, and hereby confirm I have read the privacy policy.</p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	var elementGenderBox = document\r\n");
      out.write("			.querySelectorAll(\".form__container__2--right .form__group\")\r\n");
      out.write("\r\n");
      out.write("	function chooseGender() {\r\n");
      out.write("		elementGenderBox.forEach(function(value, index) {\r\n");
      out.write("			value.onclick = function() {\r\n");
      out.write("				if (index == 0) {\r\n");
      out.write("					elementGenderBox[index + 1].classList.remove(\"active\");\r\n");
      out.write("				} else {\r\n");
      out.write("					elementGenderBox[index - 1].classList.remove(\"active\");\r\n");
      out.write("				}\r\n");
      out.write("				value.classList.toggle('active');\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	var elementMethodPaymentBox = document\r\n");
      out.write("			.querySelectorAll(\".method__payment .form__group\");\r\n");
      out.write("\r\n");
      out.write("	function chooseMethodPayment() {\r\n");
      out.write("		elementMethodPaymentBox.forEach(function(value, index) {\r\n");
      out.write("			value.onclick = function() {\r\n");
      out.write("				if (index == 0) {\r\n");
      out.write("					elementMethodPaymentBox[index + 1].classList\r\n");
      out.write("							.remove(\"active\");\r\n");
      out.write("				} else {\r\n");
      out.write("					elementMethodPaymentBox[index - 1].classList\r\n");
      out.write("							.remove(\"active\");\r\n");
      out.write("				}\r\n");
      out.write("				value.classList.toggle('active');\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	chooseGender();\r\n");
      out.write("	chooseMethodPayment();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
