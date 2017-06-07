//2017-3-10
public class SmallestRectangleEnclosingBlackPixels {
    public int minArea(int[][] image, int x, int y) {
        int left1 = 0, right1 = y, left2 = y + 1, right2 = image[0].length;
        int top1 = 0, bottom1 = x, top2 = x + 1, bottom2 = image.length;
        while(left1<right1){
        	int k = 0;
        	int mid = left1 + (right1-left1)/2;
        	while(k<bottom2&&image[k][mid]==0) k++;
        	if(k == bottom2 ) left1 = mid + 1;
        	else right1 = mid;
        }
        while(left2<right2){
        	int k = 0;
        	int mid = left2 + (right2-left2)/2;
        	while(k<bottom2&&image[k][mid]==0) k++;
        	if(k == bottom2) right2 = mid;
        	else left2 = mid + 1;
        }
        while(top1<bottom1){
        	int k = 0;
        	int mid = top1 + (bottom1-top1)/2;
        	while(k<right2&&image[mid][k]==0) k++;
        	if(k == right2 ) top1 = mid + 1;
        	else bottom1 = mid;
        }
        while(top2<bottom2){
        	int k = 0;
        	int mid = top2 + (bottom2-top2)/2;
        	while(k<right2&&image[mid][k]==0) k++;
        	if(k == right2 ) bottom2 = mid;
        	else top2 = mid + 1;
        }
        
        return (left2-left1)*(top2-top1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallestRectangleEnclosingBlackPixels test = 
				new SmallestRectangleEnclosingBlackPixels();
		int[][] image = {{0,0,1,0},{0,1,1,0},{0,1,0,0}};
		int res = test.minArea(image, 0,2);
		System.out.println(res);
	}

}
