/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.39
 * Generated at: 2020-11-11 10:07:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
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

  private javax.servlet.jsp.JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public void setJspContext(javax.servlet.jsp.JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(this, ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public javax.servlet.jsp.JspContext getJspContext() {
    return this.jspContext;
  }

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
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    return _jsp_instancemanager;
  }

  private void _jspInit(javax.servlet.ServletConfig config) {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(config.getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(config);
  }

  public void _jspDestroy() {
  }

  public void doTag() throws javax.servlet.jsp.JspException, java.io.IOException {
    javax.servlet.jsp.PageContext _jspx_page_context = (javax.servlet.jsp.PageContext)jspContext;
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest) _jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse) _jspx_page_context.getResponse();
    javax.servlet.http.HttpSession session = _jspx_page_context.getSession();
    javax.servlet.ServletContext application = _jspx_page_context.getServletContext();
    javax.servlet.ServletConfig config = _jspx_page_context.getServletConfig();
    javax.servlet.jsp.JspWriter out = jspContext.getOut();
    _jspInit(config);
    jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,jspContext);

    try {
      out.write("<div class=\"deznav\">\n");
      out.write("    <div class=\"deznav-scroll\">\n");
      out.write("        <ul class=\"metismenu\" id=\"menu\">\n");
      out.write("            <!-- INICIO ITEM DIRETO -->\n");
      out.write("            <li><a href=\"/inicio\" class=\"ai-icon\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"flaticon-381-settings-2\"></i>\n");
      out.write("                <span class=\"nav-text\">Inicio</span>\n");
      out.write("            </a>\n");
      out.write("            </li>\n");
      out.write("            <!-- FIM ITEM DIRETO -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- PRODUTOS -->\n");
      out.write("            <li><a class=\"has-arrow ai-icon\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"flaticon-381-networking\"></i>\n");
      out.write("                <span class=\"nav-text\">Produtos</span>\n");
      out.write("            </a>\n");
      out.write("                <ul aria-expanded=\"false\">\n");
      out.write("                    <li><a href=\"/produto\">Cadastro Produtos</a></li>\n");
      out.write("                    <li><a href=\"/listarprodutos\">Lista de Produtos</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- FIM PRODUTOS -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- CARDAPIO -->\n");
      out.write("            <li><a class=\"has-arrow ai-icon\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"flaticon-381-networking\"></i>\n");
      out.write("                <span class=\"nav-text\">Cardapios</span>\n");
      out.write("            </a>\n");
      out.write("                <ul aria-expanded=\"false\">\n");
      out.write("                    <li><a href=\"/cardapio\">Cadastro Cardapio</a></li>\n");
      out.write("                    <li><a href=\"/listarcardapio\">Lista de Cardapios</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- FIM CARDAPIO -->\n");
      out.write("\n");
      out.write("            <!-- FILIAL -->\n");
      out.write("\n");
      out.write("            <li><a class=\"has-arrow ai-icon\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"flaticon-381-networking\"></i>\n");
      out.write("                <span class=\"nav-text\">Filial</span>\n");
      out.write("            </a>\n");
      out.write("                <ul aria-expanded=\"false\">\n");
      out.write("                    <li><a href=\"/filial\">Cadastro Filial</a></li>\n");
      out.write("                    <li><a href=\"/listarfilial\">Lista de Filiais</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- FIM FILIAL -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- USUARIO -->\n");
      out.write("\n");
      out.write("            <li><a class=\"has-arrow ai-icon\" href=\"javascript:void()\" aria-expanded=\"false\">\n");
      out.write("                <i class=\"flaticon-381-networking\"></i>\n");
      out.write("                <span class=\"nav-text\">Usuario</span>\n");
      out.write("            </a>\n");
      out.write("                <ul aria-expanded=\"false\">\n");
      out.write("                    <li><a href=\"/usuario\">Cadastro Usuario</a></li>\n");
      out.write("                    <li><a href=\"/listarusuario\">Lista de Usuarios</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- FIM USUARIO -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>");
    } catch( java.lang.Throwable t ) {
      if( t instanceof javax.servlet.jsp.SkipPageException )
          throw (javax.servlet.jsp.SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof java.lang.IllegalStateException )
          throw (java.lang.IllegalStateException) t;
      if( t instanceof javax.servlet.jsp.JspException )
          throw (javax.servlet.jsp.JspException) t;
      throw new javax.servlet.jsp.JspException(t);
    } finally {
      jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,super.getJspContext());
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}