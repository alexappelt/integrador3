/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2020-11-11 11:07:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view.produto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1605040588232L));
    _jspx_dependants.put("/WEB-INF/tags/sidebar.tag", Long.valueOf(1605089261226L));
    _jspx_dependants.put("file:/Users/alexappelt/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1604529248486L));
    _jspx_dependants.put("/WEB-INF/tags/headerstart.tag", Long.valueOf(1605038842768L));
    _jspx_dependants.put("jar:file:/Users/alexappelt/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c-1_0.tld", Long.valueOf(1153395882000L));
    _jspx_dependants.put("/WEB-INF/tags/head.tag", Long.valueOf(1605042255842L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:40:08 GMT -->\r\n");
      if (_jspx_meth_tag_005fhead_005f0(_jspx_page_context))
        return;
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
      out.write("\t\t");
      if (_jspx_meth_tag_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Header end ti-comment-alt\r\n");
      out.write("        ***********************************-->\r\n");
      out.write("\r\n");
      out.write("        <!--**********************************\r\n");
      out.write("            Sidebar start\r\n");
      out.write("        ***********************************-->\r\n");
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
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"content-body\" style=\"min-height: 1042px;\">\r\n");
      out.write("\t\t\t<!-- row -->\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
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
      out.write("    <!--**********************************\r\n");
      out.write("        Main wrapper end\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("\r\n");
      out.write("    <!--**********************************\r\n");
      out.write("        Scripts\r\n");
      out.write("    ***********************************-->\r\n");
      out.write("    <!-- Required vendors -->\r\n");
      out.write("    <script src=\"vendor/global/global.min.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/bootstrap-select/dist/js/bootstrap-select.min.js\"></script>\r\n");
      out.write("\t<script src=\"vendor/chart.js/Chart.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"js/custom.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/deznav-init.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Counter Up -->\r\n");
      out.write("    <script src=\"vendor/waypoints/jquery.waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/jquery.counterup/jquery.counterup.min.js\"></script>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!-- Apex Chart -->\r\n");
      out.write("\t<script src=\"vendor/apexchart/apexchart.js\"></script>\t\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Chart piety plugin files -->\r\n");
      out.write("\t<script src=\"vendor/peity/jquery.peity.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- Dashboard 1 -->\r\n");
      out.write("\t<script src=\"js/dashboard/dashboard-1.js\"></script>\r\n");
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
      // /view/produto/lista.jsp(50,2) name = title type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.el.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.el.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.el.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /view/produto/lista.jsp(73,7) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("produto");
      // /view/produto/lista.jsp(73,7) name = items type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems("${produtos}");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t<div class=\"col-xl-3 col-lg-6 col-md-4 col-sm-6\">\r\n");
            out.write("\t\t\t\t\t\t\t\t<div class=\"card\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"new-arrival-product\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"new-arrivals-img-contnent\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<img class=\"img-fluid\"  src= ");
            if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write(" alt=\"\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"new-arrival-content text-center mt-3\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<h4>");
            if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write(' ');
            out.write('-');
            out.write(' ');
            if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</h4>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<ul class=\"star-rating\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-star\"></i></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-star\"></i></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-star\"></i></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-star-half-empty\"></i></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<li><i class=\"fa fa-star-half-empty\"></i></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"price\">R$ ");
            if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</span>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /view/produto/lista.jsp(79,41) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue("${produto.imagem}");
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

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /view/produto/lista.jsp(82,16) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue("${produto.codigo}");
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

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.el.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f2_reused = false;
    try {
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /view/produto/lista.jsp(82,54) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue("${produto.descricao}");
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      _jspx_th_c_005fout_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.el.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f3_reused = false;
    try {
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /view/produto/lista.jsp(90,35) name = value type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue("${produto.valor}");
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      _jspx_th_c_005fout_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f3_reused);
    }
    return false;
  }
}
