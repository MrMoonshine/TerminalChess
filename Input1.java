import java.util.Scanner;
class Input1
{
    String pc, pw;
    Scanner scan = new Scanner(System.in);
    int[] posc = {30,30};
    int[] posw = {30,30};
    int a, contr = 0;
int read1()
{
do
{
    System.out.println("Please enter the position of your Figure");
    pc = scan.nextLine();

    char[] pcar = pc.toCharArray();
    contr = 0;
for(a = 0;a<2;a++)
{
if(pcar[0]=='1'||pcar[0]=='2'||pcar[0]=='3'||pcar[0]=='4'||pcar[0]=='5'||pcar[0]=='6'||pcar[0]=='7'||pcar[0]=='8')
{
    contr = 60;
    System.out.println("Type like:   a1   d6   f3");
}

if(pcar[1]=='a'||pcar[1]=='b'||pcar[1]=='c'||pcar[1]=='d'||pcar[1]=='e'||pcar[1]=='f'||pcar[1]=='g'||pcar[1]=='h')
{
contr = 60;
}

if(contr!=60)
{
switch(pcar[a])
{
    case '1': posc[a] = 0; break;
    case '2': posc[a] = 1; break;
    case '3': posc[a] = 2; break;
    case '4': posc[a] = 3; break;
    case '5': posc[a] = 4; break;
    case '6': posc[a] = 5; break;
    case '7': posc[a] = 6; break;
    case '8': posc[a] = 7; break;
    case 'a': posc[a] = 0; break;
    case 'b': posc[a] = 1; break;
    case 'c': posc[a] = 2; break;
    case 'd': posc[a] = 3; break;
    case 'e': posc[a] = 4; break;
    case 'f': posc[a] = 5; break;
    case 'g': posc[a] = 6; break;
    case 'h': posc[a] = 7; break;
    default: System.out.println("Wrong input!!!"); contr = 60; break;
};
}
}
}while(contr==60);
return 0;
}

int read2()
{
do
{
    System.out.println("Please enter the destination of your Figure");
    pw  = scan.nextLine();
    char[] pwar = pw.toCharArray();
    contr = 0;

for(a = 0;a<2;a++)
{
switch(pwar[a])
{
    case '1': posw[a] = 0; break;
    case '2': posw[a] = 1; break;
    case '3': posw[a] = 2; break;
    case '4': posw[a] = 3; break;
    case '5': posw[a] = 4; break;
    case '6': posw[a] = 5; break;
    case '7': posw[a] = 6; break;
    case '8': posw[a] = 7; break;
    case 'a': posw[a] = 0; break;
    case 'b': posw[a] = 1; break;
    case 'c': posw[a] = 2; break;
    case 'd': posw[a] = 3; break;
    case 'e': posw[a] = 4; break;
    case 'f': posw[a] = 5; break;
    case 'g': posw[a] = 6; break;
    case 'h': posw[a] = 7; break;
    default: System.out.println("Wrong input!!!"); contr = 60; break;
};
}
}while(contr==60);
return 0;
}
}