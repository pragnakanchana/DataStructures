class GFG
{
	int isLengthEvenorOdd(Node head)
	{
	    int c = 0;
     Node p = head;
     while(p != null){
         c++;
         p = p.next;
     }
     if(c % 2 == 0){
         return 0;
     }
     return 1;
	}
}