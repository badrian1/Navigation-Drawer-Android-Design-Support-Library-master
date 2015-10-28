package com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrary;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrary.Fragment.DBTablas;

/**
 * Created by Boris on 28-10-2015.
 */
public class BaseDatos extends SQLiteOpenHelper {

    private static final String DB_NAME = "dbmedi";
    private static final int SCHEME_VERSION = 1 ;
    private SQLiteDatabase db;

    public BaseDatos(Context context) {
        super(context, DB_NAME, null,SCHEME_VERSION);
        db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBTablas.CREATE_DB_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
