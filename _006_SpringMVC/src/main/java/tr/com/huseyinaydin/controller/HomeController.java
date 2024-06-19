package tr.com.huseyinaydin.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tr.com.huseyinaydin.service.PersonelServis;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Spring MVC
*
*/

@Controller
@RequestMapping(value = "/merkez")
public class HomeController {

	@Autowired
	PersonelServis personelServis;

	@RequestMapping(value = "/detay/{id}/{adi}/{soyadi}", method = RequestMethod.GET)
	public String anasayfa(@PathVariable("id") int id, @PathVariable("adi") String adi,
			@PathVariable("soyadi") String soyadi, Model model) {

		if (personelServis.getPersonelBilgisi(id)) {

		} else {

		}
		model.addAttribute("id", id);
		model.addAttribute("adi", adi);
		model.addAttribute("soyadi", soyadi);
		return "home";
	}
}