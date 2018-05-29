package app.item.update;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import app.item.update.dto.ItemUpdateDto;

@Controller
public class ItemUpdate {

	@Autowired
	private ItemUpdateProcess itemUpdateProcess;

	/**
	 * 登録画面
	 * 
	 * @param model
	 * @return
	 */

	@RequestMapping(value = "/update/{itemCode}")
	public String select(@ModelAttribute ItemUpdateDto itemUpdateDto, Model model,
			@PathVariable("itemCode") String itemCode) {
		itemUpdateDto.setItemCode(itemCode);
		this.itemUpdateProcess.selectItem(model, itemUpdateDto);

		return "update";

	}

	@RequestMapping(value = "/updateConfirm")
	public String confirm(@ModelAttribute ItemUpdateDto itemUpdateDto, Model model) {
		model.addAttribute("itemConfirmDto", itemUpdateDto);
		return "updateConfirm";

	}

	@RequestMapping(value = "/updateComplete")
	public String complete(@ModelAttribute ItemUpdateDto itemUpdateDto, Model model) {

		this.itemUpdateProcess.updateItem(model, itemUpdateDto);

		return "redirect:/ItemSearch";

	}

}
