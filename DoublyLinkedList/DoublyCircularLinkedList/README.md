# Circular Doubly Linked List

![DataStructure (1)](https://user-images.githubusercontent.com/88002748/169656007-d372a928-946e-4488-92b5-15f2be25f2d0.png)

## Insert(int x) 
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
  end.next = newNo;
  end = end.next;
  }
}
```
## Display( )
```
if(start == null)
  System.out.println("List is empty");
else {
  No temp = start; 
  while(temp != end) {
    System.out.println(temp.value);
    temp = temp.next;
  }
  System.out.println(temp.value); // Print last value
}
```
## Remove First( ) 
```
if(Empty())
  System.out.println("List is Empty, can't remove a value");
else if(start == end)
  start = end = null;  // If list has this only value
else {
  start = start.next;
  start.prev = end;
  end.next = start;
}
```
## Remove Last( )
```
if(Empty())
  System.out.println("List is Empty, can't remove a value");
else if(end == start)
  end = start = null;  // If list has this only value
else {
  end = end.prev;
  end.next = start;
  start.prev = end;
}
```
## RemoveValue(int x) 
```
  if(Empty())
    System.out.println("List is empty, can't remove a value")
  else {
    No temp = start;
    while(temp != end && temp.value != x)
      temp = temp.next;
    if(start == end)  // If list has this only value
      start = end = null;
    else {
      if(temp == start)
        RemoveFirst();
      else if(temp == end)
        RemoveLast();
      else {
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
      } 
    }
  }
  
```

## boolean Empty( )
```
if(start == null)
  return true;
return false;
```
