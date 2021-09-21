package com.ashwin.android.sonarqube;

public class Service {
    public Service() {
    }

    public Service(String defOperation) {
    }

    public int add(int a, int b) {
        return calculate("add", a, b);
    }

    public int calculate(String operation, int a, int b) {
        if (operation == null || operation.isEmpty()) {
            return -1;
        }
        if (operation.equals("add")) {
            return a + b;
        }
        if (operation.equals("sub")) {
            return a - b;
        }
        return 0;
    }

    public void foo(int x) {
        if (x > 0) {
            System.out.println("positive");
        }
        if (x < 0) {
            System.out.println("negative");
        }
    }
}
