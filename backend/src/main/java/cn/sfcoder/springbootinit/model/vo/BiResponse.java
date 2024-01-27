package cn.sfcoder.springbootinit.model.vo;



import lombok.Data;

import java.io.Serializable;

/**
 * Bi 的返回结果
 */
@Data
public class BiResponse  implements Serializable {

    private String genChart;

    private String genResult;

    private Long chartId;
    private static final long serialVersionUID = 1L;
}
