public class CmdLine {
    public static void main(String args[]){
        if (args.length > 0){
            System.out.println("command line args elements are:");
            for(String val : args)
                System.out.println(val);
        }
        else
            System.out.println("No cmd line arguments");
        
    }
}
