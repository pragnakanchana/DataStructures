class GfG
{
    public static boolean compute(Node node)
    {
        String s = "";
        Node temp = node;
        while(temp != null){
            s += temp.data;
            temp = temp.next;
        }
        //System.out.println(s);
        int c = s.length();
        for(int i = 0 ; i < c/2 ; i++){
            if(s.charAt(i) != s.charAt(c-i-1)){
                return false;
            }
        }
        return true;
    }
}