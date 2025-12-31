class Solution {
    public void get(int[][] image ,  int sr, int sc, int color ,int val){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != val  ) return;
        
        image[sr][sc] = color;

        get(image ,sr-1, sc,  color , val);
        get(image ,sr+1, sc,  color , val);
        get(image ,sr, sc+1,  color , val);
        get(image ,sr, sc-1,  color , val);
    }
   

   
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val = image[sr][sc];
        if(color ==  val)return image;
        get(image , sr , sc , color,  val );
        return image;
    }
}