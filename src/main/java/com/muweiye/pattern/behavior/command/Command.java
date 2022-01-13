package com.muweiye.pattern.behavior.command;

public interface Command {

    <T> void execute(T param);
}
