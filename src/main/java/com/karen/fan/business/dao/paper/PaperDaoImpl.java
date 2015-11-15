package com.karen.fan.business.dao.paper;

import com.karen.fan.business.dao.AbstractBaseDaoImpl;
import com.karen.fan.business.mapper.CrudMapper;
import com.karen.fan.business.mapper.PaperMapper;
import com.karen.fan.business.model.PaperModel;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
@Repository(value = "paperDao")
public class PaperDaoImpl extends AbstractBaseDaoImpl<PaperModel, Long> implements PaperDao {

    @Resource(name = "paperMapper")
    private PaperMapper paperMapper;

    @Override
    protected CrudMapper getMapper() {
        return paperMapper;
    }
}
