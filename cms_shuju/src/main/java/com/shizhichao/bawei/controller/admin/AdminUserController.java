package com.shizhichao.bawei.controller.admin;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shizhichao.bawei.common.CmsConstant;
import com.shizhichao.bawei.common.CmsMd5Util;
import com.shizhichao.bawei.common.JsonResult;
import com.shizhichao.bawei.pojo.User;
import com.shizhichao.bawei.service.UserService;
import com.shizhichao.utils.StringUtil;

@Controller
@RequestMapping("/admin/user")
public class AdminUserController {
	@Autowired
	private UserService userService;
	/**
	 * @Title: login   
	 * @Description: 后台登录接口   
	 * @param: @param user
	 * @param: @return      
	 * @return: Object      
	 * @throws
	 */
	@RequestMapping("login")
	@ResponseBody
	public Object login(User user,HttpSession session) {
		System.out.println(user);
		//判断用户名和密码
		if(StringUtil.isBlank(user.getUsername()) || StringUtil.isBlank(user.getPassword())) {
			return JsonResult.fail(1000, "用户名和密码不能为空");
		}
		//查询用户
		User userInfo = userService.getByUsername(user.getUsername());
		//用户为空
		if(userInfo==null) {
			return JsonResult.fail(1000, "用户名或密码错误");
		}
		//禁用判断
		if(userInfo.getLocked()==1) {
			return JsonResult.fail(1000, "用户禁用");
		}
		
		
		//是否管理员
		if(!userInfo.isAdmin()) {
			return JsonResult.fail(1000, "权限不够");
		}
		
		
		
		//判断密码
		String string2md5 = CmsMd5Util.string2MD5(user.getPassword());
		System.out.println(string2md5);
		if(string2md5.equals(userInfo.getPassword())) {
			session.setAttribute(CmsConstant.UserAdminSessionKey, userInfo);
			return JsonResult.sucess();
		}
		return JsonResult.fail(500, "未知错误");
	}
	
	@RequestMapping("logout")
	public Object logout(HttpServletResponse response,HttpSession session) {
		session.invalidate();
		return "redirect:/admin/";
	}
	
	
}
