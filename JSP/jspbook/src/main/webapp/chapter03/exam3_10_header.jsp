<%@ page contentType="text/html; charset=UTF-8"%>


<%! 
	int pagecount =0;
	void addcount(){
		pagecount++;
	}
%>
<%
	addcount();
	%>
	<p>이 사이트의 방문은 <%=pagecount%>번째 입니다