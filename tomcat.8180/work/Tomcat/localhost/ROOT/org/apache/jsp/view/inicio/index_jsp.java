/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2020-12-04 03:19:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.inicio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1607051946172L));
    _jspx_dependants.put("/WEB-INF/tags/sidebar.tag", Long.valueOf(1606709250000L));
    _jspx_dependants.put("/WEB-INF/tags/scripts.tag", Long.valueOf(1605677420000L));
    _jspx_dependants.put("file:/C:/Users/Guilherme/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1603757402545L));
    _jspx_dependants.put("/WEB-INF/tags/headerstart.tag", Long.valueOf(1605782864000L));
    _jspx_dependants.put("/WEB-INF/tags/head.tag", Long.valueOf(1606175826000L));
    _jspx_dependants.put("jar:file:/C:/Users/Guilherme/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153395882000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:40:08 GMT -->\r\n");
      if (_jspx_meth_tag_005fhead_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <!--*******************\r\n");
      out.write("        Preloader start\r\n");
      out.write("    ********************-->\r\n");
      out.write("    <div id=\"preloader\">\r\n");
      out.write("        <div class=\"sk-three-bounce\">\r\n");
      out.write("            <div class=\"sk-child sk-bounce1\"></div>\r\n");
      out.write("            <div class=\"sk-child sk-bounce2\"></div>\r\n");
      out.write("            <div class=\"sk-child sk-bounce3\"></div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--*******************\r\n");
      out.write("        Preloader end\r\n");
      out.write("    ********************-->\r\n");
      out.write("\r\n");
      out.write("    <!--**********************************\r\n");
      out.write("        Main wrapper start\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("    <div id=\"main-wrapper\">\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Nav header start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t\t");
      if (_jspx_meth_tag_005fheaderstart_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Nav header end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Chat box start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Chat box End\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Header start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_tag_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Header end ti-comment-alt\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Sidebar start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tag_005fsidebar_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Sidebar end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("            Content body start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"content-body\" style=\"min-height: 1042px;\">\r\n");
      out.write("\t\t\t<!-- row -->\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h1>Painel Inicial</h1>\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<!-- **********INICIO TOTAL PEDIDOS  -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-3 col-xxl-3 col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-stat card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media ai-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"mr-3 bgl-primary text-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <i class=\"ti-user\"></i> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<svg width=\"36\" height=\"28\" viewBox=\"0 0 36 28\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M31.75 6.75H30.0064L30.2189 4.62238C30.2709 4.10111 30.2131 3.57473 30.0493 3.07716C29.8854 2.57959 29.6192 2.12186 29.2676 1.73348C28.9161 1.3451 28.4871 1.03468 28.0082 0.822231C27.5294 0.609781 27.0114 0.500013 26.4875 0.5H7.0125C6.48854 0.500041 5.9704 0.609864 5.49148 0.822391C5.01256 1.03492 4.58348 1.34543 4.23189 1.73392C3.88031 2.12241 3.61403 2.58026 3.45021 3.07795C3.28639 3.57564 3.22866 4.10214 3.28075 4.6235L5.2815 24.6224C5.31508 24.9222 5.38467 25.2168 5.48875 25.5H1.75C1.41848 25.5 1.10054 25.6317 0.866116 25.8661C0.631696 26.1005 0.5 26.4185 0.5 26.75C0.5 27.0815 0.631696 27.3995 0.866116 27.6339C1.10054 27.8683 1.41848 28 1.75 28H31.75C32.0815 28 32.3995 27.8683 32.6339 27.6339C32.8683 27.3995 33 27.0815 33 26.75C33 26.4185 32.8683 26.1005 32.6339 25.8661C32.3995 25.6317 32.0815 25.5 31.75 25.5H28.0115C28.1154 25.2172 28.1849 24.9229 28.2185 24.6235L28.881 18H31.75C32.7442 17.9989 33.6974 17.6035 34.4004 16.9004C35.1035 16.1974 35.4989 15.2442 35.5 14.25V10.5C35.4989 9.50577 35.1035 8.55258 34.4004 7.84956C33.6974 7.14653 32.7442 6.75109 31.75 6.75ZM9.0125 25.5C8.70243 25.501 8.40314 25.3862 8.17327 25.1782C7.9434 24.9701 7.79949 24.6836 7.76975 24.375L5.7685 4.37575C5.75109 4.20188 5.7703 4.0263 5.82488 3.86031C5.87946 3.69432 5.96821 3.5416 6.0854 3.412C6.2026 3.28239 6.34564 3.17877 6.50532 3.10781C6.665 3.03685 6.83777 3.00013 7.0125 3H26.4875C26.6622 3.00012 26.8349 3.03681 26.9945 3.10772C27.1541 3.17863 27.2972 3.28218 27.4143 3.4117C27.5315 3.54123 27.6203 3.69386 27.6749 3.85977C27.7295 4.02568 27.7488 4.20119 27.7315 4.375L25.7308 24.3762C25.7007 24.6848 25.5566 24.971 25.3267 25.1788C25.0967 25.3867 24.7975 25.5012 24.4875 25.5H9.0125ZM33 14.25C32.9998 14.5815 32.868 14.8993 32.6337 15.1337C32.3993 15.368 32.0815 15.4998 31.75 15.5H29.1311L29.7561 9.25H31.75C32.0815 9.2502 32.3993 9.38196 32.6337 9.61634C32.868 9.85071 32.9998 10.1685 33 10.5V14.25Z\" fill=\"#2F4CDD\"></path></svg>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"mb-0 text-black\"><span class=\"counter ml-0\"> <h3>");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("</h3></span></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"mb-0\">Total de Pedidos</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<small>Dados Diários</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- **********FIM TOTAL PEDIDOS  -->\r\n");
      out.write("\t\t\t\t\t<!-- **********INICIO TOTAL FATURAMENTO DIARIO  -->\r\n");
      out.write("\t\t\t\t\t<div class=\"col-xl-3 col-xxl-3 col-lg-6 col-md-6 col-sm-6\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"widget-stat card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body p-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"media ai-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"mr-3 bgl-primary text-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<!-- <i class=\"ti-user\"></i> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<svg width=\"20\" height=\"36\" viewBox=\"0 0 20 36\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\"><path d=\"M19.08 24.36C19.08 25.64 18.76 26.8667 18.12 28.04C17.48 29.1867 16.5333 30.1467 15.28 30.92C14.0533 31.6933 12.5733 32.1333 10.84 32.24V35.48H8.68V32.24C6.25333 32.0267 4.28 31.2533 2.76 29.92C1.24 28.56 0.466667 26.84 0.44 24.76H4.32C4.42667 25.88 4.84 26.8533 5.56 27.68C6.30667 28.5067 7.34667 29.0267 8.68 29.24V19.24C6.89333 18.7867 5.45333 18.32 4.36 17.84C3.26667 17.36 2.33333 16.6133 1.56 15.6C0.786667 14.5867 0.4 13.2267 0.4 11.52C0.4 9.36 1.14667 7.57333 2.64 6.16C4.16 4.74666 6.17333 3.96 8.68 3.8V0.479998H10.84V3.8C13.1067 3.98667 14.9333 4.72 16.32 6C17.7067 7.25333 18.5067 8.89333 18.72 10.92H14.84C14.7067 9.98667 14.2933 9.14667 13.6 8.4C12.9067 7.62667 11.9867 7.12 10.84 6.88V16.64C12.6 17.0933 14.0267 17.56 15.12 18.04C16.24 18.4933 17.1733 19.2267 17.92 20.24C18.6933 21.2533 19.08 22.6267 19.08 24.36ZM4.12 11.32C4.12 12.6267 4.50667 13.6267 5.28 14.32C6.05333 15.0133 7.18667 15.5867 8.68 16.04V6.8C7.29333 6.93333 6.18667 7.38667 5.36 8.16C4.53333 8.90667 4.12 9.96 4.12 11.32ZM10.84 29.28C12.28 29.12 13.4 28.6 14.2 27.72C15.0267 26.84 15.44 25.7867 15.44 24.56C15.44 23.2533 15.04 22.2533 14.24 21.56C13.44 20.84 12.3067 20.2667 10.84 19.84V29.28Z\" fill=\"#2F4CDD\"></path></svg>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<h3 class=\"mb-0 text-black\"> <span> R$ </span> <span class=\"counter ml-0\"> ");
      if (_jspx_meth_c_005fout_005f1(_jspx_page_context))
        return;
      out.write("</span></h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<p class=\"mb-0\">Total de Faturamento</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<small>Dados Diários</small>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- **********FIM TOTAL FATURAMENTO DIARIO  -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Content body end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Footer start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Footer end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--**********************************\r\n");
      out.write("           Support ticket button start\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("           Support ticket button end\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!--**********************************\r\n");
      out.write("        Main wrapper end\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("\r\n");
      out.write("    <!--**********************************\r\n");
      out.write("        Scripts\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("    <!-- Required vendors -->\r\n");
      out.write("   ");
      if (_jspx_meth_tag_005fscripts_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:41:37 GMT -->\r\n");
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

  private boolean _jspx_meth_tag_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:head
    org.apache.jsp.tag.web.head_tag _jspx_th_tag_005fhead_005f0 = new org.apache.jsp.tag.web.head_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fhead_005f0);
    try {
      _jspx_th_tag_005fhead_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fhead_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fhead_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fheaderstart_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:headerstart
    org.apache.jsp.tag.web.headerstart_tag _jspx_th_tag_005fheaderstart_005f0 = new org.apache.jsp.tag.web.headerstart_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fheaderstart_005f0);
    try {
      _jspx_th_tag_005fheaderstart_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fheaderstart_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fheaderstart_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fheader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:header
    org.apache.jsp.tag.web.header_tag _jspx_th_tag_005fheader_005f0 = new org.apache.jsp.tag.web.header_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fheader_005f0);
    try {
      _jspx_th_tag_005fheader_005f0.setJspContext(_jspx_page_context);
      // /view/inicio/index.jsp(53,1) name = title type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
      _jspx_th_tag_005fheader_005f0.setTitle("");
      _jspx_th_tag_005fheader_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fheader_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fsidebar_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:sidebar
    org.apache.jsp.tag.web.sidebar_tag _jspx_th_tag_005fsidebar_005f0 = new org.apache.jsp.tag.web.sidebar_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fsidebar_005f0);
    try {
      _jspx_th_tag_005fsidebar_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fsidebar_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fsidebar_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /view/inicio/index.jsp(90,70) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue("${qntdpedidos}");
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /view/inicio/index.jsp(109,85) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue("${faturamento}");
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fscripts_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:scripts
    org.apache.jsp.tag.web.scripts_tag _jspx_th_tag_005fscripts_005f0 = new org.apache.jsp.tag.web.scripts_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fscripts_005f0);
    try {
      _jspx_th_tag_005fscripts_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fscripts_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fscripts_005f0);
    }
    return false;
  }
}
