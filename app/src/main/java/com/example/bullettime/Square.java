package com.example.bullettime;

import android.content.Context;
import android.graphics.Rect;

public class Square {

    private int xPosition;
    private int yPosition;
    private int width;

    // make the hitbox
    Rect hitbox;

    public Square(Context context, int x, int y, int width) {
        this.xPosition = x;
        this.yPosition = y;
        this.width = width;

        this.hitbox = new Rect(
                this.xPosition,
                this.yPosition,
                this.xPosition + this.width,
                this.yPosition + this.width
        );

    }

    public Rect getHitbox() {
        return hitbox;
    }

    public void setHitbox(Rect hitbox) {
        this.hitbox = hitbox;
    }

    public void updateHitbox() {
        this.hitbox.left = this.xPosition;
        this.hitbox.top = this.yPosition;
        this.hitbox.right = this.xPosition + this.width;
        this.hitbox.bottom = this.yPosition + this.width;
    }


    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

