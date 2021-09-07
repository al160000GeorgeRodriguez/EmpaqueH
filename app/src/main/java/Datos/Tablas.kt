package Datos
import androidx.room.Entity

@Entity(tableName="empaque")
class Tablas(
    @PrimaryKey(autoGenerate=true)
    val ID:Int=0,
    val MODELO:String,
    val QTYXPALLET:String,
    val SHIPTO:String,
    val QTYXCAJA:String,
    val EMPAQUE:String,
    val PARTICION:String,
    val SPKRPP:String,
    val QTYO:String,
    val BOX:String,
    val PAD:String,
    val TAPA:String,
    val EXTRA:String,
    val PALLET:String,
    val ESQUINERO:String,
    val CELULA:String,
    val LINEA:String
):Serializable


/*import android.os.Parcel
import android.os.Parcelable

@Entity(tableName="tabla")

class Tablas() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    abstract class Empaque{
        companion object{
            val NTABLA="pi"

            val ID="_id"
            val MODELO="modelo"
            val QTYXPALLET="qtyxpallet"
            val SHIPTO="shipto"
            val QTYXCAJA="qtyxcaja"
            val EMPAQUE="empaque"
            val PARTICION=""
            val SPKRPP="spkrpp"
            val QTYO="qtyo"
            val BOX="box"
            val PAD="pad"
            val TAPA="tapa"
            val EXTRA="extra"
            val PALLET="pallet"
            val ESQUINERO="esquinero"
            val CELULA="celula"
            val LINEA="linea"
            var empaque:MutableList<Empaque>=ArrayList()


        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    /*companion object CREATOR : Parcelable.Creator<Tablas> {
        override fun createFromParcel(parcel: Parcel): Tablas {
            return Tablas(parcel)
        }

        override fun newArray(size: Int): Array<Tablas?> {
            return arrayOfNulls(size)
        }
    }*/
} */