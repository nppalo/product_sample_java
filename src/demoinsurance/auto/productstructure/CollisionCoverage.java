package demoinsurance.auto.productstructure;

import java.math.BigDecimal;
import java.util.List;

//this should be generated
import demoinsurance.auto.entity.Car;

import insurance.product.model.entity.InsuredEntity;
import insurance.product.model.entity.ObjectOfInsurance;
import insurance.product.model.org.CoverageType;
import insurance.product.model.primitives.NumericEntry;
import insurance.product.model.primitives.ValidationResult;

public class CollisionCoverage extends CoverageType{

	@Override
	protected NumericEntry computeLocalPremium(List<InsuredEntity> entity, 
			ObjectOfInsurance object) {
		//standard declarations
		NumericEntry premiumEntry = null;
		BigDecimal premium = new BigDecimal(0);
		//declare the type of the object of insurance first
		Car car = (Car) object;
		if (car.getMake() == "FERRARI"){
			premium = premium.add(BigDecimal.valueOf(100000));
		} else if (car.getMake() == "TOYOTA"){
			premium = premium.add(BigDecimal.valueOf(20000));
		} else {
			premium = premium.add(BigDecimal.valueOf(15000));
		}; 
		
		premiumEntry = new NumericEntry("Collision Coverage Premium", premium);
		return premiumEntry;
		
	}

	@Override
	protected ValidationResult evaluateLocalEligibility(List<InsuredEntity> entity, ObjectOfInsurance object) {
		// TODO Auto-generated method stub
		return null;
	}

}
