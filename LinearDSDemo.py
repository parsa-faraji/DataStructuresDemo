from collections import deque

# Array demo
def array_demo():
    array = [1, 2, 3, 4, 5]
    print("Array:")
    print(" ".join(map(str, array)))
    print()

# Linked List demo
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def linked_list_demo():
    head = Node(1)
    second = Node(2)
    third = Node(3)
    
    head.next = second
    second.next = third
    
    print("Linked List:")
    current = head
    while current:
        print(current.data, end=" ")
        current = current.next
    print("\n")

# Stack demo
def stack_demo():
    stack = []
    stack.append(1)
    stack.append(2)
    stack.append(3)
    
    print("Stack:")
    while stack:
        print(stack.pop(), end=" ")
    print("\n")

# Queue demo
def queue_demo():
    queue = deque()
    queue.append(1)
    queue.append(2)
    queue.append(3)
    
    print("Queue:")
    while queue:
        print(queue.popleft(), end=" ")
    print("\n")

# Main function to run all demos
if __name__ == "__main__":
    array_demo()
    linked_list_demo()
    stack_demo()
    queue_demo()
