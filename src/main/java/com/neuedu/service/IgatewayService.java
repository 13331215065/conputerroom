package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Asset;
import com.neuedu.pojo.GateWayConfig;
import com.neuedu.pojo.GateWayConfigExample;



public interface IgatewayService {
	List<GateWayConfig> getAssets(GateWayConfigExample gateWayConfigExample);
	int gatewayadd(GateWayConfig gateWayConfig);
	int updatebyid(GateWayConfig gateWayConfig);
	int delgateway(int id);
}
