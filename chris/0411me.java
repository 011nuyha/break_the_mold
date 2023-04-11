package class1clean;

public class werwa {
	public static void main(String[] args){
		  
        int x = -6;
        int y = -3;
       

        if(x<=1000 && x>=-1000 && x!=0) {
            if (y >= -1000 && y <= 1000 && y != 0) {
                if(x>0 && y>0)
                    System.out.println("("+ x + "," + y + ")은 1사분면 위에 있습니다.");
                else if(x<0 && y>0)
                    System.out.println("("+ x + "," + y + ")은 2사분면 위에 있습니다.");
                else if(x<0 && y<0)
                    System.out.println("("+ x + "," + y + ")은 3사분면 위에 있습니다.");
                else 
                    System.out.println("("+ x + "," + y + ")은 4사분면 위에 있습니다.");
            }
        }
    }
}
