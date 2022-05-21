# Circular Doubly Linked List

![DataStructure (1)](https://user-images.githubusercontent.com/88002748/169656007-d372a928-946e-4488-92b5-15f2be25f2d0.png)

#### Insert(int x) 
```
  No newNo = new No(x);
  if(start == null) {
    start = end = newNo;  // Just one value in the circle
    start.next = end;     // It's a circle
    end.next = start;     // It's a circle
  } else {
    newNo.next = start;   
    start.prev = newNo;
    newNo.prev = end;
    end = end.next;
  }
}
```