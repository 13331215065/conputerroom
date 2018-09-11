package com.neuedu.pojo;

import java.util.Date;

public class Asset {
    private Integer id;

    private String name;

    private Integer comtract;

    private Integer assetType;

    private Integer configId;

    private String computerroom;

    private Integer rackId;

    private String rack;

    private Date inTime;

    private String warrantyTime;

    private String phone;

    private String responsibleBy;

    private String responsiblePersonName;

    private String responsiblePersonPhone;

    private Integer repairState;
    
    private GateWayConfig gatewayConfig;
    
    private SwitchboardConfig switchboardConfig;
    
    private StorageConfig storageConfig;
    
    public GateWayConfig getGatewayConfig() {
		return gatewayConfig;
	}

	public void setGatewayConfig(GateWayConfig gatewayConfig) {
		this.gatewayConfig = gatewayConfig;
	}

	public SwitchboardConfig getSwitchboardConfig() {
		return switchboardConfig;
	}

	public void setSwitchboardConfig(SwitchboardConfig switchboardConfig) {
		this.switchboardConfig = switchboardConfig;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getComtract() {
        return comtract;
    }

    public void setComtract(Integer comtract) {
        this.comtract = comtract;
    }

    public Integer getAssetType() {
        return assetType;
    }

    public void setAssetType(Integer assetType) {
        this.assetType = assetType;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getComputerroom() {
        return computerroom;
    }

    public void setComputerroom(String computerroom) {
        this.computerroom = computerroom == null ? null : computerroom.trim();
    }

    public Integer getRackId() {
        return rackId;
    }

    public void setRackId(Integer rackId) {
        this.rackId = rackId;
    }

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack == null ? null : rack.trim();
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getWarrantyTime() {
        return warrantyTime;
    }

    public void setWarrantyTime(String warrantyTime) {
        this.warrantyTime = warrantyTime == null ? null : warrantyTime.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getResponsibleBy() {
        return responsibleBy;
    }

    public void setResponsibleBy(String responsibleBy) {
        this.responsibleBy = responsibleBy == null ? null : responsibleBy.trim();
    }

    public String getResponsiblePersonName() {
        return responsiblePersonName;
    }

    public void setResponsiblePersonName(String responsiblePersonName) {
        this.responsiblePersonName = responsiblePersonName == null ? null : responsiblePersonName.trim();
    }

    public String getResponsiblePersonPhone() {
        return responsiblePersonPhone;
    }

    public void setResponsiblePersonPhone(String responsiblePersonPhone) {
        this.responsiblePersonPhone = responsiblePersonPhone == null ? null : responsiblePersonPhone.trim();
    }

    public Integer getRepairState() {
        return repairState;
    }

    @Override
	public String toString() {
		return "Asset [id=" + id + ", name=" + name + ", comtract=" + comtract + ", assetType=" + assetType
				+ ", configId=" + configId + ", computerroom=" + computerroom + ", rackId=" + rackId + ", rack=" + rack
				+ ", inTime=" + inTime + ", warrantyTime=" + warrantyTime + ", phone=" + phone + ", responsibleBy="
				+ responsibleBy + ", responsiblePersonName=" + responsiblePersonName + ", responsiblePersonPhone="
				+ responsiblePersonPhone + ", repairState=" + repairState + ", gatewayConfig=" + gatewayConfig
				+ ", switchboardConfig=" + switchboardConfig + "]";
	}

	public void setRepairState(Integer repairState) {
        this.repairState = repairState;
    }

	public StorageConfig getStorageConfig() {
		return storageConfig;
	}

	public void setStorageConfig(StorageConfig storageConfig) {
		this.storageConfig = storageConfig;
	}
}