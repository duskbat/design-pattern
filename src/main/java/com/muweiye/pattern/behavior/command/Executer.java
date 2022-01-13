package com.muweiye.pattern.behavior.command;

public interface Executer {

    <T> void execute(T param);

}
