package com.tobeto.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tobeto.dataAccess.abstracts.LanguageRepository;
import com.tobeto.entities.concretes.Language;

@Service
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> language;
	
	public InMemoryLanguageRepository() {
		language = new ArrayList<Language>();
		language.add(new Language(1, "C++"));
		language.add(new Language(1, "Pascal"));
		language.add(new Language(1, "JavaScript"));
		language.add(new Language(1, "PHP"));
	}

	@Override
	public List<Language> getAll() {
		
		return language;
	}

	@Override
	public Language getById(int id) {
		for (Language language : language) {
			if(language.getId()== id) {
				return language;
			}
		}
		return null;
	}

	@Override
	public void update(int id, String newName) {
		Language programmingLanguage2 = getById(id);
		programmingLanguage2.setName(newName);
		
	}

	@Override
	public void add(Language language) {
		language.add(language);
		
	}

	@Override
	public void delete(int id) {
		for (Language l : language) {
			if (l.getId() ==id) {
				language.remove(l);
			}
		}
		
	}

}
