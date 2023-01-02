package day40_finalKeyword;

import day39_Recap.shapeTask.Circle;
import day39_Recap.shapeTask.Square;

public class EncapsulationReview {
    private Circle circle;
    private Square square;
    public Circle getCircle(){
        return circle;

    }
    private void setCircle(Circle circle){
        if (circle.getRadius()<5){
            return;
        }
        this.circle=circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

}
