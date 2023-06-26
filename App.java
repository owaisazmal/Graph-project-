import tools.Symbols;

public class App {

    public static void main(String[] args) 
    {
    int[][] arr = {
        {0, 19, 10, 1, 0},
        {1, 2, 0, 0, 0},
        {1, 0, 0, 10, 0},
        {1, 7, 0, 0, 2},
        {0, 0, 0, 2, 0}
        };

        Graph G = new Graph();
        G.Run(arr);

        //Symbols.PrintSymbols();
        // CardGame G = new CardGame();
        // G.Play();
        //Player p = new Player();
        //p.playMusic("c:\\temp\\music.wav");
        //BinaryTree BT = new BinaryTree();

       // BT.add(100);
        //BT.add(50);
       // BT.add(150);

        //BT.DisplayInfo();

        while (true);
    }
}


