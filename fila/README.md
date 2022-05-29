# QUEUE 
### FIFO -> First in First Out
```
public static int N = number of elements in array;
public static int vet[] = new int[N];
public static int front = -1;
public static int back = -1;
public static int total;
```
## Add to Queue(int x)
```
  if(Full())
    System.out.println("Queue is full, can't add more")
  else {
    back++;         // The entry is alway the behind of the queue                   
    vet[back] = x;  // The value is the last in the queue until another one enters to be the new last one
    if(back == N)   // If Queue is full, int back don't recieve a value
      back = 0;
    total++;      // Always increment the total
  }
```
## Dequeue()
```
  if(Empty())
    System.out.println("Queue is already empty, can't remove more")
  else {
    front++;            // int front is incremented, eliminating the first value
    int x = vet[front]  // x is the first posticion, who is gonna leave the queue
    if(front == N)      
      front = 0;
    total--;
  }
```
## int Size() {
  System.out.println("The size of the Queue is: ")
  return total;
}

## boolean Full()
```
  if(total == N) 
    return true;
   return false
```
## boolean Empty()
```
  if(total == 0)
    return true;
   return false;
```
