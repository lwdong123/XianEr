package com.dcis.frontier.service;

import com.dcis.frontier.models.Goods;
import com.dcis.frontier.until.ResultObject;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:57
 */
public interface GoodsService {
    ResultObject getDname(Map map);

    ResultObject insertGoods(Goods goods);

    ResultObject deleteGoods(Goods goods);

    ResultObject updateGoods(Goods goods);

    ResultObject getMemberKey(Goods goods);

    ResultObject getGoodsInfoByName(Goods goods);
}
