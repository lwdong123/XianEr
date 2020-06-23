package com.dcis.frontier.dao;

import com.dcis.frontier.models.Goods;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;
import java.util.Map;

@Component
public interface GoodsMapper extends Mapper<Goods> {
    List<Map> getDname(Map map);

    List<Map> getBuyingPriceByGoodsName(Map map);

    int updateStockNum(Goods goods);
}