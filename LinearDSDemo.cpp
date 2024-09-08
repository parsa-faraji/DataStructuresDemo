#include <iostream>
#include <stack>
#include <queue>
using namespace std;

// Array demo
void arrayDemo() {
    int array[] = {1, 2, 3, 4, 5};
    cout << "Array:" << endl;
    for (int i = 0; i < 5; i++) {
        cout << array[i] << " ";
    }
    cout << endl << endl;
}

// Linked List demo
struct Node {
    int data;
    Node* next;
};

void linkedListDemo() {
    Node* head = new Node();
    Node* second = new Node();
    Node* third = new Node();
    
    head->data = 1;
    head->next = second;
    
    second->data = 2;
    second->next = third;
    
    third->data = 3;
    third->next = nullptr;
    
    cout << "Linked List:" << endl;
    Node* current = head;
    while (current != nullptr) {
        cout << current->data << " ";
        current = current->next;
    }
    cout << endl << endl;
}

// Stack demo
void stackDemo() {
    stack<int> stack;
    stack.push(1);
    stack.push(2);
    stack.push(3);
    
    cout << "Stack:" << endl;
    while (!stack.empty()) {
        cout << stack.top() << " ";
        stack.pop();
    }
    cout << endl << endl;
}

// Queue demo
void queueDemo() {
    queue<int> queue;
    queue.push(1);
    queue.push(2);
    queue.push(3);
    
    cout << "Queue:" << endl;
    while (!queue.empty()) {
        cout << queue.front() << " ";
        queue.pop();
    }
    cout << endl << endl;
}

int main() {
    arrayDemo();
    linkedListDemo();
    stackDemo();
    queueDemo();
    
    return 0;
}
