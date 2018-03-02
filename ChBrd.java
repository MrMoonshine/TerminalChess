import java.util.Scanner;
class ChBrd
{
    Calc fill = new Calc();
    Icons figu = new Icons();
    Scanner scan1 = new Scanner(System.in);
    int n ,x, y, z, i, j;
int printbrd()
{
    Bkg bg = new Bkg();
    Col col = new Col();

        System.out.println(col.pink+"    A  B  C  D  E  F  G  H");

    for(y = 0;y<8;y++)
    {
        n = y +1;
        System.out.print(col.pink+" " + n + " " + col.blue);
    if(y%2==1)
    z = 0;
    else
    z = 1;
    for(x = 0;x<8;x++)
    {
    //playerif
    if(x%2==z)
    {
    if(fill.board[x][y].possible == true)
        System.out.print(bg.yellow);
    else
        System.out.print(bg.white);    

    if(fill.board[x][y].player == 1)

        System.out.print(" \u001B[34m" + fill.board[x][y].fig + " ");
    else
        System.out.print(" \u001B[31m" + fill.board[x][y].fig + " ");
    //end playerif
    }
    else
    {
    if(fill.board[x][y].possible == true)
        System.out.print(bg.green);
    else
        System.out.print(bg.black);
    //playerif
    if(fill.board[x][y].player == 1)
        System.out.print(" \u001B[34m" + fill.board[x][y].fig + " ");
    else
        System.out.print(" \u001B[31m" + fill.board[x][y].fig + " ");
    //end playerif
    }
    }
    System.out.println(col.res);
    }
    return 0;
}

    int clearpos()
    {
        for(i = 0;i<8;i++)
        {
        for(j = 0;j<8;j++)
        {
            fill.board[j][i].possible = false;
        }
        }
        return 0;
    }
}