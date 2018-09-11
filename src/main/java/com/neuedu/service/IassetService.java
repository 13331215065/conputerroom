package com.neuedu.service;

import java.util.List;

import com.neuedu.pojo.Asset;
import com.neuedu.pojo.AssetExample;

public interface IassetService {
	 List<Asset> getAssets(AssetExample example);
     int assetadd(Asset asset);
     int updatebyid(Asset asset);
     int delgate(int id);
	Asset getAssetById(int id);
	
}
