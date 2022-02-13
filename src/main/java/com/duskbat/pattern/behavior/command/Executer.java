package com.duskbat.pattern.behavior.command;

public interface Executer {

    <T> void execute(T param);

}
