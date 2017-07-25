package com.amirarcane.lockscreen.andrognito.pinlockview;

import android.graphics.drawable.Drawable;

/**
 * The customization options for the buttons in {@link PinLockView}
 * passed to the {@link PinLockAdapter} to decorate the individual views
 *
 * Created by aritraroy on 01/06/16.
 */
public class CustomizationOptionsBundle {

    private int textColor;
    private int textSize;
    private int buttonSize;
    private Drawable buttonBackgroundDrawable;
    private Drawable deleteButtonDrawable;
    private int deleteButtonWidthSize, deleteButtonHeightSize;
    private boolean showDeleteButton;
    private int deleteButtonPressesColor;

    public CustomizationOptionsBundle() {
    }

    public int getTextColor() {
        return textColor;
    }

    public void setTextColor(int textColor) {
        this.textColor = textColor;
    }

    public int getTextSize() {
        return textSize;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public int getButtonSize() {
        return buttonSize;
    }

    public void setButtonSize(int buttonSize) {
        this.buttonSize = buttonSize;
    }

    public Drawable getButtonBackgroundDrawable() {
        return buttonBackgroundDrawable;
    }

    public void setButtonBackgroundDrawable(Drawable buttonBackgroundDrawable) {
        this.buttonBackgroundDrawable = buttonBackgroundDrawable;
    }

    public Drawable getDeleteButtonDrawable() {
        return deleteButtonDrawable;
    }

    public void setDeleteButtonDrawable(Drawable deleteButtonDrawable) {
        this.deleteButtonDrawable = deleteButtonDrawable;
    }

    public int getDeleteButtonWidthSize() {
        return deleteButtonWidthSize;
    }

    public int getDeleteButtonHeightSize() {
        return deleteButtonHeightSize;
    }

    public void setDeleteButtonWidthSize(int deleteButtonWidthSize) {
        this.deleteButtonWidthSize = deleteButtonWidthSize;
    }

    public void setDeleteButtonHeightSize(int deleteButtonHeightSize) {
        this.deleteButtonHeightSize = deleteButtonHeightSize;
    }

    public boolean isShowDeleteButton() {
        return showDeleteButton;
    }

    public void setShowDeleteButton(boolean showDeleteButton) {
        this.showDeleteButton = showDeleteButton;
    }

    public int getDeleteButtonPressesColor() {
        return deleteButtonPressesColor;
    }

    public void setDeleteButtonPressesColor(int deleteButtonPressesColor) {
        this.deleteButtonPressesColor = deleteButtonPressesColor;
    }
}
