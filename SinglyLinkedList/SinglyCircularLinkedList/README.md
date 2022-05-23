# Singly Circular Linked List

![Diagrama em branco (2)](https://user-images.githubusercontent.com/88002748/169865406-07e73ba6-3dc1-44ae-bd38-0039abebc7ba.png)


### Node is the same

## Insert(int x)
```
No newNo = new No(x);
if(start == null) {
   start = newNo;
   start.next = start;  // It's a circle now 
} else {
  No temp = start;
  while(temp.next != start) // There's no Null
    temp = temp.next;
  newNo.next = start;       // Keeping the circle
  temp.next = newNo;
  }
}
```
