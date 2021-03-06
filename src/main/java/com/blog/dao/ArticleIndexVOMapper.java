package com.blog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.blog.vo.ArticleIndexVO;

@Component
@Mapper
public interface ArticleIndexVOMapper extends BaseMapper<ArticleIndexVO> {

}
