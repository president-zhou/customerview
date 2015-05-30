package view.customerview.zcj.com;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import customerview.zcj.com.R;

/**
 * TODO: document your custom view class.
 */
public class DrawView extends View {
   public float currentX=50;
    public float currentY=50;
    Paint paint=new Paint();

    /**
     * 从新话小球的方法
     * @param canvas
     */
    @Override
    public void onDraw(Canvas canvas){
        //super.onDraw(canvas);
        paint.setColor(Color.RED);
        canvas.drawCircle(currentX,currentY,15,paint);
    }
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){
        currentX=motionEvent.getX();
        currentY=motionEvent.getY();
        invalidate();
        return true;
    }


    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
