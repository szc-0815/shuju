<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
<link     href="<%=request.getContextPath() %>/css/bootstrap.min.css"   rel="stylesheet">
<link href="<%=request.getContextPath() %>/logincss/css/bootstrap.min.css" type="text/css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/logincss/css/font-awesome.min.css" type="text/javascript" rel="stylesheet">
<link href="<%=request.getContextPath() %>/logincss/css/bootsnav.css" type="text/css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/logincss/css/normalize.css" type="text/css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/logincss/css/css.css" rel="stylesheet" type="text/css">
<script src="<%=request.getContextPath() %>/logincss/js/jquery-1.11.0.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/logincss/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/logincss/js/bootsnav.js" type="text/javascript"></script>
<script src="<%=request.getContextPath() %>/logincss/js/jquery.js" type="text/javascript"></script>
<script type="text/javascript">
</script>
</head>
<body class="logobg_style">
  	<div id="large-header" class="large-header login-page">
  		<canvas id="demo-canvas" width="1590" height="711"></canvas>
  		<div class="login-form">
  		<div class="alert alert-danger" role="alert" style="display: none">
			</div>
  			<div class="login-content">
  				<h1 class="title_name">账户登录</h1>
  				<form method="post"  role="form" id="loginForm" class="login_padding">
				<div class="form-group clearfix">
					<div class="input-group">
						<div class="input-group-addon">
							<i class="icon_user"></i>
						</div>


						<input type="text" class="form-control" name="username" id="username" placeholder="用户名" autocomplete="off">
					</div>


				</div>


				<div class="form-group clearfix">


					<div class="input-group">
						<div class="input-group-addon">
							<i class="icon_password"></i>
						</div>


						<input type="password" class="form-control" name="password" id="password" placeholder="密码" autocomplete="off">
					</div>


				</div>
					
                  
				<div class="form-group">
					<a  type="button" class="btn btn-danger btn-block btn-login" onclick="login()">
						<i class="fa fa-sign-in"></i>
						登录
					</a>
					<div style="height: 25px;margin-top: 5px">
						<span style="color: red;font-size: 20px;margin-right: 280px">${error}</span>
					</div>
				</div>
				<div class=" textright"><a href="toreg" class="forget">注册</a></div>
			</form>
  			</div>
  			
  		</div>
  	</div>
  	
<script src="<%=request.getContextPath() %>/logincss/js/TweenLite/TweenLite.min.js"></script>
<script src="<%=request.getContextPath() %>/logincss/js/TweenLite/EasePack.min.js"></script>
<script src="<%=request.getContextPath() %>/logincss/js/TweenLite/rAF.js"></script>
<script src="<%=request.getContextPath() %>/logincss/js/TweenLite/demo-1.js"></script>

<script type="text/javascript">
function login(){
	//空判断
	var username = $("#username").val();
	var password = $("#password").val();
	if(username==null || password==""){
		$(".alert").html("请输入用户名和密码");
		$(".alert").show();
		return;
	}
	$(".alert").hide();
	//后台验证
	var formData = $("#loginForm").serialize();
	$.post("/admin/user/login",formData,function(res){
		if(res.result){
			//验证通过跳转到后台首页
			location.href="/admin/home";
		}else{
			//否则提示错误信息
			$(".alert").html(res.message);
			$(".alert").show();
		}
	});
}

</script>




</body>
</html>