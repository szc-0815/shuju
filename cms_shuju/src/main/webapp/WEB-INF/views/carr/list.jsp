<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link     href="/css/bootstrap.min.css"   rel="stylesheet"  type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery.min.1.12.4.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script src="/js/checkbox.js"></script>
<script type="text/javascript">
function gotoPage(pageNo){
	$("[name=pageNum]").val(pageNo);
	var data=$("form").serialize();
	$("form").submit();
}

</script>
</head>
<body>
<form action="/car/list" method="post">
  <div class="form-row">
  <input type="hidden" name="pageNum" value="${pageInfo.pageNum }">
    <div class="col">
      <input type="text" class="form-control" placeholder="第一个点" name="jingdu" value="${car.jingdu}">
    </div>
    <div class="col">
      <input type="text" class="form-control" placeholder="第二个点" name="weidu" value="${car.weidu}" >
    </div>
    <div class="col">
      <input type="submit" class="form-control" value="提交"  >
    </div>
  </div>
</form>

<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">车牌号</th>
      <th scope="col">截取时间</th>
      <th scope="col">车型</th>
      <th scope="col">经度</th>
      <th scope="col">纬度</th>
      <th scope="col">距离</th>
    </tr>
  </thead>
  <tbody>
   <c:forEach items="${list}" var="c">
    <tr>
      <th scope="row">${c.id }</th>
      <td>${c.shijian}</td>
      <td>${c.chepai}</td>
      <td>${c.chexing }</td>
      <td>${c.jingdu }</td>
      <td>${c.weidu }</td>
      <td>${c.juli }</td>
    </tr>
   </c:forEach>
    
  </tbody>
  
  
</table>
<jsp:include page="../common/page.jsp"></jsp:include>
</body>
</html>