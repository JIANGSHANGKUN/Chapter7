package com.example.android.chapter7;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by JSK on 2017/7/13.
 */

public class DrawView extends View {
    public DrawView(Context context) {
        this(context, null);
    }

    public DrawView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);

        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
//        paint.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(10);

//        Shader shader = new LinearGradient(20,20,20,40,new int[]{Color.RED,Color.BLUE,Color.BLACK},null, Shader.TileMode.REPEAT);
        // 设置颜色渐变，变换的方向为起点到终点的方向，一次变换由起点到终点结束
        // float positions[] 是定义每个颜色处于的渐变相对位置，这个参数可以为null，如果为null表示所有的颜色按顺序均匀的分布
        // TileMode tile
        // Shader.TileMode.CLAMP，终点之后颜色为最终的颜色，
        // Shader.TileMode.REPEAT，终点之后颜色重新开始变换，
        // Shader.TileMode.MIRROR，终点之后颜色翻转变换（从最终颜色开始），
//        Shader shader = new LinearGradient(0,0,getWidth(),0,new int[]{Color.RED,Color.BLUE,Color.BLACK},null, Shader.TileMode.CLAMP);
//        paint.setShader(shader);
//
//        paint.setShadowLayer(45,20,20,Color.RED);
//
//        int width = getWidth();
//
//        //画圆
//        canvas.drawCircle(width / 10 + 10, width / 10 + 10, width / 10, paint);
//        //正方形
//        canvas.drawRect(10,width/5+30,width/5,width/5+30+width/5,paint);
//        //矩形
//        Rect rect = new Rect(10,width/5+width/5+70,width/5,width/2+70);
//        canvas.drawRect(rect,paint);
//        //圆角矩形
//        RectF rectF = new RectF(10,width/2+90,width/5,width*7/10);
//        canvas.drawRoundRect(rectF,15,15,paint);
//        //椭圆
//        rectF = new RectF(10,width*7/10+20,width/5,width*8/10+10);
//        canvas.drawOval(rectF,paint);
//
//        Path path = new Path();
//        //移动起点大
//        path.moveTo(10, 10);
//        //划线到
//        path.lineTo(width / 2, width / 2);
//        //由上一个结束点
//        path.lineTo(width, width / 2);
//        //回到起点
//        path.close();
//        canvas.drawPath(path, paint);

//        Path path = new Path();
//        RectF rectF = new RectF(100, 100, width / 2 + 100, width / 2 + 100);
//        Rect rect = new Rect(100, 100, width / 2 + 100, width / 2 + 100);
//        canvas.drawRect(rect, paint);


//        path.moveTo(0, 0);
//        path.arcTo(rectF,0,90);//和moveTo配合使用,从移动的起点到圆弧的起点，划线然后画弧

//        path.addArc(rectF, 0, 90);

//        path.moveTo(40,40);
//        path.quadTo(700,700,200,0);//画平滑弧线，贝塞尔曲线

//        Diection.CCW 逆时针方向
//        Diection.CW 顺时针方向
//        path.addCircle(width/2,width/2,width/2, Path.Direction.CCW);//画圆

//        RectF rectF = new RectF(width/4,width/4,width/2,width/3);
//        path.addOval(rectF, Path.Direction.CCW);//椭圆

//        path.lineTo(100,100);
//        path.lineTo(200,100);
//        path.lineTo(300,200);
//        path.addPath(path,200,0);//将path在X，Y方向上平移
//        canvas.drawPath(path, paint);

//        paint.setTextSize(40);
//        paint.setStrokeWidth(5);
//        paint.setTextAlign(Paint.Align.CENTER);//为CENTER时，X点为整个字符窜的中点
//        paint.setTextAlign(Paint.Align.LEFT);//LEFT时为左起点
//        paint.setTextAlign(Paint.Align.RIGHT);//RIGHT时为右起点
        //Y值为Baseline的位置
//        canvas.drawText("fghijk", getWidth() / 2, 400, paint);

//        paint.setStyle(Paint.Style.STROKE);//设置为Paint.Style.STROKE才能用Path画单一的线
//        paint.setColor(Color.RED);
//        Path path = new Path();
//        path.moveTo(getWidth() / 2, 400);
//        path.lineTo(getWidth() / 2, 100);
//        canvas.drawPath(path, paint);
//
//        paint.setColor(Color.YELLOW);
//        path.reset();//重置
//        path.moveTo(0,400);
//        path.lineTo(getWidth(),400);
//        canvas.drawPath(path, paint);
//
//        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
//        path.reset();//重置
//        path.moveTo(0,fontMetricsInt.bottom);
//        path.lineTo(getWidth(),fontMetricsInt.bottom);
//        paint.setColor(Color.BLUE);
//        canvas.drawPath(path, paint);
//
//        path.reset();//重置
//        path.moveTo(0,fontMetricsInt.top);
//        path.lineTo(getWidth(),fontMetricsInt.top);
//        paint.setColor(Color.GREEN);
//        canvas.drawPath(path, paint);

//        canvas.drawRect(0,0,400,400,paint);
//        canvas.translate(400,400);//平移，将绘图的基准点分别在XY方向上移动
//        canvas.drawRect(0,0,400,400,paint);

//        canvas.drawColor(Color.RED);
//        canvas.drawRect(0,0,400,400,paint);
//        canvas.save();//保存当前的canvas状态
////        canvas.scale(0.5f,0.5f);//以基点为准，缩放X与Y的比例
//        canvas.scale(0.5f,0.5f,200,200);//以px,py为基点，缩放X与Y的比例
//        paint.setColor(Color.YELLOW);
//        canvas.drawRect(0,0,400,400,paint);
//        canvas.restore();//取出之前保存的canvas状态

//        canvas.drawRect(0,0,400,400,paint);
////        canvas.rotate(45);//以基点旋转degrees度
//        canvas.rotate(20,400,400);//以px,py为基点，顺时针旋转degrees度
//        paint.setColor(Color.YELLOW);
//        canvas.drawRect(0,0,400,400,paint);

//        canvas.drawRect(0,0,400,400,paint);
////        canvas.skew(0.1f,0);//沿X轴方向倾斜tan 0.1f 的角度
////        canvas.skew(0,0.1f);//沿Y轴方向倾斜
//        canvas.skew(0.1f,0.1f);//沿Y轴方向倾斜
//        paint.setColor(Color.YELLOW);
//        canvas.drawRect(0,0,400,400,paint);
//        canvas.restore();
//        canvas.skew(0,1);
//        paint.setColor(Color.RED);
//        canvas.drawRect(0,0,400,400,paint);

//        paint.setStyle(Paint.Style.STROKE);
//        Path path = new Path();
//
//        paint.setPathEffect(null);
//        path.moveTo(0, 50);
//        path.lineTo(200, 100);
//        path.lineTo(400, 50);
//        path.lineTo(600, 100);
//        canvas.drawPath(path, paint);
//
//
//        CornerPathEffect cornerPathEffect = new CornerPathEffect(40);//路径撞角圆滑
//        paint.setPathEffect(cornerPathEffect);
//        path.reset();
//        path.moveTo(0, 150);
//        path.lineTo(200, 200);
//        path.lineTo(400, 150);
//        path.lineTo(600, 200);
//        canvas.drawPath(path, paint);
//
//        DiscretePathEffect discretePathEffect = new DiscretePathEffect(2,10);//每隔segmentLength距离，就会出现一个偏离原路径的点，距离原路径小于等于deviation
//        paint.setPathEffect(discretePathEffect);
//        path.reset();
//        path.moveTo(0, 250);
//        path.lineTo(200, 300);
//        path.lineTo(400, 250);
//        path.lineTo(600, 300);
//        canvas.drawPath(path, paint);
//
//        //绘制间断线，intervals[]中元素分别为 实线、虚线、实线、虚线...的长度，数组长度必须>=2,phase为偏移量，开始绘制断点的距离为第一条实线的长度减去phase
//        //可以通过改变phase的值来实现动画效果
//        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{40,10},40);
//        paint.setPathEffect(dashPathEffect);
//        path.reset();
//        path.moveTo(0, 350);
//        path.lineTo(200, 400);
//        path.lineTo(400, 350);
//        path.lineTo(600, 400);
//        canvas.drawPath(path, paint);
//
//        path.addRect(0,0,20,20, Path.Direction.CCW);
//        //绘制间断线，实线部分图像为设置的shape，advance为每个图像间的距离，
//        // style TRANSLATE水平平移
//        //       MORPH沿着path方向平移
//        //       ROTATE rotate the shape about its center
////        PathDashPathEffect pathDashPathEffect = new PathDashPathEffect(path,30,20, PathDashPathEffect.Style.TRANSLATE);
////        PathDashPathEffect pathDashPathEffect = new PathDashPathEffect(path,30,20, PathDashPathEffect.Style.MORPH);
//        PathDashPathEffect pathDashPathEffect = new PathDashPathEffect(path,30,20, PathDashPathEffect.Style.ROTATE);
//        paint.setPathEffect(pathDashPathEffect);
//        path.reset();
//        path.moveTo(0, 450);
//        path.lineTo(200, 500);
//        path.lineTo(400, 450);
//        path.lineTo(600, 500);
//        canvas.drawPath(path, paint);
//
//
////        ComposePathEffect和SumPathEffect都可以用来组合两种路径效果，就是把两种效果二合一。唯一不同的是组合的方式：
////        ComposePathEffect(PathEffect outerpe, PathEffect innerpe)会先将路径变成innerpe的效果，再去复合outerpe的路径效果，即：outerpe(innerpe(Path))；
////        SumPathEffect(PathEffect first, PathEffect second)则会把两种路径效果加起来再作用于路径。
//
//        ComposePathEffect composePathEffect = new ComposePathEffect(discretePathEffect,pathDashPathEffect);
//        paint.setPathEffect(composePathEffect);
//        path.reset();
//        path.moveTo(0, 550);
//        path.lineTo(200, 600);
//        path.lineTo(400, 550);
//        path.lineTo(600, 600);
//        canvas.drawPath(path, paint);
//
//        SumPathEffect sumPathEffect = new SumPathEffect(discretePathEffect,pathDashPathEffect);
//        paint.setPathEffect(sumPathEffect);
//        path.reset();
//        path.moveTo(0, 650);
//        path.lineTo(200, 700);
//        path.lineTo(400, 650);
//        path.lineTo(600, 700);
//        canvas.drawPath(path, paint);

        paint.setStrokeWidth(5);
        paint.setTextSize(40);
        paint.setStyle(Paint.Style.STROKE);
        Path path = new Path();
        path.addCircle(getWidth()/2,getWidth()/2,getWidth()/4, Path.Direction.CW);//顺时针，文字会在路径外部
        canvas.drawPath(path, paint);
        //沿路径绘制文字,
        // hOffset X方向上的偏移量,离绘制起点的沿路径的水平方向上的距离
        // vOffset Y方向上的偏移量,离绘制起点的沿路径的竖直方向上的距离
        canvas.drawTextOnPath("canvas.drawTextOnPath",path,100,-20,paint);


    }
}
