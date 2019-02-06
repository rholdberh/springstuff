package com.learningspring.anotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;

public class Logger {
    private ConsoleWriter consoleWriter;
    private LogWriter fileWriter;
    private GodWriter godWriter;

    @Inject
    private WifeWriter wifeWriter;

    public void setWifeWriter(WifeWriter wifeWriter) {
        this.wifeWriter = wifeWriter;
    }

    @Resource(name = "someCrazyName")
    public void setGodWriter(GodWriter godWriter) {
        this.godWriter = godWriter;
    }

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

    void writeFile(String text) {
        fileWriter.write(text);
    }

    void writeGod(String text) {
        godWriter.write(text);
    }

    void writeConsole(String text) {
        consoleWriter.write(text);

    }
    void writeWife(String text) {
        writeWife().write(text);

    }

    @PostConstruct
    void init(){
        System.out.println("Init");
    }

    @PreDestroy
    void destroy(){
        System.out.println("Destroyed");
    }

}
