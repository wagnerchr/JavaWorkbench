# Stack
### FILO -> First in Last Out
```
public static int N = number of elements in array;
public static int vet[] = new int[N];
public static int topIndex = -1;
```
## Add to Stack(int x)
```
if(Full())
  System.out.println("Stack is full, can't add more");
else {
  topIndex++; // Increment stack
  vet[topIndex] = x;
}
```

## Take one out()
```
if(Empty())
  System.out.println("Stack is already empty, can't remove more");
else 
  vet[topIndex] = vet[topIndex--] // New topIndex 
```
## int topIndex() 
```
if(Empty()) {
  System.out.println("Stack is empty");
  return 0;
} else {
  System.out.println("The top value is: ")
  return vet[topIndex];
}
```
## int Size()
```
if(Empty()) {
  System.out.println("Stack is empty")
  return 0;
} else {
  int count = 1;
  for(int i = 0; i < topIndex; i++)
    count++;
  return count; // That's the size of stack
}
```

## boolean Full()
```
if(topIndex >= N -1)
  return true;
return false;
```
## boolean Empty()
```
if(topIndex == -1)
  return true;
return false;

```
