/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.72
 * Generated at: 2022-01-06 12:46:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportPopup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.js\"\r\n");
      out.write("	integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<title>신고하기</title>\r\n");
      out.write("<style>\r\n");
      out.write("* {\r\n");
      out.write("	box-sizing: border-box;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("div {\r\n");
      out.write("	/* border:1px solid lightgray */\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("/* 신고 전체 컨테인너 */\r\n");
      out.write(".reportContainer {\r\n");
      out.write("	width: 700px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".reportTitleBox {\r\n");
      out.write("	background-color: #5656c4;\r\n");
      out.write("	color: white;\r\n");
      out.write("	padding: 0%;\r\n");
      out.write("	margin-top: 0%;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	height: 60px;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bodyBox {\r\n");
      out.write("	margin: auto;\r\n");
      out.write("}\r\n");
      out.write("/* 라디오박스 COL*/\r\n");
      out.write(".radioBox {\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("/* 신고 라디오박스 버튼 */\r\n");
      out.write("\r\n");
      out.write("/* 신고내용_기타(textarea) */\r\n");
      out.write("#report_content {\r\n");
      out.write("	resize: none;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	height: 150px;\r\n");
      out.write("	overflow: scroll;\r\n");
      out.write("}\r\n");
      out.write("/* 신고하기 버튼 */\r\n");
      out.write("#btnReport {\r\n");
      out.write("	width: 100px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	background-color: red;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	border: none;\r\n");
      out.write("}\r\n");
      out.write("/* 팝업창 닫기 버튼 */\r\n");
      out.write("#btnCancel {\r\n");
      out.write("	width: 100px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	background-color: gray;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border-radius: 5px;\r\n");
      out.write("	border: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"reportContainer form-control mt-2\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"row reportTitleBox\">\r\n");
      out.write("			<!-- 신고팝업창 제목 -->\r\n");
      out.write("			<div class=\"col-12\">\r\n");
      out.write("				<h3>Report</h3>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- 신고내용 경고문 -->\r\n");
      out.write("		<div class=\"row mt-2\">\r\n");
      out.write("			<div class=\"col-12\">\r\n");
      out.write("				이 글이 이용규칙 위반으로 운영진에 의해 삭제되어야 마땅하다고 생각 된다면 신고해주세요 신고 3회 이상의 들을 삭제 될 수\r\n");
      out.write("				있으며 이용규칙에 위배되는 들을 여러 차례 게시하여 신고를 많이 받은 회원은 제한 조치가 취해집니다. <br>\r\n");
      out.write("				신고는 반대의견을 표시하는 기능이 아닙니다. 글 작성자의 의견을 반대할 경우 신고할수 없습니다. 신고에 부적합한 글을\r\n");
      out.write("				지속적으로 신고하는 회원 에게는 제한 조치가 취해질 수 있습니다.\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- 신고 타입, 내용 -->\r\n");
      out.write("		<form id=\"reportForm\" method=\"post\">\r\n");
      out.write("			<div class=\"row bodyBox form-control mt-3 ml-3\">\r\n");
      out.write("				<div class=\"col-12 radioBox p-3\">\r\n");
      out.write("					<p>\r\n");
      out.write("						<input type=\"radio\" class=\"report\" name=\"report_content_no\"\r\n");
      out.write("							value=\"1\" checked=\"checked\" />부적절한 언행 사용(욕설, 성적 발언, 정치, 종교 혐오 발언\r\n");
      out.write("						등)\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<input type=\"radio\" class=\"report\" name=\"report_content_no\"\r\n");
      out.write("							value=\"2\" />유해한 컨텐츠 사용(광고, 거짓정보, 자극적인 컨텐츠)\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<input type=\"radio\" class=\"report\" name=\"report_content_no\"\r\n");
      out.write("							value=\"3\" />따돌림 혹은 괴롭힘\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<input type=\"radio\" class=\"report\" name=\"report_content_no\"\r\n");
      out.write("							value=\"4\" />지적 재산권 침해\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<input type=\"radio\" class=\"report\" name=\"report_content_no\"\r\n");
      out.write("							value=\"5\" />저작권 침해\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<input type=\"radio\" name=\"report_content_no\" id=\"etcReport\"\r\n");
      out.write("							value=\"6\" />기타\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-12\">\r\n");
      out.write("					<textarea id=\"report_content\" name=\"report_content\"\r\n");
      out.write("						placeholder=\"신고내용을 입력 해주세요.\" readonly></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- 신고타입, 신고자, 신고내용, 게시글번호, 댓글번호, 댓글내용 번호 -->\r\n");
      out.write("				<div class=\"d-none\">\r\n");
      out.write("					<input type=\"text\" name=\"reported_post_no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${post_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<input type=\"text\" name=\"report_type\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${report_type}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("					<input type=\"text\" name=\"reported_comment_no\"\r\n");
      out.write("						value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reported_comment_no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</form>\r\n");
      out.write("\r\n");
      out.write("		<!-- 신고버튼 -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-6 d-flex justify-content-end mt-3\">\r\n");
      out.write("				<button type=\"button\" id=\"btnReport\">신고하기</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col-6 d-flex justify-content-start mt-3\">\r\n");
      out.write("				<button type=\"button\" id=\"btnCancel\">닫기</button>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<script>\r\n");
      out.write("		// 기타 라디오박스 클릭시 textarea 활성		\r\n");
      out.write("		$(\"input:radio[id=etcReport]\").click(function(e) {\r\n");
      out.write("			console.log(e.target);\r\n");
      out.write("			$(\"#report_content\").attr(\"readonly\", false);\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		// 다른 라디오박스 클릭시 textarea 비활성\r\n");
      out.write("		$(\"input:radio[class=report]\").click(function(e) {\r\n");
      out.write("			console.log(e.target);\r\n");
      out.write("			$(\"#report_content\").val(\"\");\r\n");
      out.write("			$(\"#report_content\").attr(\"readonly\", true);\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		// 신고하기 버튼 클릭시 처리\r\n");
      out.write("		$(\"#btnReport\").on(\"click\", function() {\r\n");
      out.write("			let data = $(\"#reportForm\").serialize(); // 댓글 form 안의 데이터 직렬화\r\n");
      out.write("			console.log(data);\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type : \"post\",\r\n");
      out.write("				url : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reportProc.re\",\r\n");
      out.write("				data : data\r\n");
      out.write("			// 신고 하기 성공시	\r\n");
      out.write("			}).done(function(rs) {\r\n");
      out.write("				if (rs == \"success\") {\r\n");
      out.write("					alert(\"신고가 등록 되었습니다.\");\r\n");
      out.write("					window.close();\r\n");
      out.write("				} else if (rs == \"fail\") {\r\n");
      out.write("					alert(\"신고 등록에 실패 했습니다.\");\r\n");
      out.write("				}\r\n");
      out.write("			// 신고 하기 실패시	\r\n");
      out.write("			}).fail(function(e) {\r\n");
      out.write("				console.log(e);\r\n");
      out.write("				alert(\"신고 등록에 실패 했습니다.\");\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		// 신고팝업창 닫기 버튼 클릭시\r\n");
      out.write("		$(\"#btnCancel\").on(\"click\",function(){\r\n");
      out.write("			self.close();\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		// 신고 리스트 출력(리스틑 관리자 페이지 에서 출력) \r\n");
      out.write("		\r\n");
      out.write("	</script>\r\n");
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
