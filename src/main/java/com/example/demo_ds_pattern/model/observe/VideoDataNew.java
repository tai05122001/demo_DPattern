package com.example.demo_ds_pattern.model.observe;

import com.example.demo_ds_pattern.controller.observer.old.EmailNotifier;
import com.example.demo_ds_pattern.controller.observer.old.PhoneNotifier;
import com.example.demo_ds_pattern.controller.observer.old.YoutubeNotifier;

public class VideoDataNew extends Subject {
    private String _title;
    private String _description;
    private String _filename;


    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
        videoDataChange();
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
        videoDataChange();

    }

    public String get_filename() {
        return _filename;
    }

    public void set_filename(String _filename) {
        this._filename = _filename;
        videoDataChange();
    }

    private void videoDataChange(){
        // pass a subject is a VideoDataNew and when use only need ref to attr of VideoDataNew
        NotifyObservers(this, null);
    }
}
