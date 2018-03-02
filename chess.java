import java.util.Scanner;

class chess
{
public static void main(String[] args)
{
    int i,j, u, kings;
    System.out.println("Welcome to Terminal-Chess!   Please zoom in!");
    Scanner scanning = new Scanner(System.in);
    Icons figi = new Icons();
    ChBrd pri = new ChBrd();
    Col c = new Col();

    for(i = 0;i<8;i++)
    {
    for(j = 0;j<8;j++)
    {
        pri.fill.board[j][i] = new Figures();    //Like an Instance to the full array
        pri.fill.board[j][i].fig = " ";
        pri.fill.board[j][i].possible = false;
    }
    }

//Start-Positions
pri.fill.board[4][0].fig = figi.king;
pri.fill.board[3][7].fig = figi.king;
pri.fill.board[3][0].fig = figi.queen;
pri.fill.board[4][7].fig = figi.queen;
pri.fill.board[0][0].fig = figi.tower;
pri.fill.board[0][7].fig = figi.tower;
pri.fill.board[7][0].fig = figi.tower;
pri.fill.board[7][7].fig = figi.tower;
pri.fill.board[1][7].fig = figi.horse;
pri.fill.board[6][7].fig = figi.horse;
pri.fill.board[1][0].fig = figi.horse;
pri.fill.board[6][0].fig = figi.horse;
pri.fill.board[5][0].fig = figi.pope;
pri.fill.board[2][0].fig = figi.pope;
pri.fill.board[2][7].fig = figi.pope;
pri.fill.board[5][7].fig = figi.pope;

for(i = 0;i<8;i++)
{
for(j = 0;j<8;j++)
{
    pri.fill.board[j][i].player = 0;
}
}

for(j = 0; j < 8; j++)
{
    pri.fill.board[j][1].fig = figi.farmer;
    pri.fill.board[j][6].fig = figi.farmer;
    pri.fill.board[j][0].player = 2;
    pri.fill.board[j][1].player = 2;
    pri.fill.board[j][6].player = 1;
    pri.fill.board[j][7].player = 1;
}
while(true)
{
    //In the game are 2 players 1 = blue; 2 = red; 0 = empty
    //Player 1
    pri.fill.tpl = 1;
    pri.printbrd();
    System.out.print("\u001B[34m");
    pri.fill.calcu1();
    pri.printbrd();
    pri.fill.board[pri.fill.x][pri.fill.y].player = 0;
    pri.fill.board[pri.fill.x][pri.fill.y].fig = " ";
    pri.fill.calcuf();
    pri.clearpos();
    
    //PLAYER 2
    pri.fill.tpl = 2;
    pri.printbrd();
    System.out.print("\u001B[31m");
    pri.fill.calcu1();
    pri.printbrd();  
    pri.fill.board[pri.fill.x][pri.fill.y].player = 0;
    pri.fill.board[pri.fill.x][pri.fill.y].fig = " ";

    pri.fill.calcuf();
    pri.clearpos();

    kings = 0;
for(i = 0;i<8;i++)
{
for(j = 0;j<8;j++)
{
    if(pri.fill.board[i][j].fig.equals(pri.figu.king))
    kings++;
}
}
    if(kings != 2)
    break;
}
    System.out.println(c.res);
}
}