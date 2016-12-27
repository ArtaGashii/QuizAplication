package org.alphaecho.quizapplication;

/**
 * Created by Arta on 12/4/2016.
 */
import java.util.ArrayList;
import java.util.List;
//import java.util.Random;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
//import android.database.sqlite.SQLiteDatabase.CursorFactory;

public class DbHelper  extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 1;

    // emri i databazes

    public static final String DATABASE_NAME = "Kuizi";

    // emri i tabeles se databazes
    private static final String GAMES_LOGIN = "LogIn";

    // emrat e kolonave
    private static final String GAMES_IDL = "id";
    private static final String GAMES_USER = "Useri";
    private static final String GAMES_PASS = "Fjalekalimi";


    private static final String TABLE_QUEST = "Pyetjet";

    // emrat e kolonave te tabeles se perdorur ne databaz

    public static final String KEY_ID = "id";
    public static final String KEY_QUES = "pyetja";
    public static final String KEY_ANSWER = "pergjigjja"; // osioni i sakt
    public static final String KEY_OPTA = "opsa"; // opsioni a
    public static final String KEY_OPTB = "opsb"; // opsioni b
    public static final String KEY_OPTC = "opsc"; // opsioni c


    // emri tabeles per statistika

    public static final String TABLE_STATISTIKA = "Statistika";


    // emrat e kolonave

    public static final String KEY_IDS = "id";
    public static final String GAMES_PLAYED = "games_played";
    public static final String GAMES_WONE = "Fitoret";
    public static final String GAMES_LOST = "Humbjet";
    public static final String GAMES_BESTTIME = "Best_Time";
    public static final String GAMES_HIGHSCORE = "Piket_max";


    SQLiteDatabase dbase;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        dbase = db;
        String sql = "CREATE TABLE IF NOT EXISTS " + TABLE_QUEST +
                " ( "
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_QUES
                + " TEXT, " + KEY_ANSWER + " TEXT, " + KEY_OPTA + " TEXT, "
                + KEY_OPTB + " TEXT, " + KEY_OPTC + " TEXT)";
        try {
            db.execSQL(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql_user = "CREATE TABLE IF NOT EXISTS " + GAMES_LOGIN + " ( "
                + GAMES_IDL + " INTEGER PRIMARY KEY AUTOINCREMENT, " + GAMES_USER
                + " INTEGER, " + GAMES_PASS + " INTEGER)";
        try {
            db.execSQL(sql_user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String sql_stats = "CREATE TABLE IF NOT EXISTS " + TABLE_STATISTIKA + " ( "
                + KEY_IDS + " INTEGER PRIMARY KEY AUTOINCREMENT, " + GAMES_PLAYED
                + " INTEGER, " + GAMES_WONE + " INTEGER, " + GAMES_LOST + " INTEGER, "
                + GAMES_BESTTIME + " FLOAT, " + GAMES_HIGHSCORE + " FLOAT)";
        try {
            db.execSQL(sql_stats);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        // fshije tabelen ne qoftese ekziston

        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_QUEST);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + GAMES_LOGIN );
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_STATISTIKA);


        // krijimi i tabeles perseri

        onCreate(sqLiteDatabase);

    }
    public void addQuestions()
    {

        Question q2 = new Question("2. Cila nga kjo list eshte " +
                "sistem opertativ mobil?", "Android", "Windows 8", "Ubuntu", "Android");

        Question q1 = new Question("1. Kompania me e madhja e rrjetave eshte: ","HP", "IBM", "CISCO", "CISCO");

        Question q3 = new Question("3. Cila nga keto eshte memoria kryesore?"
                ,"RAM", "FLASH","HD","RAM");

        Question q4 = new Question("4. Cila nga keto pajisje rregullon " +
                " trafikun ne internet?",	"Router", "Bridge", "Hub","Router");

        Question q5 = new Question("5. Sa eshte perqinda e perdorimit " +
                " sistemit operativ Android?","92%","80%","64%","80%");

        Question q6 = new Question("6. Me cilen gjuhe programuse " +
                "zhvillohet plaforma Android?","Java","Objective C","Python","Java");

        Question q7 = new Question("7. Cili eshte motori i kerkimit me " +
                "i suksesshem ne bote?","Bing","Google","Yahoo","Google");

        Question q8 = new Question("8. Versioni i fundit OS Android me " +
                " cilin mobil lansohet?","Samsung","LG","Nexus","Nexus");

        Question q9 = new Question("9. Cila kompani mobile eshte  " +
                " prone e Google Kompani?","Motorola","HTC","Iphone","Motorola");

        Question q10 =new Question("10. Cka e dallon SO Android nga  " +
                " sistemet operativ tjer?","Me pages","Close Source","Open Source","Open Source");

        Question q11 = new Question("11. Cila nga kjo list eshte " +
                "sistem opertativ mobil?", "Android", "Windows 8", "Ubuntu", "Android");

        Question q12 = new Question("12. Kompania me e madhja e rrjetave eshte: ","HP", "IBM", "CISCO", "CISCO");

        Question q13 = new Question("13. Cila nga keto eshte memoria kryesore?"
                ,"RAM", "FLASH","HD","RAM");

        Question q14 = new Question("14. Cila nga keto pajisje rregullon " +
                " trafikun ne internet?",	"Router", "Bridge", "Hub","Router");

        Question q15 = new Question("15. Sa eshte perqinda e perdorimit " +
                " sistemit operativ Android?","92%","80%","64%","80%");

        Question q16 = new Question("16. Me cilen gjuhe programuse " +
                "zhvillohet plaforma Android?","Java","Objective C","Python","Java");

        Question q17 = new Question("17. Cili eshte motori i kerkimit me " +
                "i suksesshem ne bote?","Bing","Google","Yahoo","Google");

        Question q18 = new Question("18. Versioni i fundit OS Android me " +
                " cilin mobil lansohet?","Samsung","LG","Nexus","Nexus");

        Question q19 = new Question("19. Cila kompani mobile eshte  " +
                " prone e Google Kompani?","Motorola","HTC","Iphone","Motorola");

        Question q20 =new Question("20. Cka e dallon SO Android nga  " +
                " sistemet operativ tjer?","Me pages","Close Source","Open Source","Open Source");

        this.addQuestion(q1);
        this.addQuestion(q2);
        this.addQuestion(q3);
        this.addQuestion(q4);
        this.addQuestion(q5);
        this.addQuestion(q6);
        this.addQuestion(q7);
        this.addQuestion(q8);
        this.addQuestion(q9);
        this.addQuestion(q10);
        this.addQuestion(q11);
        this.addQuestion(q12);
        this.addQuestion(q13);
        this.addQuestion(q14);
        this.addQuestion(q15);
        this.addQuestion(q16);
        this.addQuestion(q17);
        this.addQuestion(q18);
        this.addQuestion(q19);
        this.addQuestion(q20);
    }

    // shtimi i pyetjeve te reja

    public void addQuestion(Question quest) {

        ContentValues values = new ContentValues();
        values.put(KEY_QUES, quest.getPYETJA());
        values.put(KEY_ANSWER, quest.getPERGJIGJJA());
        values.put(KEY_OPTA, quest.getOPSA());
        values.put(KEY_OPTB, quest.getOPSB());
        values.put(KEY_OPTC, quest.getOPSC());

        // insertimi i rreshtave te ri

        dbase.insert(TABLE_QUEST, null, values);
    }

    public List<Question> getAllQuestions() {

        List<Question> quesList = new ArrayList<Question>();

        // selektimi i te gjitha Query

        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        dbase=this.getReadableDatabase();
        Cursor cursor = dbase.rawQuery(selectQuery, null);

        // shtimi ne unaz i kolonave duke i shtuar ne list

        if (cursor.moveToFirst()) {
            do {
                Question quest = new Question();
                quest.setID(cursor.getInt(0));
                quest.setPYETJA(cursor.getString(1));
                quest.setPERGJIGJJA(cursor.getString(2));
                quest.setOPSA(cursor.getString(3));
                quest.setOPSB(cursor.getString(4));
                quest.setOPSC(cursor.getString(5));
                quesList.add(quest);
            } while (cursor.moveToNext());
        }
        // kthimi i listes me pyetje dhe pergjigjje
        return quesList;
    }
    public int rowcount()
    {
        int row = 0;
        String selectQuery = "SELECT  * FROM " + TABLE_QUEST;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);
        row = cursor.getCount();
        return row;
    }
}



