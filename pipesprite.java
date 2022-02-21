package com.example.flappybird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by rushd on 1/12/2018.
 */

 class PipeSprite {

    private Bitmap image;
    private Bitmap image2;
    public int xX, yY;
    private int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;




    public PipeSprite (Bitmap bmp, Bitmap bmp2, int x, int y) {
        image = bmp;
        image2 = bmp2;
        yY = y;
        xX = x;
    }


    public void draw(Canvas canvas) {
        canvas.drawBitmap(image, xX, -(GameView.gapHeight / 2) + Math.random().to, null);
        canvas.drawBitmap(image2,xX, ((screenHeight / 2) + (GameView.gapHeight / 2)) + Math.random(), null);


    }
    public void update() {

        xX -= GameView.velocity;



    }

}