package LinkedList;
public class Intersection_point_of_2_list {
    int intersectPoint(Node head1, Node head2) {
	    Node dumy1 = head1, dumy2 = head2;
	    while(dumy1 != dumy2) {
	        dumy1 = (dumy1 == null) ? head2 : dumy1.next;
	        dumy2 = (dumy2 == null) ? head1 : dumy2.next;
	    }
	    if(dumy1 == null)
	        return -1;
	    return dumy1.data;
	}
}
