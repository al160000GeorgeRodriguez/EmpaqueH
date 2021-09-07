import Datos.Tablas
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface TablaDao {
@Query("SELECT * FROM empaque")
fun getAll(): LiveData<List<Tablas>>
@Query("SELECT * FROM empaque WHERE idEmpaque=:ID")
fun get(ID:Int):LiveData<Tablas>
@Insert
fun insertAll(vararg empaques:Tablas)
@Update
fun update(empaques: Tablas)
}