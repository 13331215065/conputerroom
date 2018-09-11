package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.StorageConfig;
import com.neuedu.pojo.SwitchboardConfig;
import com.neuedu.pojo.SwitchboardConfigExample;

public interface IswitchboardService {
	List<SwitchboardConfig> getSwitchboardConfig(SwitchboardConfigExample example);

	void addSwitchboard(SwitchboardConfig switchboardConfig);

	SwitchboardConfig getSwitchboardConfig(Integer configId);

	void updateById(SwitchboardConfig switchboardConfig);

	void delete(Integer configId);

}
