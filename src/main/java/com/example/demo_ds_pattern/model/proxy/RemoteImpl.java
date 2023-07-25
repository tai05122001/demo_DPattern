package com.example.demo_ds_pattern.model.proxy;

import com.example.demo_ds_pattern.interfaces.IRemote;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class RemoteImpl implements IRemote {

    private String path = "";

    public String getPath() {
        return path;
    }

    public RemoteImpl() {

    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void turnOn() {
        System.out.println("Turn on the light ");

    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the light ");

    }
}
