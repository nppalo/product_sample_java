package demoinsurance.auto.productstructure;

import java.util.List;

import demoinsurance.auto.entity.Driver;
import insurance.product.model.entity.InsuredEntity;
import insurance.product.model.entity.ObjectOfInsurance;
import insurance.product.model.org.SectionType;
import insurance.product.model.primitives.NumericEntry;
import insurance.product.model.primitives.ValidationResult;

public class MandatoryCoveragesSection extends SectionType {

	@Override
	protected NumericEntry computeLocalPremium(List<InsuredEntity> entity, ObjectOfInsurance object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ValidationResult evaluateLocalEligibility(List<InsuredEntity> entities, ObjectOfInsurance object) {
		return null;
	}

}
