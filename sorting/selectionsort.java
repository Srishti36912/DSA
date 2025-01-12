package sorting;
public class selectionsort {
    

int select(int arr[], int i)
{
    // code here such that selecionSort() sorts arr[]
    int min = i;
    for(int j= 0; j<i; j++) {
        if(arr[j] > arr[min]) {
          min = j;
        }
    }
    return min;
}

void selectionSort(int arr[], int n)
{
  //code here
  int temp = 0;
  for(int i=n-1; i>=0; i--) {
    int min = select(arr,i);
      
    temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
    }
}
}
