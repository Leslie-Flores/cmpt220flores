// File: QueueClass.java
// Author: Leslie Flores
// Course: CMPT220
// Assignment: The Quene Class (Exercise 10.10)
// Due date: April 20th, 2017
// Version 1.0

public class QueueClass {
	public static void main(String[] args) {
		QueueUMLClass queue = new QueueUMLClass();

		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
		}

		while (!queue.empty()) {
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println();
	}
}