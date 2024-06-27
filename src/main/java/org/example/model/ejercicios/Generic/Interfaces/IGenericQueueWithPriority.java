package org.example.model.ejercicios.Generic.Interfaces;

public interface IGenericQueueWithPriority<Value, Priority> {
    Value getFirst();
    Priority getPriority();
    void add(Value item, Priority priority);

    void remove();

    boolean isEmpty();

    int size();
}