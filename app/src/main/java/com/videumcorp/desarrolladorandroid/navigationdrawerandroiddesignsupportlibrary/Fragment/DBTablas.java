package com.videumcorp.desarrolladorandroid.navigationdrawerandroiddesignsupportlibrary.Fragment;

/**
 * Created by Boris on 28-10-2015.
 */
public class DBTablas {

    public static final String TABLE_NAME = "tmedicamentos";
    public static final String FIELD_ID = "_id";
    public static final String FIELD_NOMBRE = "nombre";
    public static final String FIELD_DOSIS_TOTALES = "dosis_totales";
    public static final String FIELD_CONSUMO_POR_DOSIS = "dosis";
    public static final String FIELD_HORARIOS_DOSIS = "horario_dosis";
    public static final String FIELD_FECHA_RECETA = "fecha_receta";
    public static final String CREATE_DB_TABLE = "create table " + TABLE_NAME + "( " +
                                                  FIELD_ID + " integer primary key autoincrement," +
                                                  FIELD_NOMBRE + " text," +
                                                  FIELD_DOSIS_TOTALES + " integer," +
                                                  FIELD_CONSUMO_POR_DOSIS + " integer," +
                                                  FIELD_HORARIOS_DOSIS + " integer," +
                                                  FIELD_FECHA_RECETA + " text" +
                                                  " );";


    private int id;
    private String nombre;
    private int dosis_totales;
    private int dosis;
    private int horario_dosis;
    private String fecha_receta;


    public DBTablas(String fecha_receta, int horario_dosis, int dosis, int dosis_totales, String nombre) {
        this.fecha_receta = fecha_receta;
        this.horario_dosis = horario_dosis;
        this.dosis = dosis;
        this.dosis_totales = dosis_totales;
        this.nombre = nombre;
    }

    public DBTablas()
    {

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDosis_totales() {
        return dosis_totales;
    }

    public int getDosis() {
        return dosis;
    }

    public int getHorario_dosis() {
        return horario_dosis;
    }

    public String getFecha_receta() {
        return fecha_receta;
    }
}
