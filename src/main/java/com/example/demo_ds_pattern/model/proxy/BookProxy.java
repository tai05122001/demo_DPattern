package com.example.demo_ds_pattern.model.proxy;

import com.example.demo_ds_pattern.interfaces.IBookService;

public class BookProxy implements IBookService {
    private Book book = null;
    private boolean isAdmin = false ;

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public BookProxy(boolean isAdmin) {
        this.isAdmin = isAdmin ;
    }
    private void checkAccess() {
        if(!isAdmin){
            throw new SecurityException("Access denied for file: ");
        }
    }


    @Override
    public void read(String url) {
        checkAccess();
        if(this.book == null){
            this.book = new Book();
        }
        this.book.read(url);
    }



    @Override
    public void write(String s) {
        checkAccess();
        if(book == null){
            book = new Book();
        }
        this.book.write(s);
    }
}
