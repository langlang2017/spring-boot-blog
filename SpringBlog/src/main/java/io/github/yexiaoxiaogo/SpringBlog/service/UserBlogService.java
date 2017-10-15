package io.github.yexiaoxiaogo.SpringBlog.service;

import java.util.List;

import io.github.yexiaoxiaogo.SpringBlog.domain.Blog;
import io.github.yexiaoxiaogo.SpringBlog.domain.UserBlog;

public interface UserBlogService {
	//主页显示博客列表
		public List<UserBlog> findBlogListByUser(int userid);
		//查询有几条blog
		public int count(int userid);
		//未登录页面显示最新10条博客
		public List<Blog> findnewblog(int blogid);
		//分页
		public List<UserBlog> pagedquery(int userid,int offset,int pagesize);
		//搜索
		public List<UserBlog> search(String keyword,int offset,int pagesize);
		//根据关键字查询有几条blog
		public int searchcount(String keyword);

}
