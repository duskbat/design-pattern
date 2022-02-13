package com.duskbat.pattern.behavior.command;

public interface Command {

    <T> void execute(T param);
}
