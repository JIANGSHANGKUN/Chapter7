package com.example.android.chapter7;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 画图View 未使用双缓冲
 * Created by JSK on 2017/7/14.
 */

public class WriteView2 extends View {

    private float currentX;
    private float currentY;
    private Canvas mCanvas;
    private Paint mPaint;
    private Path mPath;
    private Bitmap mBitmap;
    private boolean init;

    public WriteView2(Context context) {
        this(context, null);
    }

    public WriteView2(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WriteView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        currentX = 0;
        currentY = 0;
        mPath = new Path();
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(5);
        mPaint.setDither(true);//设定是否使用图像抖动处理，true使绘制出来的图片颜色更加平滑和饱满，图像更加清晰
        mPaint.setStyle(Paint.Style.STROKE);
        mCanvas = new Canvas();
        mBitmap = null;
        init = true;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (init) {
            mBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            mCanvas.setBitmap(mBitmap);
            init = false;
        }
        canvas.drawBitmap(mBitmap, 0, 0, new Paint());
        canvas.drawPath(mPath, mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mPath.moveTo(currentX, currentY);
                break;
            case MotionEvent.ACTION_MOVE:
                mPath.quadTo(currentX, currentY, event.getX(), event.getY());
                currentX = event.getX();
                currentY = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                mPath.quadTo(currentX, currentY, event.getX(), event.getY());
                mCanvas.drawPath(mPath, mPaint);
                mPath.reset();
                break;
        }
        invalidate();
        return true;
    }

    private void drawMiddle() {
    }
}
