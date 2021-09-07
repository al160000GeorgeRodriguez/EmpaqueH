import Datos.Tablas
import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entites=[Tablas::class], version=1)
abstract class AppDatabase:RoomDatabase(){
    abstract fun empaques():TablaDao
    companion object{
        @Volatile
        private var INSTANCE:AppDatabase?=null
        fun getDatabase(context: Context):AppDatabase{
            val tempInstance= INSTANCE
            if(tempInstance!=null){
                return tempInstance
            }
            synchronized(this){
                val instance=Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE=instance
                return instance
            }


        }
    }
}
/*package Datos

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.P)
class DataDB (context: Context, name: String?, version: Int, openParams: SQLiteDatabase.OpenParams):
    SQLiteOpenHelper(context, name, version, openParams) {

private val db:SQLiteDatabase
private val values: ContentValues
companion object{
    private val version=1
    private val name="miEmpaque"
}
init {
    db=this.writableDatabase
    values= ContentValues()
}
    override fun onCreate(db: SQLiteDatabase?) {
db!!.execSQL("CREATE TABLE "+ Tablas.Empaque.NTABLA+" ("+
        Tablas.Empaque.ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
        Tablas.Empaque.MODELO+" TEXT NOT NULL,"+
        Tablas.Empaque.BOX+" TEXT NOT NULL,"+
        Tablas.Empaque.CELULA +" TEXT NOT NULL,"+
        Tablas.Empaque.EMPAQUE+" TEXT NOT NULL,"+
        Tablas.Empaque.ESQUINERO+" TEXT NOT NULL,"+
        Tablas.Empaque.EXTRA+" TEXT NOT NULL,"+
        Tablas.Empaque.LINEA+" TEXT NOT NULL,"+
        Tablas.Empaque.PAD+" TEXT NOT NULL,"+
        Tablas.Empaque.PALLET+" TEXT NOT NULL,"+
        Tablas.Empaque.PARTICION+" TEXT NOT NULL,"+
        Tablas.Empaque.QTYO+" TEXT NOT NULL,"+
        Tablas.Empaque.QTYXCAJA+" TEXT NOT NULL,"+
        Tablas.Empaque.QTYXPALLET+" TEXT NOT NULL,"+
        Tablas.Empaque.SHIPTO+" TEXT NOT NULL,"+
        Tablas.Empaque.SPKRPP+" TEXT NOT NULL,"+
        Tablas.Empaque.TAPA+" TEXT NOT NULL)")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }
    fun insert(empaque: List<Tablas.Empaque>){
        values.put(Tablas.Empaque.MODELO,empaque[0].getModelo())
        values.put(Tablas.Empaque.ID,empaque[0].getId())
        values.put(Tablas.Empaque.BOX,empaque[0].getBox())
        values.put(Tablas.Empaque.CELULA,empaque[0].getCelula())
        values.put(Tablas.Empaque.EMPAQUE,empaque[0].getEmpaque())
        values.put(Tablas.Empaque.ESQUINERO,empaque[0].getEsquinero())
        values.put(Tablas.Empaque.EXTRA,empaque[0].getExtra())
        values.put(Tablas.Empaque.LINEA,empaque[0].getLinea())
        values.put(Tablas.Empaque.PAD,empaque[0].getPad())
        values.put(Tablas.Empaque.PALLET,empaque[0].getPallet())
        values.put(Tablas.Empaque.PARTICION,empaque[0].getParticion())
        values.put(Tablas.Empaque.QTYO,empaque[0].getQtyo())
        values.put(Tablas.Empaque.QTYXCAJA,empaque[0].getQtyxcaja())
        values.put(Tablas.Empaque.QTYXPALLET,empaque[0].getQtyxpallet())
        values.put(Tablas.Empaque.SHIPTO,empaque[0].getShipto())
        values.put(Tablas.Empaque.SPKRPP,empaque[0].getSpkrpp())
        values.put(Tablas.Empaque.TAPA,empaque[0].getTapa())
        db.insert(Tablas.Empaque.NTABLA,null,values)

    }
    fun getData():MutableList<Tablas.Empaque>{
Tablas.Empaque.empaque.clear()
        val columnas=arrayOf(Tablas.Empaque.ID,Tablas.Empaque.MODELO,Tablas.Empaque.BOX,Tablas.Empaque.CELULA,Tablas.Empaque.EMPAQUE,Tablas.Empaque.ESQUINERO)
    val c=db.query(Tablas.Empaque.NTABLA,columnas,null,null,null,null,null)
        if(c.moveToFirst()){
            
        }
    }
}

 */