package com.tobeto.business.abstracts;

import java.util.List;

import com.tobeto.entities.concretes.Language;

public interface LanguageService {
     List<Language> getAll();
     
     Language getById(int id) throws Exception;
     
     void update(int id, String newName) throws Exception;
     
     void add(Language language);
     
     void delete(int id);
}
