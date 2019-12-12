package com.shizhichao.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shizhichao.bawei.pojo.User;

public interface UserDao {

	/**
	 * @Title: selectById   
	 * @Description: 根据Id，查询对象   
	 * @param: @param id
	 * @param: @return      
	 * @return: User      
	 * @throws
	 */
	User selectById(@Param("id") Integer id);
	/**
	 * @Title: select   
	 * @Description: 根据User查询列表  
	 * @param: @param user
	 * @param: @return      
	 * @return: List<User>      
	 * @throws
	 */
	List<User> select(@Param("user") User user);
	/**
	 * @Title: count   
	 * @Description: 查询数据条数   
	 * @param: @param user
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int count(@Param("user") User user);
	/**
	 * @Title: insert   
	 * @Description: 插入一条记录   
	 * @param: @param user
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int insert(@Param("user") User user);
	/**
	 * @Title: update   
	 * @Description: 根据Id更新记录 
	 * @param: @param user
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int update(@Param("user") User user);
	/**
	 * @Title: deleteById   
	 * @Description: 根据Id删除记录   
	 * @param: @param id
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int deleteById(@Param("id") Integer id);
	/**
	 * @Title: deleteByIds   
	 * @Description: 根据Ids批量删除记录   
	 * @param: @param ids "1,2,3"
	 * @param: @return      
	 * @return: int      
	 * @throws
	 */
	int deleteByIds(@Param("ids") String ids);
}
