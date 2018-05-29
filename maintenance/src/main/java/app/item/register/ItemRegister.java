package app.item.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import app.item.dto.ItemDto;

@Controller
public class ItemRegister {

	@Autowired
	private ItemRegisterProcess itemRegisterProcess;

	/**
	 * 登録画面
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/register")
	public String register(Model model) {

		ItemDto itemDto = new ItemDto();
		model.addAttribute("itemDto", itemDto);

		return "register";

	}

	/**
	 * 登録処理を行い、検索画面に遷移します。
	 * 
	 * @param itemDto
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/complete")
	public String complete(@ModelAttribute ItemDto itemDto, Model model) {

		this.itemRegisterProcess.register(itemDto);
		return "redirect:/ItemSearch";

	}

}
