package com.neuedu.controller.asset;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.pojo.Asset;
import com.neuedu.pojo.AssetExample;
import com.neuedu.pojo.GateWayConfig;
import com.neuedu.pojo.GateWayConfigExample;
import com.neuedu.pojo.StorageConfig;
import com.neuedu.pojo.StorageConfigExample;
import com.neuedu.pojo.SwitchboardConfig;
import com.neuedu.pojo.SwitchboardConfigExample;
import com.neuedu.service.IassetService;
import com.neuedu.service.IgatewayService;
import com.neuedu.service.IstorageService;
import com.neuedu.service.IswitchboardService;
import com.neuedu.service.StorageServiceImpl;

@RequestMapping("/asset")
@Controller
public class asset {
	@Resource
	IassetService assetService;
	@Resource
	IgatewayService gatewayService;
	@Resource
	IswitchboardService switchboardService;
	@Resource
	IstorageService storageService;
	
	@RequestMapping("/list.do")
	public String list() {
		return "asset/list";
	}

	@RequestMapping("/getData.do")
	@ResponseBody
	// ��������ʲ���Ϣ
	public List getData() {
		return assetService.getAssets(null);
	}

	// ��ת�����ҳ��
	@RequestMapping("/goAdd.do")
	public String goAdd() {
		return "asset/add";
	}

	@RequestMapping("/gatewaylist.do")
	public String gatewaylist(ModelMap map) {

		AssetExample example = new AssetExample();
		example.createCriteria().andAssetTypeEqualTo(3);
		List<Asset> list = assetService.getAssets(example);
		System.out.println(list);
		for (Asset li : list) {
			GateWayConfigExample gateWayConfigExample = new GateWayConfigExample();
			gateWayConfigExample.createCriteria().andIdEqualTo(li.getConfigId());
			System.out.println(li);
			GateWayConfig config = gatewayService.getAssets(gateWayConfigExample).get(0);
			System.out.println(config);
			li.setGatewayConfig(config);
		}
		map.addAttribute("gateway", list);
		return "asset/gateway-list";
	}

	// ��ת�����ҳ��
	@RequestMapping("/gogatewayAdd.do")
	public String gogateAdd() {
		return "asset/gateway-add";
	}

	// ��ת�����ҳ��
	@RequestMapping("/dogatewayAdd.do")
	public String dogateAdd(String gateName, String config, Asset asset) {
		GateWayConfig config2 = new GateWayConfig();
		config2.setGateName(gateName);
		config2.setConfig(config);
		gatewayService.gatewayadd(config2);
		asset.setConfigId(config2.getId());
		assetService.assetadd(asset);
		return "redirect:gatewaylist.do";
	}

	// ��ת�����ҳ��
	@RequestMapping("/gogatewayedit.do")
	public String gogateedit(int id, ModelMap map) {
		AssetExample assetExample = new AssetExample();
		assetExample.createCriteria().andIdEqualTo(id);
		Asset asset = assetService.getAssets(assetExample).get(0);
		GateWayConfigExample configExample = new GateWayConfigExample();
		configExample.createCriteria().andIdEqualTo(asset.getConfigId());
		GateWayConfig config = gatewayService.getAssets(configExample).get(0);
		asset.setGatewayConfig(config);
		map.addAttribute("asset", asset);
		return "asset/gateway-edit";
	}

	// ��ת�����ҳ��
	@RequestMapping("/dogatewayedit.do")
	public String gogateedit(String gateName, String config, Asset asset) {
		assetService.updatebyid(asset);
		GateWayConfig config3 = new GateWayConfig();
		config3.setId(asset.getConfigId());
		config3.setGateName(gateName);
		config3.setConfig(config);
		gatewayService.updatebyid(config3);
		return "redirect:gatewaylist.do";
	}

	// ��ת�����ҳ��
	@RequestMapping("/delasset.do")
	public String delgate(int id, int configId) {
		gatewayService.delgateway(configId);
		assetService.delgate(id);
		return "redirect:gatewaylist.do";
	}
	
	//��ת�������豸���ҳ��
	@RequestMapping("/switchboardlist.do")
	public String switchboardlist() {
		return "asset/switchboard-list";
	}
	
	//ajax��ʾ���������豸
	@RequestMapping("/getSwitchboardData.do")
	@ResponseBody
	public List getSwitchboardData() {
		AssetExample assetExample=new AssetExample();
		assetExample.createCriteria().andAssetTypeEqualTo(3);
		List<Asset> assets = assetService.getAssets(assetExample);
		for (Asset asset : assets) {
			SwitchboardConfigExample switchboardConfigExample=new SwitchboardConfigExample();
			switchboardConfigExample.createCriteria().andIdEqualTo(asset.getConfigId());
			asset.setSwitchboardConfig(switchboardService.getSwitchboardConfig(switchboardConfigExample).get(0));
		}
		return assets;
	}
	
	//�����������ҳ��
	@RequestMapping("/goswitchboardAdd.do")
	public String goswitchboardAdd() {
		return "asset/switchboard-add";
	}
	
	//��������豸
	@RequestMapping(value="/doswitchboardAdd.do",method=RequestMethod.POST)
	public String doswitchboardAdd(Asset asset,String config) {
		System.out.println(asset.toString());
		//�Ȳ������ñ�
		SwitchboardConfig switchboardConfig=new SwitchboardConfig();
		switchboardConfig.setConfig(config);
		switchboardConfig.setGateName(asset.getName());
		switchboardService.addSwitchboard(switchboardConfig);
		//���configId�����ʲ���
		SwitchboardConfigExample switchboardConfigExample=new SwitchboardConfigExample();
		switchboardConfigExample.setOrderByClause("id desc");
		switchboardConfigExample.createCriteria().andConfigEqualTo(config).andGateNameEqualTo(asset.getName());
		List<SwitchboardConfig> list2 = switchboardService.getSwitchboardConfig(switchboardConfigExample);
		
		//�������ʲ���
		asset.setConfigId(list2.get(0).getId());
		assetService.assetadd(asset);
		return "redirect:switchboardlist.do";
	}
	
	//��ת�����½�����ҳ��
	@RequestMapping("/goswitchboardEdit.do")
	public String goswitchboardEdit(int id,ModelMap map) {
		Asset asset = assetService.getAssetById(id);
		SwitchboardConfig switchboardConfig= switchboardService.getSwitchboardConfig(asset.getConfigId());
		map.addAttribute("asset",asset);
		map.addAttribute("switchboard",switchboardConfig);
		return "asset/switchboard-edit";
	}
	
	//ִ�и��½������豸
	@Transactional
	@RequestMapping("/doswitchboardEdit.do")
	public String doswitchboardEdit(Asset asset, String config) {
		assetService.updatebyid(asset);
		SwitchboardConfig switchboardConfig=new SwitchboardConfig();
		switchboardConfig.setId(asset.getConfigId());
		switchboardConfig.setGateName(asset.getName());
		switchboardConfig.setConfig(config);
		switchboardService.updateById(switchboardConfig);
		return "redirect:switchboardlist.do";
	}
	
	//ɾ���������豸
	@Transactional
	@RequestMapping("/delSwitchboardConfig.do")
	public String delSwitchboardConfig(int id) {
		switchboardService.delete(assetService.getAssetById(id).getConfigId());
		assetService.delgate(id);
		return "redirect:switchboardlist.do";
	}
	
	@RequestMapping("/storagelist.do")
	public String storagelist() {
		return "/asset/storage-list";
	}

	//ajax��ȡ�洢�����Ϣ
	@RequestMapping("/getStorageData.do")
	@ResponseBody
	public List getStorageData() {
		AssetExample assetExample=new AssetExample();
		assetExample.createCriteria().andAssetTypeEqualTo(4);
		List<Asset> assets = assetService.getAssets(assetExample);
		for (Asset asset : assets) {
			StorageConfigExample storageConfigExample=new StorageConfigExample();
			storageConfigExample.createCriteria().andIdEqualTo(asset.getConfigId());
			asset.setStorageConfig(storageService.getStorages(storageConfigExample).get(0));
		}
		return assets;
	}
	
	//��ת����Ӵ洢ҳ��
	@RequestMapping("/gostorageAdd.do")
	public String gostorageAdd() {
		return "/asset/storage-add";
	}
	
	@RequestMapping("/doStorageAdd.do")
	public String doStorageAdd(Asset asset,String config) {
		System.out.println(asset.toString());
		//�Ȳ������ñ�
		StorageConfig storageConfig=new StorageConfig();
		storageConfig.setConfig(config);
		storageConfig.setStorageName(asset.getName());
		storageService.addStorage(storageConfig);
		//���configId�����ʲ���
		StorageConfigExample storageConfigExample=new StorageConfigExample();
		storageConfigExample.setOrderByClause("id desc");
		storageConfigExample.createCriteria().andConfigEqualTo(config).andStorageNameEqualTo(asset.getName());
		List<StorageConfig> list2 = storageService.getStorages(storageConfigExample);
		
		//�������ʲ���
		asset.setConfigId(list2.get(0).getId());
		assetService.assetadd(asset);
		return "redirect:storagelist.do";
	}
	
	//��ת���޸�ҳ��
	@RequestMapping("/gostorageEdit.do")
	public String gostorageEdit(int id,ModelMap map ) {
		Asset asset = assetService.getAssetById(id);
		StorageConfig storageConfig=storageService.getStorages(asset.getConfigId());
		
		map.addAttribute("asset",asset);
		map.addAttribute("storage",storageConfig);
		return "asset/storage-edit";
	}
	
	@RequestMapping("/dostorageEdit.do")
	public String dostorageEdit(Asset asset,String config) {
		assetService.updatebyid(asset);
		StorageConfig storageConfig=new StorageConfig();
		storageConfig.setId(asset.getConfigId());
		storageConfig.setStorageName(asset.getName());
		storageConfig.setConfig(config);
		storageService.updateById(storageConfig);
		return "redirect:storagelist.do";
	}
	
	//ɾ���洢
	@RequestMapping("/delstorageConfig.do")
	@Transactional
	public String delstorageConfig(int id) {
		storageService.delete(assetService.getAssetById(id).getConfigId());
		assetService.delgate(id);
		return "redirect:storagelist.do";
	}
}
