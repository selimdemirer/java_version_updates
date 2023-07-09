package com.cydeo.orangeTask;

@FunctionalInterface // I can create lambda for this.
abstract public interface OrangeFormatter {
    String accept(Orange orange);
}
