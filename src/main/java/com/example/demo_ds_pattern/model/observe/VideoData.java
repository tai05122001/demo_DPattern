package com.example.demo_ds_pattern.model.observe;

import com.example.demo_ds_pattern.controller.observer.old.EmailNotifier;
import com.example.demo_ds_pattern.controller.observer.old.PhoneNotifier;
import com.example.demo_ds_pattern.controller.observer.old.YoutubeNotifier;

public class VideoData  {
    private String _title;
    private String _description;
    private String _filename;



    private  EmailNotifier _emailNotifier ;
    private PhoneNotifier _phoneNotifier ;
    private YoutubeNotifier _youtubeNotifier ;

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
        String filename = get_filename();
        String description = get_description();
        String title = get_title();

        _emailNotifier.Notify(title,description,filename);
        _phoneNotifier.Notify(title,description,filename);
        _youtubeNotifier.Notify(title,description,filename);
    }
}
