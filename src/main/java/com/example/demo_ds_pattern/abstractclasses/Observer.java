package com.example.demo_ds_pattern.abstractclasses;

import com.example.demo_ds_pattern.model.observe.Subject;

import java.util.Objects;

public abstract class Observer {

    protected Subject subject;
    public abstract void  Notify(Subject subject, Objects arg);
}
