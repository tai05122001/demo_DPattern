package com.example.demo_ds_pattern.controller.observer.news;

import com.example.demo_ds_pattern.abstractclasses.Observer;
import com.example.demo_ds_pattern.model.observe.Subject;
import com.example.demo_ds_pattern.model.observe.VideoDataNew;

import java.util.Objects;

public class YoutubeNotifier extends Observer {
    public YoutubeNotifier(Subject subject) {
        this.subject = subject;
        this.subject.AttachObservers(this);
    }

    @Override
    public void Notify(Subject subject, Objects arg) {
        if(subject instanceof VideoDataNew videoDataNew){
            System.out.println(String.format("Notify all sub via Youtube with new data" +
                "\n\tName: "+ videoDataNew.get_title() +
                "\n\tDescription: " + videoDataNew.get_description() +
                "\n\tFile name: " + videoDataNew.get_filename()
        ));
        }
    }
//    @Override
//    public void Notify(String title, String description, String filename) {
//        System.out.println(String.format("Notify all sub via Youtube with new data" +
//                "\n\tName: "+ title +
//                "\n\tDescription: " + description +
//                "\n\tFile name: " + filename
//        ));
//
//    }
}
