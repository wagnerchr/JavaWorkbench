# Singly Linked List

![Diagrama em branco (1)](https://user-images.githubusercontent.com/88002748/169662075-00a5f5b7-e7d9-44dd-91de-2a87d1f35f8c.png)


## Node
```
public class No {
 public int value;
 public No next;
 
 public No(int x) {
    this.value = x;
    this.next = null;
}}
```
## Insert(int x)
```
No newNo = new No(x);
if(start == null) 
  start = newNo;
else {
  No temp = start;
  while(temp.next != null) 
    temp = temp.next;
  temp.next = newNo;
}
```
## Display( )
```
if(start == null) 
  System.out.println("List is empty");
else {
    No temp = start;
    while(temp.next != null) {
     System.out.println(temp.value)
     temp = temp.next
    }
    System.out.println(temp.value) // Print last value
}
```
