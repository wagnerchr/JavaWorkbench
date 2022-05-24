# Doubly Linked List
It's Doubly Linked, so it can also have navigate access to the previous values. <br>
Now the list have a "tail" or end.

![Diagrama em branco](https://user-images.githubusercontent.com/88002748/169656530-20cc2d2c-c11e-4f58-92f8-c0b76dd2bb91.png)

### Insert(int x)
```
  No newNo = new No(x);
  if(start == null) {
  start = newNo;
  end = newNo;
} else {
    novo.prev = end; // positioning itself in front of  end
    end.next = newNo; // end.next is the newNo 
    end = end.next; // newNo is the new end
        }
```
### Display( )
```
  if(start == null)
    System.out.println("Lista está vazia, não há nada para exibir :(");
  else {
     No temp = start;
        while(temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value) // Print last value
}
```
