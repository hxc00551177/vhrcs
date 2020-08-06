package org.aoligei.vhrcs.controller;

import org.aoligei.vhrcs.model.entity.ArticleTags;
import org.aoligei.vhrcs.service.ArticleTagsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (ArticleTags)表控制层
 *
 * @author LiuYanSen
 * @since 2020-08-06 14:39:04
 */
@RestController
@RequestMapping("articleTags")
public class ArticleTagsController {
    /**
     * 服务对象
     */
    @Resource
    private ArticleTagsService articleTagsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ArticleTags selectOne(Integer id) {
        return this.articleTagsService.queryById(id);
    }

}