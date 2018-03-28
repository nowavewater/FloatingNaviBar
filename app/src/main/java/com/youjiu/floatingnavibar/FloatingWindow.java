package com.youjiu.floatingnavibar;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import wei.mark.standout.StandOutWindow;
import wei.mark.standout.constants.StandOutFlags;
import wei.mark.standout.ui.Window;

/**
 * Created by ypc on 3/28/2018.
 */

public class FloatingWindow extends StandOutWindow {
    @Override
    public String getAppName() {
        return "浮动控制台";
    }

    @Override
    public int getAppIcon() {
        return 0;
    }

    @Override
    public void createAndAttachView(int id, FrameLayout frame) {


        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = null;
        if (inflater != null) {
            view = inflater.inflate(R.layout.float_body, frame, true);
        }

        setupWidgets();


    }

    // move the window by dragging the view
    @Override
    public int getFlags(int id) {
        return super.getFlags(id) | StandOutFlags.FLAG_BODY_MOVE_ENABLE
                | StandOutFlags.FLAG_WINDOW_FOCUSABLE_DISABLE;
    }

    @Override
    public StandOutLayoutParams getParams(int id, Window window) {
        return new StandOutLayoutParams(id, StandOutLayoutParams.MATCH_PARENT, StandOutLayoutParams.WRAP_CONTENT,
                StandOutLayoutParams.LEFT, StandOutLayoutParams.CENTER);
    }

    @Override
    public String getPersistentNotificationMessage(int id) {
        return "点我关闭";
    }

    @Override
    public Intent getPersistentNotificationIntent(int id) {
        return StandOutWindow.getCloseIntent(this, FloatingWindow.class, id);
    }

    @Override
    public boolean onTouchBody(int id, Window window, View view, MotionEvent event) {
        return super.onTouchBody(id, window, view, event);
    }

    public void setupWidgets(){



        


    }
}
