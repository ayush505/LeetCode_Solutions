class Solution {
    public String decodeString(String s) {
        Stack<Character>stk=new Stack<>();
        //int i=0;
        int j=s.length()-1;
        String temp="";
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)!=']') {
                stk.push(s.charAt(i));
                
            }
            else {
                temp="";
                while(stk.size() > 0 && stk.peek()!='[')
                {
                    temp+=stk.pop();
                }
                stk.pop();
                String num="";
                while(stk.size() > 0 && stk.peek()>='0' && stk.peek()<='9')
                {
                    num=stk.pop()+num;
                }
                int l=Integer.parseInt(num);  
                while(l>0)
                {
                    for(int x=temp.length()-1;x>=0 ;x--)
                    stk.push(temp.charAt(x));
                    l--;
                }
                
                
            }
               
        }
        temp="";
        while(stk.size()>0) {
            temp = stk.pop()+temp;
        }
        
        return temp;
    }
}