package com.neuedu.dao;

import com.neuedu.pojo.StorageConfig;
import com.neuedu.pojo.StorageConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StorageConfigMapper {
    long countByExample(StorageConfigExample example);

    int deleteByExample(StorageConfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StorageConfig record);

    int insertSelective(StorageConfig record);

    List<StorageConfig> selectByExample(StorageConfigExample example);

    StorageConfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StorageConfig record, @Param("example") StorageConfigExample example);

    int updateByExample(@Param("record") StorageConfig record, @Param("example") StorageConfigExample example);

    int updateByPrimaryKeySelective(StorageConfig record);

    int updateByPrimaryKey(StorageConfig record);
}