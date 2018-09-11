package com.neuedu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.dao.GateWayConfigMapper;
import com.neuedu.pojo.GateWayConfig;
import com.neuedu.pojo.GateWayConfigExample;

@Service
public class GatewayImpI implements IgatewayService{
        @Resource
         GateWayConfigMapper gateway;
	@Override
	public List<GateWayConfig> getAssets(GateWayConfigExample gateWayConfigExample) {
		// TODO Auto-generated method stub
		return gateway.selectByExample(gateWayConfigExample);
	}
	@Override
	public int gatewayadd(GateWayConfig gateWayConfig) {
		// TODO Auto-generated method stub
		return gateway.insertSelective(gateWayConfig);
	}
	@Override
	public int updatebyid(GateWayConfig gateWayConfig) {
		// TODO Auto-generated method stub
		return gateway.updateByPrimaryKeySelective(gateWayConfig);
	}
	@Override
	public int delgateway(int id) {
		// TODO Auto-generated method stub
		return gateway.deleteByPrimaryKey(id);
	}
      
}
