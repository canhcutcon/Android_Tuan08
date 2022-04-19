package com.example.android_tuan8;

import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandle extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "UserManager";
    private static final String TABLE_CONTACTS = "users";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";

}
