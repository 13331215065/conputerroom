package com.neuedu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.dao.SwitchboardConfigMapper;
import com.neuedu.pojo.StorageConfig;
import com.neuedu.pojo.SwitchboardConfig;
import com.neuedu.pojo.SwitchboardConfigExample;

@Service
public class SwitchboardServiceImpl implements IswitchboardService {
	@Resource
	SwitchboardConfigMapper switchboardConfigmapper;

	@Override
	public List<SwitchboardConfig> getSwitchboardConfig(SwitchboardConfigExample example) {
		// TODO Auto-generated method stub
		return switchboardConfigmapper.selectByExample(example);
	}

	@Override
	public void addSwitchboard(SwitchboardConfig switchboardConfig) {
		// TODO Auto-generated method stub
		switchboardConfigmapper.insertSelective(switchboardConfig);
		}

	@Override
	public SwitchboardConfig getSwitchboardConfig(Integer configId) {
		// TODO Auto-generated method stub
		return switchboardConfigmapper.selectByPrimaryKey(configId);
	}

	@Override
	public void updateById(SwitchboardConfig switchboardConfig) {
		// TODO Auto-generated method stub
		switchboardConfigmapper.updateByPrimaryKey(switchboardConfig);
	}

	@Override
	public void delete(Integer configId) {
		// TODO Auto-generated method stub
		switchboardConfigmapper.deleteByPrimaryKey(configId);
	}

}
