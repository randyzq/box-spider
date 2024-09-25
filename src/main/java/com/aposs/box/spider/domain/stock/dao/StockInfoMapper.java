package com.aposs.box.spider.domain.stock.dao;

import com.aposs.box.spider.config.MyMapper;
import com.aposs.box.spider.domain.stock.entity.StockInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Aric
 * @date 2023/12/19
 */
@Mapper
public interface StockInfoMapper extends MyMapper<StockInfo> {

    int insertOrUpdate(StockInfo stockInfo);


}
