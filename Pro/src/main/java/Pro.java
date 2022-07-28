import processing.core.PApplet;
public class Pro extends PApplet{

    public static final int WIDTH = 700;
    public static final float HEIGHT = 500;
    public static final double DIAMETER = 100;




    public static void main(String[] args) {
        PApplet.main("Pro",args);
    }

    @Override
    public void settings() {
        super.settings(); 
        size(WIDTH, (int) HEIGHT);
    }

    @Override
    public void setup() {



    }

    @Override
    public void draw() {


            draw_circle();


    }

     int P1=0,P2=0,P3=0,P4=0;

    public void draw_circle(){
        //ellipse(mouseX,mouseY,DIAMETER,DIAMETER);



        ellipse(P1+=1,HEIGHT/5, (float) (DIAMETER/5), (float) (DIAMETER/5));
        ellipse(P2+=2,HEIGHT*2/5, (float) (DIAMETER/5), (float) (DIAMETER/5));
        ellipse(P3+=3,HEIGHT*3/5, (float) (DIAMETER/5), (float) (DIAMETER/5));
        ellipse(P4+=4,HEIGHT*4/5, (float) (DIAMETER/5), (float) (DIAMETER/5));

    }

}
