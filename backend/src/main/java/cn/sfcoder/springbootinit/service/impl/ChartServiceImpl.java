package cn.sfcoder.springbootinit.service.impl;

import cn.sfcoder.springbootinit.mapper.ChartMapper;
import cn.sfcoder.springbootinit.mapper.UserMapper;
import cn.sfcoder.springbootinit.model.entity.Chart;
import cn.sfcoder.springbootinit.model.entity.User;
import cn.sfcoder.springbootinit.service.ChartService;
import cn.sfcoder.springbootinit.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author: refain
 * @Description:
 * @Date: 2024/1/19 23:47
 * @Version: 1.0
 */
@Service
@Slf4j
public class ChartServiceImpl extends ServiceImpl<ChartMapper, Chart> implements ChartService {

}
