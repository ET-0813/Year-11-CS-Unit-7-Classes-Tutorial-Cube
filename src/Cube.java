public class Cube {
    private int side;
    public Cube(){

        side = 1;

    }
    public Cube(int side){

        if (side < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1");
        }
        setSide(side);
    }
    public int getSide(){
        return side;
    }
    public void setSide(int side){
        if (side < 1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1");
        }
        this.side = side;
    }
    public int getSurfaceArea(){
        int face = side * side;
        int surfaceArea = face * 6;
        return surfaceArea;
    }
    public int getVolume(){
        int volume = side * side * side;
        return volume;
    }
    public String toString(){
        return "Cube{side=" + side + "}";
    }
}