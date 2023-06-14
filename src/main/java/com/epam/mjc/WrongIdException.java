package com.epam.mjc;

public class WrongIdException extends IllegalArgumentException{
    public WrongIdException(String message){
        super(message);
    }
}
