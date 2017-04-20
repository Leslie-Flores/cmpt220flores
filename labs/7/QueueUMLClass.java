// File: QueueUMLClass.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: Also part of Exercise 10.10
// Due date: April 20th, 2017
// Version 1.0

public class QueueUMLClass{
	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 8;

	QueueUMLClass() {
		elements = new int[DEFAULT_CAPACITY];
	}

	public void enqueue(int v) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size++] = v;
	}

	public int dequeue() {
		int v = elements[0];
		int[] temp = new int[elements.length];
		System.arraycopy(elements, 1, temp, 0, size);
		elements = temp;
		size--;
		return v;
	}

	public boolean empty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}
}