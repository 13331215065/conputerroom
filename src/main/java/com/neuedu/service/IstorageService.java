package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.StorageConfig;
import com.neuedu.pojo.StorageConfigExample;

public interface IstorageService {
	List<StorageConfig> getStorages(StorageConfigExample storageConfigExample);

	void addStorage(StorageConfig storageConfig);

	StorageConfig getStorages(Integer configId);

	void updateById(StorageConfig storageConfig);

	void delete(Integer configId);
}
