@FunctionalInterface
interface lamFun{
    int operation(int a,int b);
}
class Lambda{
    public static void main(String[] args) {
        lamFun lfadd = (x,y) -> {System.out.println(x+y);
                                    return x+y;
                                };
        lamFun lfmul = (x,y) -> {System.out.println(x*y);
                                    return x*y;
                                };
        
        lfadd.operation(1,2);
        lfmul.operation(1,2);   
    }
}