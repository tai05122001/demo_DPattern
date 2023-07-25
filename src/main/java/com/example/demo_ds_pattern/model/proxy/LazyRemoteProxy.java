package com.example.demo_ds_pattern.model.proxy;

import com.example.demo_ds_pattern.interfaces.IRemote;

public class LazyRemoteProxy implements IRemote {
    private RemoteImpl remote = null ;
    @Override
    public void turnOn() {

        if(this.remote == null ) {
            this.remote = new RemoteImpl();
        }
        this.remote.turnOn();

    }

    @Override
    public void turnOff() {

        if(this.remote == null ) {
            this.remote = new RemoteImpl();
        }

        this.remote.turnOff();
    }
}
