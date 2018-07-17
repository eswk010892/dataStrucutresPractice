//Interface for implementing stack using linked list
public interface Stack<Item> {
Item pop();
void push(Item item);
boolean isEmpty();
int size();
}
