/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2021-12-16 23:56:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertPost_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1638513134000L));
    _jspx_dependants.put("jar:file:/D:/workspace_photofolio/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/photofolio/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
      return;
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
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("        integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("        integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"\r\n");
      out.write("        integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<title>????????? ??????</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            $(\"#header\").load(\"resources/header/header.jsp\");\r\n");
      out.write("            \r\n");
      out.write("         });\r\n");
      out.write("       </script>\r\n");
      out.write("<style>\r\n");
      out.write(" \r\n");
      out.write(" .Wrapper{\r\n");
      out.write(" 	background-color:#ececf8;\r\n");
      out.write(" 	\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("/* ========== ????????? ?????? ========== */\r\n");
      out.write("/* ????????? ?????? ???????????? */\r\n");
      out.write(".insertPostContainer {\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    width: 1600px;\r\n");
      out.write("    border: 1px solid lightgray;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color:white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ?????? row(??????,???) */\r\n");
      out.write(".row {\r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("/* ???????????? ?????? ?????? */\r\n");
      out.write(".btnCategory {\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color: #cfcfcf;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: black;\r\n");
      out.write("    font-weight: 900;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("/* ???????????? ?????? ??????:hover */\r\n");
      out.write(".btnCategory:hover {\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color: #5656c4;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: 900;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("#post_title {\r\n");
      out.write("    width: 98%;\r\n");
      out.write("}\r\n");
      out.write("/* ?????? ?????? */\r\n");
      out.write("#formFile {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("/* ????????????textarea */\r\n");
      out.write("#post_content {\r\n");
      out.write("    width: 98%;\r\n");
      out.write("    resize: none;\r\n");
      out.write("    height: 200px;\r\n");
      out.write("}\r\n");
      out.write("/* ?????? ?????? */\r\n");
      out.write("#btnConfirm {\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color: #5656c4;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: 900;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("/* ?????? ?????? */\r\n");
      out.write("#btnCancel {\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    background-color: rgb(196, 2, 2);\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: 900;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("/* ???????????? ?????? ????????? */\r\n");
      out.write(".clicked {\r\n");
      out.write(" border-radius: 5px;\r\n");
      out.write("    background-color: #5656c4;\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    font-weight: 900;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	  <!-- ======================================== ?????? ======================================== -->\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"Wrapper\">\r\n");
      out.write("        <div id=\"header\"></div>\r\n");
      out.write("\r\n");
      out.write("        <!-- ======================================== ????????? ?????? ?????? ======================================== -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"insertPostContainer mt-5 mb-5\">\r\n");
      out.write("        	<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/insertProc.bo\" method=\"post\" \r\n");
      out.write("        	id=\"insertForm\" enctype=\"multipart/form-data\">\r\n");
      out.write("            <!-- ========== ????????? ?????? ========== -->\r\n");
      out.write("            <div class=\"row d-flex\">\r\n");
      out.write("                <!-- ========== ??????,ID,????????????,????????? -->\r\n");
      out.write("                <div class=\"col-12 d-none\">\r\n");
      out.write("                    <!-- ????????? ?????? -->\r\n");
      out.write("                    <input type=\"text\" id=\"post_no\" name=\"post_no\">\r\n");
      out.write("                    <!-- ????????? -->\r\n");
      out.write("                    <input type=\"text\" id=\"post_writer\" name=\"post_writer\">\r\n");
      out.write("                    <!-- ???????????? ?????? -->\r\n");
      out.write("                    <input type=\"text\" id=\"category_no\" name=\"category_no\" value=\"\">\r\n");
      out.write("                    <!-- ????????? ????????? -->\r\n");
      out.write("                    <!-- <div id=\"post_view\" name=\"post_view\"></div> -->\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-1 d-flex justify-content-center mb-3 mt-3\">\r\n");
      out.write("                    <div><h5>????????????</h5></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-11 mb-3 mt-1\">\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <button type=\"button\" class=\"btnCategory\" id=\"category_no1\" value=\"1\">????????????</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btnCategory\" id=\"category_no2\" value=\"2\">??????</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btnCategory\" id=\"category_no3\" value=\"3\">?????????</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btnCategory\" id=\"category_no4\" value=\"4\">???????????????</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btnCategory\" id=\"category_no5\" value=\"5\">?????????</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btnCategory\" id=\"category_no6\" value=\"6\">??????</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btnCategory\" id=\"category_no7\" value=\"7\">??????</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-1 d-flex justify-content-center mt-1 mb-1\">\r\n");
      out.write("                    <div><h5>??????</h5></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-11 d-flex justify-content-start\">\r\n");
      out.write("                    <input type=\"text\" id=\"post_title\" name=\"post_title\" class=\"form-control\" maxlength=\"40\" placeholder=\"????????? ?????? ????????????\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row d-flex justify-content-start\">\r\n");
      out.write("                <div class=\"col-1 d-flex justify-content-center\">\r\n");
      out.write("                    <div><h5>?????????</h5></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-1 d-flex justify-content-start\">\r\n");
      out.write("                    <div id=\"post_writer_nickname\" name=\"post_writer_nickname\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ========== ????????? ?????? ========== -->\r\n");
      out.write("            <div class=\"row d-flex justify-content-center mt-5\">\r\n");
      out.write("                <div class=\"col-1 d-flex justify-content-center\">\r\n");
      out.write("                    <div><h5>????????????</h5></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-11 d-flex justify-content-start mb-5\">\r\n");
      out.write("                    <div class=\"mb-3\">\r\n");
      out.write("                        <input class=\"form-control\" type=\"file\" id=\"formFile\" name=\"photo_path\"\r\n");
      out.write("                        accept=\"image/*\" onchange=\"readImg(event)\"/>\r\n");
      out.write("                      </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-12 d-flex justify-content-center mb-5\">\r\n");
      out.write("					  <!-- ?????? ???????????? -->\r\n");
      out.write("                    <div id=\"preview\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-1 d-flex justify-content-center\">\r\n");
      out.write("                    <div><h5>????????????</h5></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-11 d-flex justify-content-start\">\r\n");
      out.write("                    <textarea id=\"post_content\" name=\"post_content\" class=\"form-control\" placeholder=\"????????? ?????? ????????????\" value=\"123\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- ========== ????????? ?????? ========== -->\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-6 d-flex justify-content-end\">\r\n");
      out.write("                    <button type=\"button\" id=\"btnConfirm\">??????</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-6 d-flex justify-content-start\">\r\n");
      out.write("                    <button type=\"button\" id=\"btnCancel\">??????</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"\r\n");
      out.write("        integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <!-- ===================================================== ???????????? ?????? ===================================================== -->\r\n");
      out.write("    <script>\r\n");
      out.write("    // ???????????? ?????? ??????\r\n");
      out.write("    $('.btnCategory').on(\"click\",function(){\r\n");
      out.write("       let id_check = $(this).attr(\"value\");\r\n");
      out.write("      $(\"#category_no\").val(id_check);\r\n");
      out.write("      console.log(id_check);\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("      let btnCategory = document.getElementsByClassName(\"btnCategory\");\r\n");
      out.write("       function handleClick(event) {\r\n");
      out.write("         if (event.target.classList[1] === \"clicked\") {\r\n");
      out.write("           event.target.classList.remove(\"clicked\");\r\n");
      out.write("         } else {\r\n");
      out.write("           for (let i = 0; i < btnCategory.length; i++) {\r\n");
      out.write("              btnCategory[i].classList.remove(\"clicked\");\r\n");
      out.write("           }\r\n");
      out.write("           event.target.classList.add(\"clicked\");\r\n");
      out.write("         }\r\n");
      out.write("       }\r\n");
      out.write("       function init() {\r\n");
      out.write("         for (let i = 0; i < btnCategory.length; i++) {\r\n");
      out.write("            btnCategory[i].addEventListener(\"click\", handleClick);\r\n");
      out.write("         }\r\n");
      out.write("       }\r\n");
      out.write("       init();\r\n");
      out.write("    \r\n");
      out.write("       \r\n");
      out.write("    // ????????? ?????? ??????\r\n");
      out.write("    function readImg(event) {\r\n");
      out.write("       let reader = new FileReader();\r\n");
      out.write("       \r\n");
      out.write("       reader.onload = function(e) {\r\n");
      out.write("          let img = document.createElement(\"img\");\r\n");
      out.write("          img.setAttribute(\"src\", e.target.result);\r\n");
      out.write("          document.querySelector(\"div#preview\").appendChild(img);\r\n");
      out.write("       };\r\n");
      out.write("       reader.readAsDataURL(event.target.files[0]);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("     // ????????? ?????? ??????\r\n");
      out.write("     $(\"#btnConfirm\").on(\"click\", function(){\r\n");
      out.write("    	\r\n");
      out.write("         let post_writer = document.getElementById(\"post_writer\");\r\n");
      out.write("         let post_writer_nickname = document.getElementById(\"post_writer_nickname\");\r\n");
      out.write("         let category_no = document.getElementById(\"category_no\");\r\n");
      out.write("         let photo_path = document.getElementById(\"formFile\");\r\n");
      out.write("       let post_title = document.getElementById(\"post_title\")\r\n");
      out.write("       let post_content = document.getElementById(\"post_content\");\r\n");
      out.write("       \r\n");
      out.write("       let fileType = /(.*?)\\.(jpg|jpeg|png|gif|bmp|pdf)$/;\r\n");
      out.write("       let imgFile = $('#formFile').val();\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("         if(post_title.value == \"\") {\r\n");
      out.write("             alert(\"????????? ?????? ????????????.\");\r\n");
      out.write("             return;\r\n");
      out.write("         } else if (photo_path.value == \"\") {\r\n");
      out.write("             alert(\"????????? ?????? ????????????.\");\r\n");
      out.write("             return;\r\n");
      out.write("         }else if (!imgFile.match(fileType)) {\r\n");
      out.write("             alert(\"????????? ???????????? ?????? ????????????\");\r\n");
      out.write("             return;\r\n");
      out.write("         }else if (post_content.value == \"\") {\r\n");
      out.write("             alert(\"????????? ?????? ????????????.\");\r\n");
      out.write("             return;\r\n");
      out.write("         }else if(category_no.value == \"\"){\r\n");
      out.write("        	 alert(\"??????????????? ??????????????????.\")\r\n");
      out.write("        	 return;\r\n");
      out.write("         }\r\n");
      out.write("         $(\"#insertForm\").submit();\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("     // ????????????(?????????)\r\n");
      out.write("     $(\"#btnCancel\").on(\"click\", function(){\r\n");
      out.write("         location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/toUserPage.bo?currentPage=1\";\r\n");
      out.write("     });\r\n");
      out.write("\r\n");
      out.write("     $(document).ready(function() {\r\n");
      out.write("		    getNickname();\r\n");
      out.write("		});\r\n");
      out.write("     \r\n");
      out.write("   //????????? ajax??? ??????\r\n");
      out.write("		function getNickname() {\r\n");
      out.write("		    $.ajax({\r\n");
      out.write("		        type: \"get\",\r\n");
      out.write("		        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/selectNN.mem\",\r\n");
      out.write("		        dataType: \"json\"\r\n");
      out.write("		    }).done(function(rs) {\r\n");
      out.write("		        if(!(rs == \"fail\")) {\r\n");
      out.write("		        	 let nickname = rs\r\n");
      out.write("		        	 console.log(nickname);\r\n");
      out.write("         \r\n");
      out.write("                     $(\"#post_writer_nickname\").append(nickname); \r\n");
      out.write("		                \r\n");
      out.write("		            \r\n");
      out.write("		        } else {\r\n");
      out.write("		            console.log(\"?????? ??????\");\r\n");
      out.write("		        }\r\n");
      out.write("		    }).fail(function(e) {\r\n");
      out.write("		        console.log(e);\r\n");
      out.write("		    });\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		// ????????? ???????????? ?????? ?????? ??????\r\n");
      out.write("	    function readInputFile(e){\r\n");
      out.write("	        let sel_files = [];\r\n");
      out.write("	        \r\n");
      out.write("	        sel_files = [];\r\n");
      out.write("	        $('#preview').empty();\r\n");
      out.write("	        \r\n");
      out.write("	        let files = e.target.files;\r\n");
      out.write("	        let fileArr = Array.prototype.slice.call(files);\r\n");
      out.write("	        let index = 0;\r\n");
      out.write("	        \r\n");
      out.write("	        fileArr.forEach(function(f){\r\n");
      out.write("	           if(!f.type.match(\"image/*\")){\r\n");
      out.write("	               alert(\"????????? ???????????? ????????? ???????????????.\");\r\n");
      out.write("	                return;\r\n");
      out.write("	            };\r\n");
      out.write("	            if(files.length < 2){\r\n");
      out.write("	               sel_files.push(f);\r\n");
      out.write("	                let reader = new FileReader();\r\n");
      out.write("	                reader.onload = function(e){\r\n");
      out.write("	                   let html = `<a id=img_id_");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${index}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("><img src=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${e.target.result}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" data-file=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${f.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" /></a>`;\r\n");
      out.write("	                    $('previewreview').append(html);\r\n");
      out.write("	                    index++;\r\n");
      out.write("	                };\r\n");
      out.write("	                reader.readAsDataURL(f);\r\n");
      out.write("	            }\r\n");
      out.write("	        })\r\n");
      out.write("	    }\r\n");
      out.write("	    $('#formFile').on('change',readInputFile);\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
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
