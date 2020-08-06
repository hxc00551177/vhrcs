package org.aoligei.vhrcs.service.impl;

import org.aoligei.vhrcs.mapper.ArticleTagsMapper;
import org.aoligei.vhrcs.model.entity.ArticleTags;
import org.aoligei.vhrcs.service.ArticleTagsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (ArticleTags)表服务实现类
 *
 * @author makejava
 * @since 2020-08-06 14:39:04
 */
@Service("articleTagsService")
public class ArticleTagsServiceImpl implements ArticleTagsService {
    @Resource
    private ArticleTagsMapper articleTagsMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public ArticleTags queryById(Integer id) {
        return this.articleTagsMapper.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<ArticleTags> queryAllByLimit(int offset, int limit) {
        return this.articleTagsMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param articleTags 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleTags insert(ArticleTags articleTags) {
        this.articleTagsMapper.insert(articleTags);
        return articleTags;
    }

    /**
     * 修改数据
     *
     * @param articleTags 实例对象
     * @return 实例对象
     */
    @Override
    public ArticleTags update(ArticleTags articleTags) {
        this.articleTagsMapper.update(articleTags);
        return this.queryById(articleTags.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.articleTagsMapper.deleteById(id) > 0;
    }
}