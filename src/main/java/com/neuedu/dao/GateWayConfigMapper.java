package com.neuedu.dao;

import com.neuedu.pojo.GateWayConfig;
import com.neuedu.pojo.GateWayConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GateWayConfigMapper {
    long countByExample(GateWayConfigExample example);

    int deleteByExample(GateWayConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GateWayConfig record);

    int insertSelective(GateWayConfig record);

    List<GateWayConfig> selectByExample(GateWayConfigExample example);

    GateWayConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GateWayConfig record, @Param("example") GateWayConfigExample example);

    int updateByExample(@Param("record") GateWayConfig record, @Param("example") GateWayConfigExample example);

    int updateByPrimaryKeySelective(GateWayConfig record);

    int updateByPrimaryKey(GateWayConfig record);
}