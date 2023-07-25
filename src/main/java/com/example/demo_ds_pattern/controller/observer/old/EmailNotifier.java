package com.example.demo_ds_pattern.controller.observer.old;

import com.example.demo_ds_pattern.interfaces.INotifty;

public class EmailNotifier implements INotifty {
    @Override
    public void Notify(String title, String description, String filename) {
        System.out.println(String.format("Notify all sub via Email with new data" +
                        "\n\tName: "+ title +
                        "\n\tDescription: " + description +
                        "\n\tFile name: " + filename
                ));

    }
}
