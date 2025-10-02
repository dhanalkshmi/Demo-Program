package org.test;

public class A extends B {
public A() {
System.out.println("Default const...");
}
public static void main(String[] args) {
A a=new A();
double d=10;

int p=(int)10.5;

System.out.println(d);
}
}