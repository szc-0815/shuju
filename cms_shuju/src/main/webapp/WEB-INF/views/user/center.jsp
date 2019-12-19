<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人中心</title>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<link href="/css/cms.css" rel="stylesheet">
<!-- <link href="/public/css/index.css" rel="stylesheet"> -->

<link rel="stylesheet" href="/kindeditor/themes/default/default.css" />
<link rel="stylesheet" href="/kindeditor/plugins/code/prettify.css" />
<script charset="utf-8" src="/kindeditor/kindeditor-all-min.js"></script>
<script charset="utf-8" src="/kindeditor/lang/zh-CN.js"></script>
<script charset="utf-8" src="/kindeditor/plugins/code/prettify.js"></script>

<script>
	KindEditor.ready(function(K) {});
</script>
</head>
<body>
	<!-- 头信息 -->
	<jsp:include page="../common/user/head.jsp"></jsp:include>
	<div class="container-fluid">
		<div class="row offset-1" style="margin-top: 15px;">
			  <div class="col-2">
			  	<!-- 左侧导航 -->
			    <jsp:include page="../common/user/left.jsp"></jsp:include>
			  </div>
			  <div class="col-8">
			    <div class="tab-content" id="v-pills-tabContent">
				  
			  	</div>
			</div>
		</div>
	</div>
<script type="text/javascript" src="/js/jquery.min.1.12.4.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/cms.js"></script>
<script type="text/javascript" src="/js/ajaxfileupload.js"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="/js/bootstrap-datetimepicker.fr.js"></script>
</body>
</html>