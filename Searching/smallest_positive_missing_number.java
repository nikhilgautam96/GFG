package Searching;
public class smallest_positive_missing_number {
    static int missingNumber(int arr[], int size) {
        // The answer to this question will always be b/w "1 to N+1"
        // first lets check if there is '1' in array, if not then '1' is the answer
        int check = 0;
        for(int i = 0; i<size; i++) {
            if(arr[i] == 1) {
                check = 1;
                break;
            }
        }
        if(check == 0) {
            return 1;
        }
        // else '1' is there in the array so, ans will be b/w "2 to N+1"
        // lets make all the '-ve numbers' & 'numbers > N' as 1.
        // bcz '1' is already there and it can't be the answer now.
        for(int i = 0 ; i<size; i++) {
            if(arr[i] > size || arr[i] < 1) {
                arr[i] = 1;
            }
        }
        // for every index "arr[i] - 1" we will increment its value by 'N'
        // This will ensure that a particular index has been accesed.
        // we do 'arr[i]-1' bcz arr has '1 to N' values so,
        // '0 index will represent 1', '1 index will represent 2', and so on till
        // 'N-1 represents N'
        for(int i = 0; i<size; i++) {
            arr[(arr[i]-1)%size] += size; 
        }
        // now every index's value is increased by atleast 'N', so it becomes
        // atleat 'N+1' except,
        // the index where the value is <= N that is our answer.
        // if no index has value <= N then 'N+1' is our answer.
        for(int i = 0 ; i<size; i++) {
            if(arr[i] <= size) return i+1;
        }
        return size+1;
    }
}
