package demoinsurance.auto.test;

import java.util.ArrayList;
import java.util.List;

import demoinsurance.auto.entity.Car;
import demoinsurance.auto.entity.Driver;
import demoinsurance.auto.productstructure.AutoProduct;
import insurance.product.model.entity.InsuredEntity;
import insurance.product.model.entity.ObjectOfInsurance;
import insurance.product.model.primitives.NumericEntry;
import insurance.product.model.primitives.ValidationResult;

public class TestQuoteService {

	private AutoProduct autoProduct = null;
	
	public TestQuoteService(){
		super();
		autoProduct = new AutoProduct();
	}
	
	
	public List<NumericEntry> computePremium(List<InsuredEntity> entities, ObjectOfInsurance object){
		return autoProduct.computePremium(entities, object);
	}
	
	public List<ValidationResult> evaluateEligibility(List<InsuredEntity> entities, ObjectOfInsurance object){
		return autoProduct.evaluateEligibility(entities, object);		
	}
	
	public static void main(String[] args) {

		//define object of insurance
		Car car = new Car();
		car.setMake("TOYOTA");
		car.setModel("SPIDER");
		car.setYear(2000);
		
		//define insured
		List<InsuredEntity>  insuredEntities = new ArrayList<InsuredEntity>();
		
		Driver driver = new Driver();
		driver.setAge(20);
		driver.setFirstName("Jose");
		driver.setFirstName("Ricial");
		insuredEntities.add(driver);
		
		TestQuoteService service = new TestQuoteService();
		
		List<NumericEntry> premiums = service.computePremium(insuredEntities, car);
		List<ValidationResult> eligibilityResults = service.evaluateEligibility(insuredEntities, car);
		
		for (NumericEntry premium: premiums){
			System.out.println(premium);
		}
		
		for (ValidationResult eligibilityResult: eligibilityResults){
			System.out.println(eligibilityResult);
		}
		
		eligibilityResults.forEach(result -> System.out.println(result));
		
		System.out.println("Total Premium: " +
				premiums.stream()
				.map(premium -> premium.getNumber().doubleValue())
				.reduce(0.0, (totalPremium, premium) -> totalPremium + premium));
		
		System.out.println("Is it valid? "+
				eligibilityResults.stream()
				.map(result -> result.isValid())
				.reduce(true, (finalResult, result) -> finalResult && result));
				
	}
	
}
