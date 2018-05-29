package app.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import app.item.search.dto.ItemSeaerchDto;

@Controller
public class ItemSearch {

	@Autowired
	private ItemSearchProcess itemSearchProcess;

	@RequestMapping(value = "/ItemSearch")
	public String itemSearch(Model model) {

		ItemSeaerchDto itemSeaerchDto = new ItemSeaerchDto();
		model.addAttribute("itemSeaerchDto", itemSeaerchDto);

		return "itemSearch";
	}

	@RequestMapping(value = "/search")
	public String search(@ModelAttribute ItemSeaerchDto itemSeaerchDto, Model model) {

		this.itemSearchProcess.search(model, itemSeaerchDto);

		return "itemSearch";
	}
}
