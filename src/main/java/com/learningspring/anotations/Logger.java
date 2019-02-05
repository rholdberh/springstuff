package com.learningspring.anotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Logger {
    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;


//
//    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter){
//        this.consoleWriter = consoleWriter;
//        this.fileWriter = fileWriter;
//    }

//    public Logger(){}

    @Autowired
    @Qualifier("toconsole")
    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Autowired
    @Qualifier("filewriter")
    public void setFileWriter(LogWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text){
        fileWriter.write(text);
    }

    public void writeConsole(String text){
        consoleWriter.write(text);
    }
}
