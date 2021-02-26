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

import org.springframework.ui.Model;


@Controller
public class MusicCatalogController {


    @Autowired
    MusicService musicService;


    @RequestMapping(value = "/music_catalog", method = RequestMethod.GET)
    public String greeting(Model model) {

        Iterable<Music> Musics = musicService.GetAllMusic();

        model.addAttribute("music", musicService.GetAllMusic());
        return "music_catalog";
    }



}
