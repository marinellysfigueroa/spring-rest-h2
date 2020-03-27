package com.mefa.springresth2.student;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String exception) {
        super(exception);
    }
}
