<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.multi.contactsapp.biz.domain.*"%>
<%@ page import="java.util.*"%>
<%
	List<Contact> contacts = (List<Contact>) request.getAttribute("contacts");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function() {
		var no = document.getElementById("no");
		var f1 = document.getElementById("f1");
		var insert = document.getElementById("insert");
		var update = document.getElementById("update");
		
		insert.onclick = function() {
			no.value= "0";
			f1.submit();
		}
		
		update.onclick = function() {
			f1.action = "update.do";
			f1.submit();
		}
	}
</script>
</head>
<body>
	<div>
		<form id="f1" method="post" action="insert.do">
			번호 : <input type="text" id="no" name="no"/> <br />
			이름 : <input type="text" id="name" name="name"/> <br />
			전화 : <input type="text" id="tel" name="tel"/> <br />
			주소 : <input type="text" id="address" name="address"/> <br />
		</form>
		<button id="insert">연락처 주가</button>
		<button id="update">연락처 변경</button>
	</div>
	<hr />
	<div>
	<%for (Contact c : contacts) {%>
		<div>
		<%= c.getNo() %> : <%= c.getName() %> 
		<%= c.getTel() %>, <%= c.getAddress() %> 
		</div>
	<%}%>
	</div>
</body>
</html>