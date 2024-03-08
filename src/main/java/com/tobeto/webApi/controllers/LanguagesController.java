package com.tobeto.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.business.abstracts.LanguageService;
import com.tobeto.entities.concretes.Language;

@RestController //annotation
@RequestMapping("api/languages")
public class LanguagesController {
   private LanguageService languageService;

  @Autowired
public LanguagesController(LanguageService languageService) {
	
	this.languageService = languageService;
}
   
@GetMapping("/getall")
   public List<Language> getAll(){
	   return languageService.getAll();
   }
@GetMapping("/getbyid")
public Language getById(int id) throws Exception{
	return languageService.getById(id);
}

@GetMapping("/update")
public void update(int id, String newName) throws Exception {
	languageService.update(id, newName);
}

@GetMapping("/add")
public void add(Language language) {
	languageService.add(language);
}

@GetMapping("delete")
public void delete(int id) {
	languageService.delete(id);
   }
}
