import java.util.Scanner;
public class Project3{
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        // JA: The first number is the width and the second one is the length
        System.out.println("Please enter the length: ");
        int length=input.nextInt();
        System.out.println("Please enter the width: ");
        int width=input.nextInt();
        char [][] game=new char [length][width]; //crating a matrix of characters
        input.nextLine(); 
        for(int i=0; i<game.length;i++){
            // getting input in the matrix
            String line = input.nextLine(); 
            for(int j=0; j<game[i].length;j++){ 
                game[i][j]=line.charAt(j);
            }
        }
        if (getEntryDoorWidth(game)!=null){
            //check if the entry door is on the width
            int [] entryDoorPosition1=getEntryDoorWidth(game);
            // get the posion of the entry door
            int[] exitDoorPosition1=getExitDoorPosition(game, entryDoorPosition1);
            // get the position of the exit door
            System.out.println(entryDoorPosition1[0]+" , "+entryDoorPosition1[1]);
        }
        else if(getEntryDoorLength(game)!=null){
            // check if the door is on the length
            int[]entryDoorPosition2=getEntryDoorLength(game);
            System.out.println(entryDoorPosition2[0]+" , "+entryDoorPosition2[1]);
        }
    }
    public static int [] getEntryDoorWidth(char A[][]){
        //this function tries to get the location of the entry door on the right side, and it returns its position as an array
        for(int i=0; i<A[0].length;i++){
            if(A[i][0]=='*'){
                int [] position={i,0};
                return position;
            }
        }
        return null;
    }
    public static int [] getEntryDoorLength(char A[][]){
        //this function tries to get the location of the entry door on the top , and it returns its position as an array
        for(int i=0; i<A.length;i++){
            if(A[0][i]=='*'){
                int [] position={0,i};
                return position;
            }
        }
        return null;
    }
public static int[] getExitDoorPosition(char B[][],int P[]){
    //this function tries to get the location of the exit door when the entry door is on the right side, and it returns its position as an array
    int []start=new int[P.length];
    start[0]=P[0]; // take the position of the entry door as a starting point
    start[1]=P[1];
    for(int i=start[1];i<B.length;i++){
        // start from the location of the entry door and move forward
        if(B[start[0]][i]=='x'){
            int[] P1={start[0],i};
            // if you hit the wall, take that posion and return it
            return P1;
        }
        else if(B[start[0]][i]=='/'){
            for (int k=start[0];k<B[0].length;k++){
                // or if you hit the '/' character, change direction and move upward
                if(B[k][i]=='x'){
                    // while you are movin upward, if you hit the wall, take that position and return it
                    int [] P2={k,i};
                    return P2;
                }
                else if(B[k][i]=='/'){
                    //while you are moving upward, if you hit the '/' character, take that position this time and start over the call from that position
                    int []P3={k,i};
                    return getExitDoorPosition(B, P3);
                } 
            }
        }
        else if(B[start[0]][i]=='\\'){
            // or if you hit the '\' character, change direction and move downward
            for(int j=i;j<B.length;j--){
                // wile you are moving downward, if you hit the wall, take that position and return it
                if(B[start[0]][j]=='x'){
                    int[] P4={start[0],j};
                    return P4;
                }
                else if(B[start[0]][j]=='\\'){
                    //while you are moving downward, if you hit '\'character again, take that positon and start over the function from that positon
                    int []P5={start[0],j};
                    return getExitDoorPosition(B, P5);
                }
            }
        }
    }
    return null;
}
}