// Time : O(n), Space : O(1).
package Queue;
public class circular_tour {
    int tour(int petrol[], int distance[]) {
        int start = 0, prevPetrol = 0, curPetrol = 0;
        for(int i = 0; i<petrol.length; i++) {
            curPetrol += (petrol[i] - distance[i]);
            if(curPetrol < 0) {
                start = i + 1;
                prevPetrol += curPetrol;
                curPetrol = 0;
            }
        }
        if((curPetrol + prevPetrol) < 0)
            return -1;
        return start;
    }
}
