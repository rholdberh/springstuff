package com.learningspring.anotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Logger {
    private ConsoleWriter consoleWriter;
    private FileWriter fileWriter;

    @Autowired
    public Logger(ConsoleWriter consoleWriter, FileWriter fileWriter){
        this.consoleWriter = consoleWriter;
        this.fileWriter = fileWriter;
    }


    public void setConsoleWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    public void writeFile(String text){
        fileWriter.write(text);
    }

    public void writeConsole(String text){
        consoleWriter.write(text);
    }
}
