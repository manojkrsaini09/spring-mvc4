/*package com.manu.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PhonConstraintValidator implements ConstraintValidator<Phon,String> {

	@Override
	public void initialize(Phon phon) {
		
	}

	@Override
	public boolean isValid(String phonField, ConstraintValidatorContext cxt) {
        if(phonField == null)
        	return false;
        
        return phonField.matches("[0-9()-]*");
	}

}
*/