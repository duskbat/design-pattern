package com.duskbat.pattern.behavior.command;

public class CommandB implements Command {

    private final Executer executer = new Executer() {
        @Override
        public <T> void execute(T param) {

        }
    };

    @Override
    public <T> void execute(T param) {
        executer.execute(param);
    }

}
