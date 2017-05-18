package demoinsurance.auto.entity;

import insurance.product.model.entity.ObjectType;

public class DriverType implements ObjectType{

	@Override
	public String getTypeCode() {
		return "AUTO_DRV";
	}

	@Override
	public String getTypeName() {
		return "Automobile Driver";
	}

}
