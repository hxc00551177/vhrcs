package org.aoligei.vhrcs.mapper;

import org.aoligei.vhrcs.model.entity.ArticleTags;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (ArticleTags)表数据库访问层
 *
 * @author LiuYanSen
 * @since 2020-08-06 14:39:03
 */
public interface ArticleTagsMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ArticleTags queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ArticleTags> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param articleTags 实例对象
     * @return 对象列表
     */
    List<ArticleTags> queryAll(ArticleTags articleTags);

    /**
     * 新增数据
     *
     * @param articleTags 实例对象
     * @return 影响行数
     */
    int insert(ArticleTags articleTags);

    /**
     * 修改数据
     *
     * @param articleTags 实例对象
     * @return 影响行数
     */
    int update(ArticleTags articleTags);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}