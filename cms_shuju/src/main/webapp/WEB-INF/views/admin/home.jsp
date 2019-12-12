<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link     href="<%=request.getContextPath() %>/css/index3.css"   rel="stylesheet"  type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cms后台登录</title>
</head>
<body>
	
		<!-- 头信息 -->
	<jsp:include page="../common/admin/head.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row" style="margin-top: 15px;">
			  <div class="col-3">
			  	<!-- 左侧导航 -->
			    <jsp:include page="../common/admin/left.jsp"></jsp:include>
			  </div>
			  <div class="col-9">
			    <div class="tab-content" id="v-pills-tabContent">
				  
			  </div>
			</div>
		</div>
	</div>
<script type="text/javascript" src="js/jquery.min.1.12.4.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/cms.js"></script>
</body>
</html>