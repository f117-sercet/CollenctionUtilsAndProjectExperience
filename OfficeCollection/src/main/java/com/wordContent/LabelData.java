package com.wordContent;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Description： 公共实体
 *
 * @author: 段世超
 * @aate: Created in 2024/5/9 18:00
 */
@Data
@Accessors(chain = true)
// 当 chain 为true时,对应字段的setter方法调用后，返回当前对象
public class LabelData {
    /**
     * 标签名称，即put使用到的名称
     */
    private String labelName;
    /**
     * 文件内容类型
     */
    private WordContentTypeEnum typeEnum;
}
