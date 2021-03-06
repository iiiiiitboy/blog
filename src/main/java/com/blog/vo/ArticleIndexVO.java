package com.blog.vo;

import com.baomidou.mybatisplus.annotations.TableName;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("v_article_index")
public class ArticleIndexVO {

	private Integer id;
	private String title;
	private String username;
	private String categoryName;
}
