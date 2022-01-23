package com.muweiye.pattern.struct.facade;

public class Facade {

    private AService aService = new AService() {
        @Override
        public void funcA() {
            System.out.println("funcA");
        }
    };
    private BService bService = new BService() {
        @Override
        public void funcB() {
            System.out.println("funcB");
        }
    };

    void func() {
        aService.funcA();
        bService.funcB();
    }

}
