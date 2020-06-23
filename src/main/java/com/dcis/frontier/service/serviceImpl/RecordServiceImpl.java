package com.dcis.frontier.service.serviceImpl;

import com.dcis.frontier.dao.RecordMapper;
import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.Record;
import com.dcis.frontier.service.RecordService;
import com.dcis.frontier.until.ResultObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:10
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class RecordServiceImpl implements RecordService {
    @Resource
    RecordMapper recordMapper;

    @Override
    public ResultObject getRecord(Map map) {
        ResultObject resultObject = ResultObject.getInstance();
        int pageNum = Integer.parseInt(map.get("pageNum").toString());
        int pageSize = Integer.parseInt(map.get("pageSize").toString());
        PageHelper.startPage(pageNum, pageSize);
        List<Map> list = recordMapper.getRecord(map);
        PageInfo<Map> page = new PageInfo<Map>(list);
        resultObject.setData(page);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject insertRecord(Record record) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        record.setStatus("0");
        resultObject.setData(recordMapper.insertSelective(record));
        return resultObject;
    }

    @Override
    public ResultObject deleteRecord(Record record) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(recordMapper.delete(record));
        return resultObject;
    }

    @Override
    public ResultObject updateRecord(Record record) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        record.setStatus("0");
        resultObject.setData(recordMapper.updateByPrimaryKey(record));
        return resultObject;
    }

    @Override
    public ResultObject getRecordKey(Record record) {
        ResultObject resultObject = ResultObject.getInstance();
        Record data = recordMapper.selectByPrimaryKey(record);
        resultObject.setData(data);
        resultObject.setSuccess(true);
        return resultObject;
    }

    @Override
    public ResultObject reviewRecord(Record record) {
        ResultObject resultObject = ResultObject.getInstance();
        resultObject.setSuccess(true);
        resultObject.setData(recordMapper.reviewRecord(record));
        return resultObject;
    }

    @Override
    public ResultObject getRecordName() {
        ResultObject resultObject = ResultObject.getInstance();
        List data = recordMapper.getRecordName();
        resultObject.setData(data);
        resultObject.setSuccess(true);
        return resultObject;
    }

}