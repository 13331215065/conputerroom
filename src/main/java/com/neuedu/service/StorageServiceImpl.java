package com.neuedu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.dao.StorageConfigMapper;
import com.neuedu.pojo.StorageConfig;
import com.neuedu.pojo.StorageConfigExample;

@Service
public class StorageServiceImpl implements IstorageService {
	@Resource
	StorageConfigMapper storageConfigMapper;
	@Override
	public List<StorageConfig> getStorages(StorageConfigExample storageConfigExample) {
		// TODO Auto-generated method stub
		return  storageConfigMapper.selectByExample(storageConfigExample);
	}
	@Override
	public void addStorage(StorageConfig storageConfig) {
		// TODO Auto-generated method stub
		storageConfigMapper.insertSelective(storageConfig);
	}
	@Override
	public StorageConfig getStorages(Integer configId) {
		// TODO Auto-generated method stub
		return storageConfigMapper.selectByPrimaryKey(configId);
	}
	@Override
	public void updateById(StorageConfig storageConfig) {
		// TODO Auto-generated method stub
		storageConfigMapper.updateByPrimaryKey(storageConfig);
	}
	@Override
	public void delete(Integer configId) {
		// TODO Auto-generated method stub
		storageConfigMapper.deleteByPrimaryKey(configId);
	}
	
}
