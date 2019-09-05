package com.example.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AnmolRepository;
import com.example.demo.model.Anmol;

@Controller
public class HomePageController {

	@Autowired
	AnmolRepository aRepo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/addAnmolTable")
	public String addAnmolTable(Anmol anmol) {
		anmol.setId(new Random().nextInt(400));
		aRepo.save(anmol);
		return "home.jsp";
	}

	@RequestMapping("/getAnmolRow")
	public ModelAndView getAnmolRecord(@RequestParam String id) {
		ModelAndView mv = new ModelAndView("getRecord.jsp");
		Optional<Anmol> a1 = aRepo.findById(Integer.valueOf(id));
		Anmol anmol = a1.get();
		mv.addObject(anmol);

		System.out.println(aRepo.findByLname("Deep"));
		System.out.println(aRepo.findByIdGreaterThan(200));
		System.out.println(aRepo.findByLnameSortedId("Deep"));

		return mv;
	}

	// jackson-core converts JAVA object into JSON
	// produces forces to produce data of type json
	@RequestMapping(path = "/aliens", produces = { "application/json" })
	@ResponseBody
	public List<Anmol> getAnmolRowRest() {
		return aRepo.findAll();
	}

	// jackson-core converts JAVA object into JSON
	// produces forces to produce data of type xml
	// add dependency of jackson-dataformat-xml
	@RequestMapping(path = "/alien/{id}", produces = { "application/xml" })
	@ResponseBody
	public Optional<Anmol> getAnmolRowRest(@PathVariable("id") String id) {
		return aRepo.findById(Integer.valueOf(id));
	}
}
