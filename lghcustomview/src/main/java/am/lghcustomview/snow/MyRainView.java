package am.lghcustomview.snow;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;

import am.lghcustomview.base.ShowView;

/**
 * Created by LinGuanHong on 2017/1/15.
 */

public class MyRainView extends ShowView<SnowItem> {


    public MyRainView(Context context) {
        super(context);
    }

    public MyRainView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void beforeLogicLoop() {

    }

    @Override
    public SnowItem getItem(int width, int height, Resources resources) {
        return new SnowItem(width,height,resources);
    }

    @Override
    public int getCount() {
        return 15;
    }
}
