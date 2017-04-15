package com.eumji.zblog.mapper;


import com.eumji.zblog.vo.ArticleCustom;
import com.eumji.zblog.vo.Pager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by GeneratorFx on 2017-04-11.
*/
@Mapper
public interface ArticleMapper {

    int getArticleCount();

    List<ArticleCustom> getArticleList(Pager pager);

    List<ArticleCustom> loadArticleByCategory(@Param("pager") Pager pager, @Param("categoryId") Integer categoryId);

    /**
     * 通过tagid分页获取当前tag下的文章列表
     * @param pager
     * @param tagId
     * @return
     */
    List<ArticleCustom> loadArticleByTag(@Param("pager")Pager pager, @Param("tagId") Integer tagId);


}