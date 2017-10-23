import java.lang.Integer;
public class Ex3{

    public static void main(String[] args){
        if (args.length != 1){
            System.out.println("You can only specify one positive integer.");
            System.exit(1);
        }

        int arg = 0;
        try{
            arg = Integer.valueOf(args[0]);
        }catch(Exception e){
            System.out.println(args[0]+" was not a valid positive integer.");
            System.exit(1);
        }

        if (arg < 0){
            System.out.println(arg+" is not positive.");
            System.exit(1);
        }

        int tryAns = call_triangle(arg);
        System.out.println("Tri(n) = " + tryAns);
        int lazyAns = call_lazy_caterer(arg);
        System.out.println("Lazy(n) = " + lazyAns);


    }


    public static int call_triangle(int arg)
    {
        return arg*(arg+1)/2;
    }

    public static int call_lazy_caterer(int arg)
    {
        return (arg*arg + arg + 2)/2;
    }

}
