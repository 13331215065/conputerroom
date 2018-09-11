package com.neuedu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.dao.AssetMapper;
import com.neuedu.pojo.Asset;
import com.neuedu.pojo.AssetExample;
 @Service
public class AssetServiceImpl implements IassetService{
	@Resource
	AssetMapper assetMapper;
	@Override
	public List<Asset> getAssets(AssetExample example) {
		// TODO Auto-generated method stub
		return assetMapper.selectByExample(example);
	}
	@Override
	public int assetadd(Asset asset) {
		// TODO Auto-generated method stub
		return assetMapper.insertSelective(asset);
	}
	@Override
	public int updatebyid(Asset asset) {
		// TODO Auto-generated method stub
		return assetMapper.updateByPrimaryKeySelective(asset);
	}
	@Override
	public int delgate(int id) {
		// TODO Auto-generated method stub
		return assetMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Asset getAssetById(int id) {
		// TODO Auto-generated method stub
		return assetMapper.selectByPrimaryKey(id);
	}
}
