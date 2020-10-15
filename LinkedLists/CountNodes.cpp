int getCount(struct Node* head){

    struct Node* p = head;
    int c = 0;
    while(p  != NULL){
        c++;
        p = p-> next;
    }
    return c;

}