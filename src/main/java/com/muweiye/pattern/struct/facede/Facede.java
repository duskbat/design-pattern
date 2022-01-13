package com.muweiye.pattern.struct.facede;

public class Facede {

    private AService aService = new AService() {
        @Override
        public void funcA() {

        }
    };
    private BService bService = new BService() {
        @Override
        public void funcB() {

        }
    };

    void func() {
        aService.funcA();
        bService.funcB();
    }

}
