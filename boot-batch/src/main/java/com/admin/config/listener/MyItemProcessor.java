package com.admin.config.listener;


import com.admin.pojo.BlogInfo;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

/**
 * @Program: spring-boot-demo-all
 * @Description:
 * @Author: 赵旗
 * @Create: 2021-04-07 16:38
 */
public class MyItemProcessor extends ValidatingItemProcessor<BlogInfo> {
    @Override
    public BlogInfo process(BlogInfo item) throws ValidationException {
        /**
         * 需要执行super.process(item)才会调用自定义校验器
         */
        super.process(item);
        /**
         * 对数据进行简单的处理
         */
        if (item.getBlogItem().equals("springboot")) {
            item.setBlogTitle("springboot 系列还请看看我Jc");
        } else {
            item.setBlogTitle("未知系列");
        }
        return item;
    }
}