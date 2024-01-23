package cn.sfcoder.springbootinit.model.dto.chart;

import lombok.Data;
import java.io.Serializable;

/**
 * @Author: refain
 * @Description:
 * @Date: 2024/1/24 1:05
 * @Version: 1.0
 */
@Data
public class GenChartByAiRequest implements Serializable {
    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表名称
     */
    private String name;

    /**
     * 图表类型
     */
    private String chartType;

    private static final long serialVersionUID = 1L;
}
