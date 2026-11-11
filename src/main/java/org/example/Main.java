package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        PrintNumber printNumber = new PrintNumber();
        PrintNumberWithName printNumberWithName = new PrintNumberWithName();
        printNumberWithName.start();
        printNumber.start();
    }
}
