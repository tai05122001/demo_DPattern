package com.example.demo_ds_pattern.model.observe;

import com.example.demo_ds_pattern.abstractclasses.Observer;

import java.util.ArrayList;
import java.util.Objects;

public class Subject {
    private ArrayList<Observer> _observers = new ArrayList<Observer>();

    public void AttachObservers (Observer iObserver){
        _observers.add(iObserver);

    }
    public void DetachObservers (Observer iObserver){
        _observers.remove(iObserver);

    }
    public void NotifyObservers (Subject subject, Objects arg){
        _observers.forEach((observer)-> observer.Notify(subject, arg));

    }

}
