<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String names[]={"first name","second name","third name"};
%>
welcome to jsp <br>

<c_rt:forEach val="test" items="${names}">
    
    ${val}
</c_rt:forEach>
