package com.neuedu.dao;

import com.neuedu.pojo.SwitchboardConfig;
import com.neuedu.pojo.SwitchboardConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwitchboardConfigMapper {
    long countByExample(SwitchboardConfigExample example);

    int deleteByExample(SwitchboardConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SwitchboardConfig record);

    int insertSelective(SwitchboardConfig record);

    List<SwitchboardConfig> selectByExample(SwitchboardConfigExample example);

    SwitchboardConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SwitchboardConfig record, @Param("example") SwitchboardConfigExample example);

    int updateByExample(@Param("record") SwitchboardConfig record, @Param("example") SwitchboardConfigExample example);

    int updateByPrimaryKeySelective(SwitchboardConfig record);

    int updateByPrimaryKey(SwitchboardConfig record);
}