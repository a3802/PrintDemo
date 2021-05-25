package com.example.printdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        setContentView(new TestView(this));
    }



    private class TestView extends View {

        public TestView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            canvas.drawColor(Color.YELLOW);

            //画笔
            Paint paint = new Paint();
            paint.setStrokeWidth(30);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            //绘制矩形
            canvas.drawRect(100,100,500,500,paint);

            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(600,100,1000,500,paint);

            //绘制圆形
            paint.setColor(Color.BLUE);
            canvas.drawCircle(550,700,300,paint);

            paint.setColor(Color.WHITE);
            canvas.drawCircle(510,720,12,paint);

            //三角形
            paint.setColor(Color.RED);
            Path path = new Path();
            path.moveTo(200,1000);
            path.lineTo(900,1000);
            path.lineTo(550,1100);
            path.close();

            canvas.drawPath(path,paint);


            //绘制文字
            paint.setTextSize(100);
            paint.setColor(Color.BLUE);
            canvas.drawText("Hello!~~~~",300,1200,paint);

        }
    }
}
