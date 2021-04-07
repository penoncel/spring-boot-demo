package com.admin.pojo;

import lombok.Data;

/**
 * @Program: spring-boot-demo-all
 * @Description:
 * @Author: 赵旗
 * @Create: 2021-04-07 16:19
 */
@Data
public class BlogInfo {
    private Integer id;
    private String blogAuthor;
    private String blogUrl;
    private String blogTitle;
    private String blogItem;
}
