public class LoopShape {
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        String drawLayer = "";
        String drawMiddleLayer = "#";
        for(int layer = width ;layer > 0; layer--){
            drawLayer += "#";
        } //make both bottom and top layer
        for(int middleLayer = (height - 2); middleLayer > 0; middleLayer--){
            drawMiddleLayer += " ";
        } //make the middle layers
        drawMiddleLayer += " #";
        System.out.println(drawLayer);
        for(int printMiddleLayers = (height - 2); printMiddleLayers > 0; printMiddleLayers--){
            System.out.println(drawMiddleLayer);
        } //print the middle layers
        System.out.println(drawLayer);
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
        String bottom = "";
        String drawDown = "#";
        for(int h = (leg -1);h > 0; h--){
            drawDown = "#";
            int l = 2; 
            for(int i = 0; i < (l - 1); i++){
                if(i>0){
                    drawDown += " ";
                }
                l += 2;
                if(i == (leg -1)){

                }
            }
            if(h != 0){
                drawDown += "#";
            }
            System.out.println(drawDown);
        }
        for(int h = (leg);h > 0; h--){
            bottom += "#";
        }
        System.out.println(bottom);
    }
        
}