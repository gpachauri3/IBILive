package com.example.gaurav.ibilive.modelDiscover;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gaurav on 4/5/17.
 */

public class ModelDiscover implements Parcelable {
    public static final Parcelable.Creator<ModelDiscover> CREATOR = new Parcelable.Creator<ModelDiscover>() {
        @Override
        public ModelDiscover createFromParcel(final Parcel in) {
            return new ModelDiscover(in);
        }

        @Override
        public ModelDiscover[] newArray(final int size) {
            return new ModelDiscover[size];
        }
    };

    private int img;
    private String text;


    /**
     * @param in unput variable
     */
    protected ModelDiscover(final Parcel in) {

        img = in.readInt();
        text = in.readString();
    }

    /**
     * @param image image is passed in constructor
     * @param text  text  is passed in constructor
     */
    public ModelDiscover(final int image, final String text) {
        this.img = image;
        this.text = text;
    }

    /**
     * @return zero
     */
    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * @return image
     */
    public int getImg() {
        return img;
    }

    /**
     * @return text (label)
     */
    public String getText() {
        return text;
    }

    /**
     * @param dest  write values here
     * @param flags give flag value
     */
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeInt(img);
        dest.writeString(text);
    }


}


