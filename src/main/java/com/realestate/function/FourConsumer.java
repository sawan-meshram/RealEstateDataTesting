package com.realestate.function;

@FunctionalInterface
public interface FourConsumer<T, U, V, W> {
	void accept(T t, U u, V v, W w);
}
