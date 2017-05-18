package demoinsurance.auto.productstructure;

import java.util.List;

//this will need to be generated depending on the declared objects of insurance
import demoinsurance.auto.entity.Driver;

//these will be standard imports
import insurance.product.model.entity.InsuredEntity;
import insurance.product.model.entity.ObjectOfInsurance;
import insurance.product.model.org.CoverageType;
import insurance.product.model.primitives.NumericEntry;
import insurance.product.model.primitives.ValidationResult;

public class PersonalInjuryCoverage extends CoverageType {

	private String validationLabel = "Legal Age Validation";
	
	@Override
	protected NumericEntry computeLocalPremium(List<InsuredEntity> entity, ObjectOfInsurance object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ValidationResult evaluateLocalEligibility(List<InsuredEntity> entities, ObjectOfInsurance object) {
		
		ValidationResult eligibility;
		boolean isEligible = true;
		//for all drivers check the age
		for (InsuredEntity entity: entities){
			Driver driver = (Driver) entity;
			isEligible = isEligible && (driver.getAge() > 18);
		}
		eligibility = new ValidationResult(isEligible, validationLabel, null);
		return eligibility;
	}

}
