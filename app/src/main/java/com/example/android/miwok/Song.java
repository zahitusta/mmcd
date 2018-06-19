package com.example.android.miwok;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * {@link Song} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Song implements Parcelable {

    /**
     * Default translation of the word.
     */
    private String SongName;

    /**
     * Miwok translation of the word
     */
    private String SingerName;

    private int ImageResourceId;

    /**
     * Constructor-creates a new word object.
     *
     * @param songName        is the word in Miwok Language
     * @param singerName      is the word in a language the user is already familiar with.
     * @param imageresourceId is the word in a language the user is already familiar with.
     */

    public Song(String songName, String singerName, int imageresourceId) {
        SongName = songName;
        SingerName = singerName;
        ImageResourceId = imageresourceId;
    }

    public Song(int note, int note1, int note2) {
    }

    /**
     * get the default translation of the word.
     *
     * @return String type
     */
    public String getSongName() {
        return SongName;
    }

    /**
     * get the Miwok translation of the word
     *
     * @return String type
     */
    public String getSingerName() {
        return SingerName;
    }

    public int getImageResourceID() {
        return ImageResourceId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    //write object values to parcel for storage
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(SongName);
        dest.writeString(SingerName);
        dest.writeInt(ImageResourceId);

    }

    //constructor used for parcel
    public Song(Parcel parcel) {
        SongName = parcel.readString();
        SingerName = parcel.readString();
        ImageResourceId = parcel.readInt();
    }

    //used when un-parceling our parcel (creating the object)
    public static final Parcelable.Creator<Song> CREATOR = new Parcelable.Creator<Song>() {

        @Override
        public Song createFromParcel(Parcel parcel) {
            return new Song(parcel);
        }

        @Override
        public Song[] newArray(int size) {
            return new Song[size];
        }
    };

}
