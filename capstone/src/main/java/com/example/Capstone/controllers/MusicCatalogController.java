package com.example.Capstone.controllers;

import com.example.Capstone.entities.Music;
import com.example.Capstone.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
public class MusicCatalogController {


    @Autowired
    MusicService musicService;


    @RequestMapping(value = "/display-music", method = RequestMethod.GET)
    public String displayMusic(ModelMap model) {
        String name = (String) model.get("name");
        Iterable<Music> Musics = musicService.GetAllMusic();

        model.put("music", musicService.GetAllMusic());
        return "display-Musics";
    }



}
