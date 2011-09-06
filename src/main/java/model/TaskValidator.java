package model;


import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

public class TaskValidator {

	public boolean validate(Task entita, Errors errors) {
		if (!StringUtils.hasText(entita.getTitle())) {
			errors.rejectValue("title", "required", "required");
		} else if (entita.getTitle().length() > 500) {
			errors.rejectValue("title", "too long", "too long");
		}
		return !errors.hasErrors();
	}

}
