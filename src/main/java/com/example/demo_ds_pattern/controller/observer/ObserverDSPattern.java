package com.example.demo_ds_pattern.controller.observer;


import com.example.demo_ds_pattern.controller.observer.news.EmailNotifier;
import com.example.demo_ds_pattern.controller.observer.news.FacebookNotifier;
import com.example.demo_ds_pattern.controller.observer.news.PhoneNotifier;
import com.example.demo_ds_pattern.controller.observer.news.YoutubeNotifier;
import com.example.demo_ds_pattern.model.observe.VideoDataNew;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "observer")
public class ObserverDSPattern {

    @GetMapping
    public String index(){
        VideoDataNew videoDataNew = new VideoDataNew();
        EmailNotifier emailNotifier = new EmailNotifier(videoDataNew);
        YoutubeNotifier youtubeNotifier = new YoutubeNotifier(videoDataNew);
        PhoneNotifier phoneNotifier  = new PhoneNotifier(videoDataNew);
        videoDataNew.set_title("Video UTC đã được upload ");
        videoDataNew.DetachObservers(youtubeNotifier);
        System.out.println("----------------------------------");
        videoDataNew.set_description("Nhanh chóng đăng kí");
        FacebookNotifier facebookNotifier = new FacebookNotifier(videoDataNew);
        System.out.println("----------------------------------");
        videoDataNew.set_filename("abc");
        return "index";
    }
}
