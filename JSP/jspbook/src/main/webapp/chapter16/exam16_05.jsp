<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="chapter16.dbconnect" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="300" border="1">
	<tr>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
	</tr>
	
	<%
		Connection conn = chapter16.dbconnect.DBconn();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try{
			String sql = "select * from member";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String pw = rs.getString("passwd");
				String name = rs.getString("name");
		%>
		<tr>
			<td><%=id %></td>
			<td><%=pw %></td>
			<td><%=name %></td>
		</tr>
		<%
			}
		}catch(Exception e){}
		finally{
			if(rs!=null){
				rs.close();
			}
			if(pstmt !=null){
				pstmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}
		%>
			
		
	
	
	</table>

	
</body>
</html>