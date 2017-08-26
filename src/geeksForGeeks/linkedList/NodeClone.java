package geeksForGeeks.linkedList;


public class NodeClone {
	int data;//Node data
	NodeClone next, random;//Next and random reference
 
    //Node constructor
    public NodeClone(int data)
    {
        this.data = data;
        this.next = this.random = null;
    }
}
