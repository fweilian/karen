package com.karen.fan.business.mapper;

import com.karen.fan.business.model.PaperModel;
import org.springframework.stereotype.Repository;

/**
 * @Date: 2015-10-25
 * @author: fan
 */
@Repository(value = "paperMapper")
public interface PaperMapper extends CrudMapper<PaperModel, Long> {
}
