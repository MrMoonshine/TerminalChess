class Calc
{
    Figures board[][] = new Figures[8][8];
    Icons mans = new Icons();
    Input1 gin = new Input1();
    int z, c, trp, f = 0, tmpplayer, x, y, tpl; //tpl is the playing player
    int xw, yw;
    String tmpfig;
    int[] posg = {0,0};

int calcu1()
{
while(true)
{
    gin.read1();
    x = gin.posc[0];
    y = gin.posc[1];
//TURMTURMTURM//TURMTURMTURM//TURMTURMTURM//TURMTURMTURM//TURMTURMTURM//TURMTURMTURM
if(board[x][y].fig.equals(mans.tower) || board[x][y].fig.equals(mans.queen))
{
    //Rechts anfang
    x = gin.posc[0];
    y = gin.posc[1];
    System.out.print(gin.posc[0]);
    System.out.println(gin.posc[1]);
    
    if(x != 7)
    {
    for(z = 0;z<8;z++)
    {
        x++;
        if(board[x][y].player == tpl)
        break;

        if(board[x][y].player != tpl && board[x][y].player != 0)
        {
            board[x][y].possible = true;
            break;
        }

        if(board[x][y].player == 0)
        board[x][y].possible = true;

        if(x > 6)
        break;
    }
    //Rechts ende
    }
    //Links anfang
    x = gin.posc[0];
    y = gin.posc[1];
    if(x != 0)
    {
    for(z = 0;z<8;z++)
    {
        x--;
        if(board[x][y].player == tpl)
        break;
    
        if(board[x][y].player != tpl && board[x][y].player != 0)
        {
            board[x][y].possible = true;
            break;
        }
    
        if(board[x][y].player == 0)
        board[x][y].possible = true;

        if(x < 1)
        break;
        }
    //Links ende
    }

    //Oben anfang
    x = gin.posc[0];
    y = gin.posc[1];
    if(y != 0)
    {
        for(z = 0;z<8;z++)
        {
        if(board[x][y-1].player == tpl)
        break;
    
        if(board[x][y-1].player != tpl && board[x][y-1].player != 0)
        {
            board[x][y-1].possible = true;
            break;
        }
        
        if(board[x][y-1].player == 0)
        board[x][y-1].possible = true;
    
        y--;
        if(y < 1)
        break;
        }
        //Oben ende
    }
    //Unten anfang
    x = gin.posc[0];
    y = gin.posc[1];
    if(y != 7)
    {
    for(z = 0;z<8;z++)
    {
    if(board[x][y+1].player == tpl)
    break;

    if(board[x][y+1].player != tpl && board[x][y+1].player != 0)
    {
        board[x][y+1].possible = true;
        break;
    }
    
    if(board[x][y+1].player == 0)
    board[x][y+1].possible = true;

    y++;
    if(y > 6)
    break;
    }
    //Unten ende
    }

}
x = gin.posc[0];
y = gin.posc[1];
//Look at my horse, my horse is amazing!

if(board[x][y].fig.equals(mans.horse))
{
    x = x + 2;
    y++;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    x = x-2;
    y++;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    x = x + 2;
    y--;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    x = x-2;
    y--;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];


    x--;
    y = y - 2;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    x--;
    y = y + 2;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    x++;
    y = y - 2;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    x++;
    y = y+2;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];
}

//I am the king!!!!

if(board[x][y].fig.equals(mans.king))
{
    x++;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1]; 

    y++;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1]; 

    x--;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    y--;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;
//straightdirections end and now diagonals
    x = gin.posc[0];
    y = gin.posc[1];

    x++;
    y++;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1]; 

    y++;
    x--;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1]; 

    y--;
    x--;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];

    x++;
    y--;
    if(x<8 && x>=0 && y<8 && y>=0)
    board[x][y].possible = true;

    x = gin.posc[0];
    y = gin.posc[1];
}

//I bim a Bauanbua (RED)
if(board[x][y].fig.equals(mans.farmer) && tpl == 2)
{
    if(y == 1)
    board[x][3].possible = true;

    if(board[x][y+1].player == 0)
    board[x][y+1].possible = true;

    if(x < 6)
    if(board[x+1][y+1].player == 1)
    board[x+1][y+1].possible = true;

    if(x > 0)
    if(board[x-1][y+1].player == 1)
    board[x-1][y+1].possible = true;
}
    x = gin.posc[0];
    y = gin.posc[1];
//I bim a Bauanbua (BLUE)
if(board[x][y].fig.equals(mans.farmer) && tpl == 1)
{
    if(y == 6)
    board[x][4].possible = true;

    if(board[x][y-1].player == 0)
    board[x][y-1].possible = true;

    if(x < 6)
    if(board[x+1][y-1].player == 2)
    board[x+1][y-1].possible = true;

    if(x > 0)
    if(board[x-1][y-1].player == 2)
    board[x-1][y-1].possible = true;
}
//End of Farmers
x = gin.posc[0];
y = gin.posc[1];
//Popes and queenzzzz  
if(board[x][y].fig.equals(mans.pope) || board[x][y].fig.equals(mans.queen))
{
        //Down+Right
        x = gin.posc[0];
        y = gin.posc[1];
        if(y != 7 && x != 7)
        {
        for(z = 0;z<8;z++)
        {
        y++;
        x++;
        if(y > 7 || x > 7)
        break;

        if(board[x][y].player == tpl)
        break;
    
        if(board[x][y].player != tpl && board[x][y].player != 0)
        {
            board[x][y].possible = true;
            break;
        }
        
        if(board[x][y].player == 0)
        board[x][y].possible = true;
        }
        }
        
        //Down+LEFT
        x = gin.posc[0];
        y = gin.posc[1];
        if(y != 7 && x != 0)
        {
        for(z = 0;z<8;z++)
        {
        y++;
        x--;
        if(y > 7 || x < 0)
        break;

        if(board[x][y].player == tpl)
        break;
            
        if(board[x][y].player != tpl && board[x][y].player != 0)
        {
        board[x][y].possible = true;
        break;
        }
                
        if(board[x][y].player == 0)
        board[x][y].possible = true;
        }
        }
        //UP+Right
        x = gin.posc[0];
        y = gin.posc[1];
        if(y != 0 && x != 7)
        {
        for(z = 0;z<8;z++)
        {
        y--;
        x++;
        if(x > 7 || y < 0)
        break;

        if(board[x][y].player == tpl)
        break;
            
        if(board[x][y].player != tpl && board[x][y].player != 0)
        {
        board[x][y].possible = true;
        break;
        }
                
        if(board[x][y].player == 0)
        board[x][y].possible = true;
        }
        }

        //UP+Left
        x = gin.posc[0];
        y = gin.posc[1];
        if(y != 0 && x != 0)
        {
        for(z = 0;z<8;z++)
        {
        y--;
        x--;
        if(x < 0 || y < 0)
        break;

        if(board[x][y].player == tpl)
        break;
        
        if(board[x][y].player != tpl && board[x][y].player != 0)
        {
        board[x][y].possible = true;
        break;
        }
                
        if(board[x][y].player == 0)
        board[x][y].possible = true;
        }
        }

}


x = gin.posc[0];
y = gin.posc[1];
trp = 0;
for(z = 0;z<8;z++)
{
for(c = 0;c<8;c++)
{
    if(board[x][y].possible = true)
    trp++;
}
}
//Errors for Wrong inputs
if(trp>0 && board[x][y].player == tpl)
break;

if(trp==0)
{
System.out.println("Your chosen figure can't be moved!");
clearbrdtmp();
}
if(board[x][y].player != tpl && board[x][y].player != 0)
{
System.out.println("This in not your figure!");
clearbrdtmp();
}
if(board[x][y].player == 0)
{
System.out.println("On this tile isn't any figure!");
clearbrdtmp();
}
}
x = gin.posc[0];
y = gin.posc[1];

tmpplayer = board[gin.posc[0]][gin.posc[1]].player;
tmpfig = board[gin.posc[0]][gin.posc[1]].fig;

return 0;
}

//CalcufMEthodCalcufMEthodCalcufMEthodCalcufMEthodCalcufMEthodCalcufMEthod
    int calcuf()
{   
    x = gin.posc[0];
    y = gin.posc[1];
while(true)
{
    gin.read2();
    xw = gin.posw[0];
    yw = gin.posw[1];

if(board[xw][yw].possible)
    {
    System.out.println("Next player:");
    break;
    }
    else
    {
        System.out.println("This tile is wrong! Type again!");
    }

}
    board[gin.posw[0]][gin.posw[1]].fig = tmpfig;
    board[gin.posw[0]][gin.posw[1]].player = tmpplayer;
    board[x][y].fig = " ";
    board[x][y].player = 0;
    return 0;
}

int clearbrdtmp()
{
for(z = 0;z<8;z++)
{
for(c = 0;c<8;c++)
{
    board[z][c].possible = false;
}
}
    return 0;
}

}