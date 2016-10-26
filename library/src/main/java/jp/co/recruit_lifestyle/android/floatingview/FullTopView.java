package jp.co.recruit_lifestyle.android.floatingview;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/**
 * Created by Alexandr Timoshenko <thick.tav@gmail.com> on 6/2/16.
 */
public class FullTopView extends FrameLayout {

    public FullTopView(Context context) {
        super(context);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }
}
