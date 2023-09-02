package Recursion;

import java.util.Arrays;

public class MazePaths_Count {
//counting the paths
    static int count(int r,int c){
        if(r==1||c==1){
            return 1;
        }
        int left=count(r-1, c);
        int right=count(r, c-1);
        return left+right;
    }
//going in Down and Right
    static void paths(String p,int r,int c){
        if(r == 1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
       paths(p+"V",r-1, c);
        }
        if(c>1){
        paths(p+"H",r, c-1);
        }  
    }
 //moving in right and down and diagonal also.
    static void pathD(String p,int r,int c){
        if(r == 1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
       pathD(p+"V",r-1, c);
        }
        if(c>1){
        pathD(p+"H",r, c-1);
        } 
        if(c>1&&r>1){
            pathD(p+"D", r-1, c-1);
        } 
    }
//Maze with obsticals
    static void pathsobb(String p,int r,int c,boolean[][]a){
        if(r == 0 && c==0){
// here we made it 0 bcz of indeces
//where ever we find we should repalce 1 by 0 and cade is same and one check if encounter the 
//any false just we kill that path

            System.out.println(p);
            return ;
        }
        if(!a[r][c]){
            return;
        }
        if(r>0){
       pathsobb(p+"V",r-1, c,a);
        }
        if(c>0){
        pathsobb(p+"H",r, c-1,a);
        }  
    }
//Moving in four Directions
static void Allpaths(String p,int r,int c,boolean[][]a){
        if(r == 0 && c==0){
// here we made it 0 bcz of indeces
//where ever we find we should repalce 1 by 0 and cade is same and one check if encounter the 
//any false just we kill that path

            System.out.println(p);
            return ;
        }
         if(!a[r][c]){
            return;
        }
        a[r][c]=false;
        if(r<a.length-1 ){
            Allpaths(p+"U", r+1, c, a);
        }
         if(c<a[0].length-1 ){
            Allpaths(p+"L", r, c+1, a);
        }
        if(r>0){
       Allpaths(p+"D",r-1, c,a);
        }
        if(c>0){
       Allpaths(p+"R",r, c-1,a);
        }
        a[r][c]=true;  
    }
    static void Printingpaths(String p,int r,int c,boolean[][]a,int [][] b,int step){
        if(r == 0 && c==0){
// here we made it 0 bcz of indeces
//where ever we find we should repalce 1 by 0 and cade is same and one check if encounter the 
//any false just we kill that path

            //System.out.println(p);
            b[r][c]=step;
            for(int []x:b){
                System.out.println(Arrays.toString(x));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
         if(!a[r][c]){
            return;
        }
        a[r][c]=false;
        b[r][c]=step;
        if(c>0){
       Printingpaths(p+"R",r, c-1,a,b,step+1);
        }
         if(c<a[0].length-1 ){
            Printingpaths(p+"L", r, c+1, a,b,step+1);
        }
        if(r>0){
      Printingpaths(p+"D",r-1, c,a,b,step+1);
        }
        if(r<a.length-1 ){
           Printingpaths(p+"U", r+1, c, a,b,step+1);
        }
        
        a[r][c]=true; 
        b[r][c]=0; 
    }
    public static void main(String[] args) {
//H-->Horizontal ,V-->Vertical ,D-->Diagonal
//System.out.println(count(3, 3));
// paths("", 3, 3);
//pathD("", 3, 3);
        boolean[][] a={{true,true,true},{true,true,true},{true,true,true}};
        //pathsobb("",2, 2,a);
        //Allpaths("", a.length-1, a[0].length-1, a);
        int[][]b=new int[a.length][a[0].length];
        Printingpaths("", a.length-1, a[0].length-1, a, b, 1);
    }
}
