package demoinsurance.auto.productstructure;

import java.math.BigDecimal;
import java.util.List;

import insurance.product.model.entity.InsuredEntity;
import insurance.product.model.entity.ObjectOfInsurance;
import insurance.product.model.org.CoverageType;
import insurance.product.model.primitives.NumericEntry;
import insurance.product.model.primitives.ValidationResult;

public class ActsOfGodCoverage extends CoverageType{

	@Override
	protected NumericEntry computeLocalPremium(List<InsuredEntity> entity, ObjectOfInsurance object) {
		String label = "Acts-Of-God Coverage Premium";
		BigDecimal premium = new BigDecimal(900);
		NumericEntry returnValue = new NumericEntry(label,premium); 
		return returnValue;
	}

	@Override
	protected ValidationResult evaluateLocalEligibility(List<InsuredEntity> entity, ObjectOfInsurance object) {
		Boolean isValid = new Boolean(true);
		return null;
	}

}
