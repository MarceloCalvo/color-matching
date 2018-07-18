package testcolor;

import java.awt.Color;
import oracle.spatial.util.RTree;

public class ColorMatch {

    public static void main(String[] args) throws Exception {
                
        RTree rt = new RTree(3, 20, 5);
        
        for(int k = 1; k < 1000000; k++) {
        
            int red = (int) (Math.random() * 255);
            int green = (int) (Math.random() * 255);
            int blue = (int) (Math.random() * 255);
            double ret[][] = { {red,red}, {green,green}, {blue,blue} };                
            rt.addEntry(ret, new Color(red, green, blue));            
        }
        
        MainFrame frame = new MainFrame(rt);        
        frame.setVisible(true);

    }
    
}
