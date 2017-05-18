package demoinsurance.auto.productstructure;

import java.util.List;

import insurance.product.model.entity.InsuredEntity;
import insurance.product.model.entity.ObjectOfInsurance;
import insurance.product.model.org.CoverageType;
import insurance.product.model.org.ProductType;
import insurance.product.model.org.SectionType;
import insurance.product.model.primitives.NumericEntry;
import insurance.product.model.primitives.ValidationResult;

public class AutoProduct extends ProductType {

	SectionType mandatoryCoveragesSection = new MandatoryCoveragesSection();
	SectionType optionalCoveragesSection = new OptionalCoveragesSection();
	CoverageType actsOfGodCoverage = new ActsOfGodCoverage();
	CoverageType collisionCoverage = new CollisionCoverage();
	CoverageType personalInjuryCoverage = new PersonalInjuryCoverage();
	CoverageType theftCoverage = new TheftCoverage();
	
	
	public AutoProduct(){
		//define product structure using the various sections and coverages
		//do this bottom-up
		mandatoryCoveragesSection.addChild(collisionCoverage);
		mandatoryCoveragesSection.addChild(personalInjuryCoverage);
		optionalCoveragesSection.addChild(actsOfGodCoverage);
		optionalCoveragesSection.addChild(theftCoverage);
		this.addChild(mandatoryCoveragesSection);
		this.addChild(optionalCoveragesSection);
	}
	
	@Override
	protected NumericEntry computeLocalPremium(List<InsuredEntity> entity, ObjectOfInsurance object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ValidationResult evaluateLocalEligibility(List<InsuredEntity> entity, ObjectOfInsurance object) {
		// TODO Auto-generated method stub
		return null;
	}

}
