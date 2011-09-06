package web;

import model.Task;
import model.TaskValidator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value=TaskController.URL)
public class TaskController {

	static final String URL = "/task";
	private static final String FORM_VIEW = "form";
	private static final String LIST_VIEW = "list";
	private static final String ATTRIBUTE = "task";
	private static final String EDIT_PARAM = "edit";
	
    @RequestMapping
	public String list(Model model) {
		return LIST_VIEW;
	}

	@RequestMapping(params=EDIT_PARAM)
	public String form() {
		return FORM_VIEW;
	}

	@RequestMapping(params=EDIT_PARAM, method=RequestMethod.POST)
	public String save(@ModelAttribute(ATTRIBUTE) Task item, BindingResult result) {
		if (!new TaskValidator().validate(item, result)) {
			return FORM_VIEW;
		}
		System.out.println(item.getTitle());
		return "redirect:" + URL;
	}

	@ModelAttribute(ATTRIBUTE)
	protected Task model(@RequestParam(value=EDIT_PARAM, required=false) Long id) {
		return new Task();
	}

	@InitBinder
	protected void init(WebDataBinder dataBinder) {
	    dataBinder.setDisallowedFields(new String[] {"id", } );
	}

}
