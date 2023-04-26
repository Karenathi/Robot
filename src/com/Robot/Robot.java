package com.Robot;
public class Robot {
    int x;
    int y;
    String direction;

    /**
     * values initialised in 0;
     */
    Robot(int x, int y){
        this.x =0;
        this.y = 0;
        this.direction = "North";
    }

    Robot(int x, int y, String direction ){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    // Boot's functionalities : to move forward, to turn


    /**
     * to  move forward
     */
     void movingForward(){
        /* if the direction is North then y++ */

        if (direction == "North"){
            this.y++;
        } else if (direction == "South") {
            this.y--;
        } else if (this.direction == "East") {
            this.x++;
        } else if (this.direction == "West") {
            this.x--;
        }
    }

    /* to turn */
    void turning(){
        if (direction == "Nord"){
            this.direction = "Est";
        } else if (direction == "East") {
            this.direction ="South";
        } else if (this.direction == "South") {
            this.direction = "West";
        } else if (this.direction == "West") {
            this.direction = "North";
        }
    }

    public static void main(String[] args) {
        Robot terminus = new Robot(0,1, "South");
        terminus.turning();
        terminus.movingForward();
    }
}
