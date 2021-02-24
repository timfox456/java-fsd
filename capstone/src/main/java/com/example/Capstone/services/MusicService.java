package com.example.Capstone.services;


import com.example.Capstone.entities.Music;
import com.example.Capstone.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MusicService {

    @Autowired
    private MusicRepository MusicRepository;

    public Iterable<Music> GetAllMusic()
    {
        return MusicRepository.findAll();
    }


    public Iterable<Music> SearchKeywordMusic(String keyword)
    {
        //TODO: this needs to be made much more robust.
        List<Music> returnList = new ArrayList<Music>();

        //TODO: we would want to search all attributes of music for the keyword, not just name.

        for (Music m : MusicRepository.findAll()) {
            if (m.getName().contains(keyword)) {
                returnList.add(m);
            }
        }
        return returnList;
    }
    public Optional<Music> GetMusicById(Integer id)  {
        Optional<Music> foundMusic = MusicRepository.findById(id);

        return (foundMusic);
    }

    public Music AddMusic(Music Music) {
        return MusicRepository.save(Music);
    }

    public void DeleteMusic(Music Music) {
        MusicRepository.delete(Music);
    }


}
