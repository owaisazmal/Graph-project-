//Graph Assignment
//Owais Khan
import java.util.LinkedList;
import java.util.Scanner;
import tools.*;
public class Graph {
    class itm {
        public char vertex;
        public int ShortestDist;
        public int vertexFrom;
        public boolean marked;
      };

int[] visited = {0,0,0,0,0};
itm[] TabularDepiction = new itm[5];
void DisplayDFS(int[][] arr, int nodeNumber){
   
    // System.out .print (nodeNumber);
    // for (int i=0; i < 5; i++)
    // {
    // if ((adj[nodeNumber][i]!=0) && (visited[i] ==0))
        
    //     DisplayDFS(adj, i);
        
    //     }
    // }
    // System.out.println("nodeNumber" + nodeNumber);
    visited[nodeNumber] = 1;

    for(int i = 0; i < 5; i++)
        {
            if(arr[nodeNumber][i] != 0 && (visited[i] != 1))
            {
               Connections(arr);
               // Connections(nodeNumber, i);
                DisplayDFS(arr, i);
            }
        }
    }

void Connections(int[][] arr) 
{   if(arr.equals(0)){ 

        
} 
else{
    Connect_A_B();
        Connect_A_C();
        Connect_A_D();
        //Connect_A_E();
        //Connect_B_A();
        Connect_B_C();
        // Connect_B_D();
        // Connect_B_E();
        //Connect_C_A();
        //Connect_C_B();
        Connect_C_D();
        // Connect_C_E();
        // Connect_D_A();
        // Connect_D_B();
        // Connect_D_C();
        // Connect_D_E();
        // Connect_E_C();
        // Connect_E_A();
        // Connect_E_B();
        // Connect_E_C();
        Connect_E_D();
}
        
    
}
    

public static void printxy(int col, int row, String val)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%s[%d;%df",escCode,row,col));
        System.out.print(val);
    }

void PrintInfo(int[][] arr)
    {
    DisplayDFS(arr, 0);
    }

public void DisplayCard(int x, int y, int cardNumber) {
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 11; j++) {
            // System.out.print(card[i][j]);
            if (card[cardNumber][i][j] == 0) {
                printxy(x+j, y+i, " ");
                printxy(x + j, y + i, String.valueOf(fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]));
            } else if ((card[cardNumber][i][j] >= 1) && (card[cardNumber][i][j] <= 9)) {
                printxy(x + j, y + i, String.valueOf(fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                        + card[cardNumber][i][j]));          
            } 
            else if ((card[cardNumber][i][j] == 10)) {
                printxy(x + j - 1, y + i, fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                        + "1");
                printxy(x + j, y + i, fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                + "0");
            }
            else {
                printxy(x + j, y + i, String.valueOf(fcolor[cardNumber][i][j] + bcolor[cardNumber][i][j]
                        + Symbols.EXTENDED[card[cardNumber][i][j]]));
            }
        }
    }
}

int[][][] card = 
{
    //A
    { {90,68,68,68,68,68,68,68,68,68,63},
    {51,0,0,0,92,91,92,0,0,0,51},
    {51,0,0,91,91,0,91,91,0,0,51},
    {51,0,0,91,95,95,95,91,0,0,51},
    {51,0,0,91,0,0,0,91,0,0,51},
    {64,68,68,68,68,68,68,68,68,68,89} }, 
    //B
    { {90,68,68,68,68,68,68,68,68,68,63},
    {51,0,0,92,92,92,92,92,0,0,51},
    {51,0,0,91,91,0,0,91,0,0,51},
    {51,0,0,91,91,92,92,91,92,0,51},
    {51,0,0,91,91,92,92,92,91,0,51},
    {64,68,68,68,68,68,68,68,68,68,89} }, 
    //C
    { {90,68,68,68,68,68,68,68,68,68,63},
    {51,0,0,91,91,91,91,91,91,0,51},
    {51,0,91,91,0,0,0,0,0,0,51},
    {51,0,91,91,0,0,0,0,0,0,51},
    {51,0,0,91,91,91,91,91,91,0,51},
    {64,68,68,68,68,68,68,68,68,68,89} }, 
    //D
    { {90,68,68,68,68,68,68,68,68,68,63},
    {51,0,0,91,91,91,91,92,0,0,51},
    {51,0,0,91,0,0,0,0,91,0,51},
    {51,0,0,91,0,0,0,0,91,0,51},
    {51,0,0,91,91,91,91,95,0,0,51},
    {64,68,68,68,68,68,68,68,68,68,89} }, 
    //E
    { {90,68,68,68,68,68,68,68,68,68,63},
    {51,0,91,91,95,95,95,95,91,0,51},
    {51,0,91,91,92,92,0,0,0,0,51},
    {51,0,91,91,0,0,0,0,0,0,51},
    {51,0,91,91,92,92,92,92,91,0,51},
    {64,68,68,68,68,68,68,68,68,68,89} }, 
};
    
String bcolor[][][] = {
    {
    //A
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,  Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },
    //B
    { 
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,  Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },
    //C
    { 
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,  Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },
    //D
    { 
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,  Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } },
    //E
    { 
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND },
    { Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND,  Colors.BLACK_BACKGROUND, Colors.BLACK_BACKGROUND } }

    };

    String fcolor[][][] = {
        //A
        { {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN},
        {Colors.CYAN,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN} },
        //B
        { {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN},
        {Colors.CYAN,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN} },
        //C
        { {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN},
        {Colors.CYAN,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN} },
        //D
        { {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN},
        {Colors.CYAN,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN} },
        //E
        { {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN},
        {Colors.CYAN,Colors.RED,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.WHITE,Colors.CYAN},
        {Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN,Colors.CYAN} },
    };

void DrawA(){
    DisplayCard(30, 15, 0);
    // Controls. Box (40, 10, 5, 5, 91, Colors. RED, Colors.BLACK_BACKGROUND);
    // Controls.printxy (42, 12, "D");
}           
void DrawB(){
    DisplayCard(10, 4, 1);
    // Controls.Box( 5, 3, 1, 1, 91, Colors.BLACK, Colors.BLACK_BACKGROUND);
    // Controls.SetForegroundBackgroundColor(Colors.YELLOW, Colors.GREEN_BACKGROUND);
    // Controls. Box (25, 20, 5, 5, 91, Colors. RED, Colors.BLACK_BACKGROUND);
    // Controls.printxy (27, 22, "A");
}
void DrawC(){
    DisplayCard(10, 26, 2);
    // Controls. Box (10, 30, 5, 5, 91, Colors. RED, Colors.BLACK_BACKGROUND);
    // Controls.printxy (12, 32, "C");
}
void DrawD(){
    DisplayCard(50, 4, 3);
    // Controls. Box (10, 10, 5, 5, 91, Colors. RED, Colors.BLACK_BACKGROUND);
    // Controls.printxy (12, 12, "B");
}
void DrawE(){
    DisplayCard(50, 26, 4);
    // Controls. Box (40, 30, 5, 5, 91, Colors. RED, Colors.BLACK_BACKGROUND);
    // Controls.printxy (42, 32, "E");
}

    // int asciiValue1 = 0x2502; // ASCII value for '-'
    // char asciiChar1 = (char) asciiValue1; // cast int to char

    char asciiValue2 = '\u23df'; // ASCII value for down arrow

    

// void line(int color, int Symbols){
//     if (color == 1){
//         System.out.println(Colors.RED);
//         System.out.println(asciiChar1);
//     }
// }
void Connect_A_B()
{   
    
    for (int i=18; i < 29; i++){
        Controls.printxy(i, 16, Symbols.EXTENDED[77]);
        System.out.println(Symbols.EXTENDED[77]);
    }
    for (int i=10; i < 17; i++){
    Controls.printxy (18, i, Symbols.EXTENDED[58]);}
    for (int i = 16; i<17; i++){
    Controls.printxy(18,i,Symbols.EXTENDED[72]);
    }
}
void Connect_A_C()
{
    for (int i=18; i < 29; i++)
        Controls.printxy(i, 18, Symbols.EXTENDED[77]);
        System.out.println(Symbols.EXTENDED[77]);
        for (int i = 18; i<19; i++)
        Controls.printxy(18,i,Symbols.EXTENDED[73]);
    for (int i=19; i < 26; i++)
        Controls.printxy (18, i, Symbols.EXTENDED[58]);
}
void Connect_A_D()
{
    for (int i = 16; i<17; i++)
    Controls.printxy(41,i,Symbols.EXTENDED[77]);

    for (int i=42; i < 52; i++)
    Controls.printxy(i, 16, Symbols.EXTENDED[77]);//-

    for (int i = 16; i<17; i++)
     Controls.printxy(52,i,Symbols.EXTENDED[60]);//t
    for (int i=10; i < 16; i++)
    Controls.printxy (52, i, Symbols.EXTENDED[58]);
}
void Connect_A_E()
{
    for (int i = 18; i<19; i++)
    Controls.printxy(41,i,Symbols.EXTENDED[77]);//->

    for (int i=42; i < 52; i++)
    Controls.printxy(i, 18, Symbols.EXTENDED[77]);//-

    for (int i = 19; i<26; i++)
    Controls.printxy(52,i,Symbols.EXTENDED[58]);// |

    for (int i = 18; i<19; i++)
    Controls.printxy(52,i,Symbols.EXTENDED[59]);//t

}
void Connect_B_A()
{   
    for (int i=8; i < 9; i++)
    Controls.printxy(21,i,Symbols.EXTENDED[47]);//->

    for (int i=22; i < 32; i++)
        Controls.printxy(i, 8, Symbols.EXTENDED[77]);//-
    for (int i=9; i < 15; i++)
        Controls.printxy (32, i, Symbols.EXTENDED[58]);//|
   
    for (int i = 8; i<9; i++)
        Controls.printxy(32,i,Symbols.EXTENDED[59]);//t
}
void Connect_B_C()
{
    for (int i=10; i < 11; i++)
    Controls.printxy(12,i,Symbols.EXTENDED[58]);//->

    for (int i=11; i < 26; i++)
        Controls.printxy (12, i,  Symbols.EXTENDED[58]);//|

}
void Connect_B_D()
{
    for (int i = 5; i<6; i++)
    Controls.printxy(21,i,Symbols.EXTENDED[77]);//->

    for (int i=22; i < 50; i++)
    Controls.printxy(i, 5, Symbols.EXTENDED[77]);//-
}
void Connect_B_E()
{
    for (int i=3; i < 4; i++)
        Controls.printxy (12, i, Symbols.EXTENDED[58]);//->
    for (int i = 2; i<3; i++)
    Controls.printxy(12,i,Symbols.EXTENDED[73]);//t
    for (int i=13; i < 68; i++)
        Controls.printxy(i, 2,  Symbols.EXTENDED[77]);//-
    for (int i = 2; i<3; i++)
    Controls.printxy(68,i,Symbols.EXTENDED[59]);//t
    for (int i=3; i < 27; i++)
    Controls.printxy (68, i, Symbols.EXTENDED[58]);//|
    for (int i = 27; i<28; i++)
    Controls.printxy(68,i,Symbols.EXTENDED[60]);//t
    for (int i=61; i < 68; i++)
    Controls.printxy(i, 27, Symbols.EXTENDED[77]);//-
}
void Connect_C_A()
{
    for (int i=27; i < 28; i++)
    Controls.printxy(21,i,Symbols.EXTENDED[47]);//->
    for (int i=22; i < 32; i++)
        Controls.printxy(i, 27, Symbols.EXTENDED[77]);//-
    for (int i=21; i < 27; i++)
        Controls.printxy (32, i, Symbols.EXTENDED[58]);//|
    for (int i = 27; i<28; i++)
    Controls.printxy(32,i,Symbols.EXTENDED[60]);//t
}
void Connect_C_B()
{
    for (int i=25; i < 26; i++)
    Controls.printxy(15,i,Symbols.EXTENDED[15]);//->

    for (int i=10; i < 25; i++)
        Controls.printxy (15, i,  Symbols.EXTENDED[58]);//|
}
void Connect_C_D()
{
    for (int i=32; i < 33; i++)
        Controls.printxy (17, i, Symbols.EXTENDED[123]);//down arrow
    for (int i=17; i < 18; i++)
    Controls.printxy(i, 33, Symbols.EXTENDED[72]);//t
    for (int i=18; i < 63; i++)
        Controls.printxy(i, 33, Symbols.EXTENDED[77]);//-
    for (int i=9; i < 33; i++)
        Controls.printxy (63, i, Symbols.EXTENDED[58]);//|
    for (int i=33; i < 34; i++)
    Controls.printxy (63, i, Symbols.EXTENDED[60]);//t
    for (int i=61; i < 63; i++)
        Controls.printxy(i, 8, Symbols.EXTENDED[77]);//-
    for (int i=8; i < 9; i++)
    Controls.printxy (63, i, Symbols.EXTENDED[59]);//t
}
void Connect_C_E()
{
    for (int i = 30; i<31; i++)
    Controls.printxy(21,i,Symbols.EXTENDED[47]);//->

    for (int i=22; i < 50; i++)
    Controls.printxy(i, 30, Symbols.EXTENDED[77]);//-

}
void Connect_D_A()
{
    for (int i=40; i < 50; i++)
        Controls.printxy(i, 8, Symbols.EXTENDED[77]);//-
    for (int i=39; i < 40; i++)
        Controls.printxy(i, 8, Symbols.EXTENDED[73]);//t
    for (int i=9; i < 15; i++)
        Controls.printxy (39, i, Symbols.EXTENDED[58]);//|
}
void Connect_D_B()
{
    for (int i = 7; i<8; i++)
    Controls.printxy(49,i,Symbols.EXTENDED[46]);//->

    for (int i=21; i < 49; i++)
    Controls.printxy(i, 7, Symbols.EXTENDED[77]);//-
}
void Connect_D_C()
{
    for (int i=32; i < 34; i++)
    Controls.printxy (15, i, Symbols.EXTENDED[58]);//|
    for (int i=15; i < 16; i++)
    Controls.printxy(i, 34, Symbols.EXTENDED[72]);//t
    for (int i=16; i < 66; i++)
    Controls.printxy(i, 34, Symbols.EXTENDED[77]);//-
    for (int i=7; i < 34; i++)
    Controls.printxy (66, i, Symbols.EXTENDED[58]);//|
    for (int i=34; i < 35; i++)
    Controls.printxy (66, i, Symbols.EXTENDED[60]);//t
    for (int i=62; i < 66; i++)
    Controls.printxy(i, 6, Symbols.EXTENDED[77]);//-
    for (int i=6; i < 7; i++)
    Controls.printxy (66, i, Symbols.EXTENDED[59]);//t
    for (int i=6; i < 7; i++)
        Controls.printxy (61, i, Symbols.EXTENDED[47]);//->
}
void Connect_D_E()
{
    for (int i=10; i < 11; i++)
    Controls.printxy(58,i,Symbols.EXTENDED[123]);//->

    for (int i=11; i < 26; i++)
        Controls.printxy (58, i,  Symbols.EXTENDED[58]);//|
}
void Connect_E_A()
{
    for (int i=40; i < 49; i++){
        Controls.printxy(i, 27, Symbols.EXTENDED[77]);//-
        System.out.println(Symbols.EXTENDED[46]);//->
    }
    for (int i=21; i < 27; i++){
    Controls.printxy (39, i, Symbols.EXTENDED[58]);}//|
    for (int i = 27; i<28; i++)
    Controls.printxy(39,i,Symbols.EXTENDED[72]);//t
}
void Connect_E_B()
{
    for (int i=2; i < 4; i++)
        Controls.printxy (14, i, Symbols.EXTENDED[58]);//|
    for (int i = 1; i<2; i++)
    Controls.printxy(14,i,Symbols.EXTENDED[73]);//t
    for (int i=15; i < 70; i++)
        Controls.printxy(i, 1,  Symbols.EXTENDED[77]);//-
    for (int i = 1; i<2; i++)
    Controls.printxy(70,i,Symbols.EXTENDED[59]);//t
    for (int i=2; i < 29; i++)
    Controls.printxy (70, i, Symbols.EXTENDED[58]);//|
    for (int i = 29; i<30; i++)
    Controls.printxy(70,i,Symbols.EXTENDED[60]);//t
    for (int i=62; i < 70; i++)
    Controls.printxy(i, 29, Symbols.EXTENDED[77]);//-
    for (int i=61; i < 62; i++)
    Controls.printxy(i, 29, Symbols.EXTENDED[47]);//->
}
void Connect_E_C()
{
    for (int i = 28; i<29; i++)
    Controls.printxy(49,i,Symbols.EXTENDED[46]);//->

    for (int i=21; i < 49; i++)
    Controls.printxy(i, 28, Symbols.EXTENDED[77]);//-
}
void Connect_E_D()
{
    for (int i=25; i < 26; i++)
    Controls.printxy(55,i,Symbols.EXTENDED[58]);//->

    for (int i=10; i < 25; i++)
        Controls.printxy (55, i,  Symbols.EXTENDED[58]);//|
}
public void CalculatingShortestDistance(int[][] adjMatrix, int nodeName) {
    for (int i = 0; i < 5; i++) 
    {
        if ((adjMatrix[nodeName][i] != 0) && (!TabularDepiction[i].marked)) 
        {
            if ((TabularDepiction[nodeName].ShortestDist + adjMatrix[nodeName][i]) < TabularDepiction[i].ShortestDist) 
            {
                TabularDepiction[i].ShortestDist = TabularDepiction[nodeName].ShortestDist + adjMatrix[nodeName][i];
                
                TabularDepiction[i].vertexFrom = (char) (nodeName+1);
            }
        }    
    }

        TabularDepiction[nodeName].marked = true;
        int smallest = 1000;
        int smallestIndex = -1;
       
        for (int i = 0; i < 5; i++) 
        {
            if (!TabularDepiction[i].marked) 
            {
                if (TabularDepiction[i].ShortestDist < smallest) 
                {
                    smallest = TabularDepiction[i].ShortestDist;
                    smallestIndex = i;     
                } 
            }
        }

        if (smallestIndex > -1) 
        {
            CalculatingShortestDistance(adjMatrix, (char) smallestIndex);    
        }
    }
    void weight(int[][] arr){
    //A_C
    for (int j=26; j < 27; j++){
        Controls.printxy(j, 19, arr[0][2]);
    }
    //A_B
    for (int j=26; j < 27; j++){
        Controls.printxy(j, 15, arr[0][1]);
    }
    //A_D
    for (int i=47; i < 48; i++){
    Controls.printxy(i, 15, arr[0][3]);
    }
    // //A_E
    // for (int i=47; i < 48; i++)
    // Controls.printxy(i, 19, arr[0][4]);
    //B-C
    for (int i=13; i < 14; i++)
    Controls.printxy (11, i,  arr[1][1]);
    // //B_D
    // for (int i=36; i < 37; i++)
    // Controls.printxy(i,2,  arr[1][3]);
    // //B_E
    // for (int i=15; i < 16; i++)
    // Controls.printxy (69, i, arr[1][4]); 
    //C_D
    for (int i=35; i < 36; i++)
    Controls.printxy(i, 32, arr[2][3]);
    //E_D
    for (int i=15; i < 16; i++)
        Controls.printxy (56, i,  arr[4][3]);//|
    }
void Run(int[][] arr){

        Controls.cls();
// ANSI escape code to clear the screen
final String ANSI_CLEAR_SCREEN = "\033[2J";

// ANSI escape code to set the background color to black
final String ANSI_BLACK_BACKGROUND = "\033[40m";

// print the ANSI escape code to clear the screen and set the background color to black
System.out.print(ANSI_CLEAR_SCREEN + ANSI_BLACK_BACKGROUND);


        DrawA();
        DrawB();
        DrawC();
        DrawD();
        DrawE();
        DisplayDFS(arr, 0);
        weight(arr);
        // Connect_A_B();
        // Connect_A_C();
        // Connect_A_D();
        // Connect_A_E();
        // Connect_B_A();
        // Connect_B_C();
        // Connect_B_D();
        // Connect_B_E();
        // Connect_C_A();
        // Connect_C_B();
        // Connect_C_D();
        // Connect_C_E();
        // Connect_D_A();
        // Connect_D_B();
        // Connect_D_C();
        // Connect_D_E();
        // Connect_E_C();
        // Connect_E_A();
        // Connect_E_B();
        // Connect_E_C();
        // Connect_E_D();
        // System.out.println("\n\n");
      
    //A    
    TabularDepiction[0] = new itm();
    TabularDepiction[0].vertex = 'A';
    TabularDepiction[0].ShortestDist = 0;
    TabularDepiction[0].vertexFrom = 0;
    TabularDepiction[0].marked = false;
    
    //B
    TabularDepiction[1] = new itm();
    TabularDepiction[1].vertex = 'B';
    TabularDepiction[1].ShortestDist = 100;
    TabularDepiction[1].vertexFrom = 0;
    TabularDepiction[1].marked = false;
    
    //C
    TabularDepiction[2] = new itm();
    TabularDepiction[2].vertex = 'C';
    TabularDepiction[2].ShortestDist = 100;
    TabularDepiction[2].vertexFrom = 0;
    TabularDepiction[2].marked = false;
    
    //D
    TabularDepiction[3] = new itm();
    TabularDepiction[3].vertex = 'D';
    TabularDepiction[3].ShortestDist = 100;
    TabularDepiction[3].vertexFrom = 0;
    TabularDepiction[3].marked = false;
    
    //E
    TabularDepiction[4] = new itm();
    TabularDepiction[4].vertex = 'E';
    TabularDepiction[4].ShortestDist = 100;
    TabularDepiction[4].vertexFrom = 0;
    TabularDepiction[4].marked = false;

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        
        CalculatingShortestDistance(arr, (char) 0);

        System.out.println("  Vertex" + "           Shortest Path" + "         Previous Vertex  ");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < 5; i++) 
        {
            try 
            {
                Thread.sleep(650);
            } 
            catch (Exception e) 
            {

            }
            System.out.println("       " + TabularDepiction[i].vertex + "                 " + TabularDepiction[i].ShortestDist + "                        " + TabularDepiction[i].vertexFrom + "          ");    
        }
    }
}
