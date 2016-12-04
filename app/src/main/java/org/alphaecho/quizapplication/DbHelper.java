package org.alphaecho.quizapplication;

/**
 * Created by Arta on 12/4/2016.
 */
import java.util.ArrayList;
import java.util.Random;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper  extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 1;

    // emri i databazes

    public static final String DATABASE_NAME = "Kuizi";

    // emri i tabeles se databazes
    private static final String GAMES_LOGIN="LogIn";

    // emrat e kolonave
    private static final String GAMES_IDL="id";
    private static final String GAMES_USER="Useri";
    private static final String GAMES_PASS="Fjalekalimi";


    private static final String TABLE_QUEST = "Pyetjet";

    // emrat e kolonave te tabeles se perdorur ne databaz

    public static final String KEY_ID = "id";
    public static final String KEY_QUES = "pyetja";
    public static final String KEY_ANSWER = "pergjigjja"; // osioni i sakt
    public static final String KEY_OPTA= "opsa"; // opsioni a
    public static final String KEY_OPTB= "opsb"; // opsioni b
    public static final String KEY_OPTC= "opsc"; // opsioni c



    // emri tabeles per statistika

    public static final String TABLE_STATISTIKA="Statistika";


    // emrat e kolonave

    public static final String KEY_IDS = "id";
    public static final String GAMES_PLAYED = "games_played";
    public static final String GAMES_WONE = "Fitoret";
    public static final String GAMES_LOST="Humbjet";
    public static final String GAMES_BESTTIME="Best_Time";
    public static final String GAMES_HIGHSCORE="Piket_max";




    SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, "+ KEY_OPTA +" TEXT, "
                +KEY_OPTB +" TEXT, " + KEY_OPTC + " TEXT)";
        try {
            db.execSQL(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql_user = "CREATE TABLE IF NOT EXISTS " + GAMES_LOGIN + " ( "
                + GAMES_IDL+ " INTEGER PRIMARY KEY AUTOINCREMENT, " + GAMES_USER
                + " INTEGER, " +GAMES_PASS  + " INTEGER)";
        try {
            db.execSQL(sql_user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql_stats = "CREATE TABLE IF NOT EXISTS " + TABLE_STATISTIKA + " ( "
                + KEY_IDS + " INTEGER PRIMARY KEY AUTOINCREMENT, " + GAMES_PLAYED
                + " INTEGER, " + GAMES_WONE + " INTEGER, "+ GAMES_LOST +" INTEGER, "
                + GAMES_BESTTIME +" FLOAT, " + GAMES_HIGHSCORE + " FLOAT)";
        try {
            db.execSQL(sql_stats);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}